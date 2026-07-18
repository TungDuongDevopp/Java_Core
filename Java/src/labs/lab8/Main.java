package labs.lab8;

public class Main {
    public static void main(String[] args) {
        Student stIT = new ITStudent("1","Dương",22,"CNTT",9.2,8.9);
        Student stMC = new MechanicalStudent("2","Tuất",21,"CK",8.5,8.9);

        System.out.println("Thông tin sinh viên IT: ");
        System.out.println(stIT);
        System.out.println("Thông tin sinh viên MC: ");
        System.out.println(stMC);
    }
}
