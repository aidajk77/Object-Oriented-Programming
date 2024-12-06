package lab10.task1;

@UserPermission()
public class RegularUser extends User {
    public RegularUser(String username) {
        super(username);
    }
}
