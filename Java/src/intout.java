import java.util.Scanner;

public class intout {
    public static void main(String[] args) {
        int age ;
        String name;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        name = sc.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        age = sc.nextInt();


        // C1: Nối chuỗi
        System.out.println("Tên của bạn là: "+name+" Tuổi: "+age);

        // C2 dùng format
        System.out.format("Tên của bạn là: %s Tuổi: %d%n", name, age);
        sc.close();
    }
}
