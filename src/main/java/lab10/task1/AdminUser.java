package lab10.task1;

@UserPermission(level="admin")
public class AdminUser extends User {
    AdminUser(String username){
        super(username);
    }

}
