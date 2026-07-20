package enums;

public enum Role {
    ADMIN("Quản trị"),

    USER("Người dùng"),

    STAFF("Nhân viên");

    private String displayName;

    Role(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    public boolean isAdmin(){
        return this == ADMIN;
    }
}
