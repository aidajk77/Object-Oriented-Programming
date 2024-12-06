package lab10.task1;

public class MessagingSystem {
    public static void main(String[] args) {
        AdminUser admin = new AdminUser("user1");
        RegularUser regular = new RegularUser("user2");
        admin.sendMessage();
        regular.sendMessage();
    }
}
