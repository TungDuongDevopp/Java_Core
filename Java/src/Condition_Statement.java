import java.util.Scanner;

public class Condition_Statement {
    public static void main(String[] args) {
        // Điều kiện if-else nếu a thì làm này, nếu b thì làm thế kia
        int age = 18;
        if(age>=18) System.out.println("Bạn được vào bar");
        else System.out.println("Bạn không được vào bar");
        // Điều kiện if - else if -else nếu có nhiều điều kiện
        int GPA = 8;
        if(GPA>=8 && GPA<=10) System.out.println("Bạn xếp hạng giỏi");
        else if (GPA<8 && GPA >=7) {
            System.out.println("Ban xếp hạng khá");
        }
        else if (GPA<7 && GPA >=5) {
            System.out.println("Ban xếp hạng trung bình");
        }
        else System.out.println("Bạn xếp hạng yếu");

        double money ;
        System.out.print("Mời bạn nhập thu nhập: ");
        Scanner sc = new Scanner(System.in);
        money = sc.nextDouble();
        if(money<10000000) System.out.println("Bạn không phải đóng thuế");
        else if (money>=10000000 && money<15000000) System.out.println("Thuế 10%");
        else if (money>=15000000 && money<30000000) System.out.println("Thuế 30%");
        else System.out.println("Thuế 50%");

        //Switch case dùng để so sánh bằng vs nhiều điều kiện cùng 1 lúc
        int month =3;
        switch (month){
            case 1,3,5,7,8,10,12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
        }
        int choice;
        System.out.println("Mời bạn nhập lựa chọn: ");
        System.out.println("|1.Cộng               |");
        System.out.println("|2.Trừ                |");
        System.out.println("|3.Nhân               |");
        System.out.println("|4.Chia               |");
        System.out.println("|0.Thoát              |");
        choice = sc.nextInt();
      switch (choice){
          case 1:
              System.out.println("Bạn đã chọn phép cộng");
              break;
          case 2:
              System.out.println("Bạn đã chọn phép trừ");
              break;
          case 3:
              System.out.println("Bạn đã chọn phép nhân");
              break;
          case 4:
              System.out.println("Bạn đã chọn phép chia");
              break;
          case 0:
              System.out.println("Bạn đã thoát chương trình");
              break;
          default:
              System.out.println("Lựa chọn không hợp lệ");
      }
    }
}
