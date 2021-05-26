package Task1.book;

public class Role {
    private String userName;
    private String password;
    private String roleName;

    public Role(String userName, String password, String roleName) {
        this.userName = userName;
        this.password = password;
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
