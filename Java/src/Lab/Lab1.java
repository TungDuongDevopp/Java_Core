package Lab;
import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//B1      String name;
//        double gpa;
//        System.out.println("Mời nhập tên: ");
//        name = sc.nextLine();
//        System.out.println("Mời nhập điểm: ");
//        gpa = sc.nextDouble();
//        System.out.format("%s có điểm %.1f",name,gpa);

//B2      double width,height,area,perimeter,min;
//        System.out.print("Nhập chiều cao: ");
//            height = sc.nextDouble();
//        System.out.print("Nhập chiều rộng: ");
//            width = sc.nextDouble();
//            area = width*height;
//            perimeter = (width+height)*2;
//            min = Math.min(width,height);
//            System.out.format("Chu vi hình chữ nhật là :%.1f",perimeter);
//            System.out.format("\nDiện tích hình chữ nhật là :%.1f",area);
//            System.out.format("\nCạnh nhỏ nhất là: %.1f",min);


            double volume;
            int a;
            System.out.print("Mời bạn nhập cạnh hình lập phương: ");
            a = sc.nextInt();
            volume = Math.pow(a,3);
            System.out.format("Thể tích hình lập phương có cạnh %d là %.1f",a,volume);


    }

}
