package enums;

public class Main {
    public static void main(String[] args) {
        Role role = Role.USER;
        System.out.println(role.getDisplayName());
        if(role.isAdmin()){
            System.out.println("Được truy cập không hạn chế");
        }
        else {
            System.out.println("Quyền truy cập bị hạn chế");
        }
    }
}
