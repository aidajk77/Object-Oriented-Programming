package lab10.task1;


public abstract class User {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    User(String username) {
        this.username = username;
    }
    public void sendMessage() {
        UserPermission annotation = this.getClass().getAnnotation(UserPermission.class);
        String level = annotation.level();
        if(level.equals("admin")){
            System.out.println(this.username + " is an administrator");
        }else{
            System.out.println(this.username + " is restricted");
        }
    }
}
