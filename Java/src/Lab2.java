import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println(">>    MỜI CHỌN TÍNH NĂNG    <<");
        System.out.println("++--------------------------++");
        System.out.println("|1. Giải phương trình bậc nhất");
        System.out.println("|2. Giải phương trình bậc hai ");
        System.out.println("|3. Tính tiền điện            ");
        System.out.println("|4. Kết thúc                  ");
        System.out.println("++--------------------------++");


        menuLoop: while(true){
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    int a,b;
                    System.out.println("Mời nhập số a: ");
                    a = sc.nextInt();
                    System.out.println("Mời nhập số b: ");
                    b = sc.nextInt();
                    double result = timNghiemBacNhat(a,b);
                    if(result==Double.POSITIVE_INFINITY) System.out.print("Phương trình vô số nghiệm!");
                    else if (result==Double.NaN) {
                        System.out.println("Phương trình vô nghiệm!");
                    }
                    else {
                        System.out.format("Phương trình có nghiệm: %f",result);
                    }
                    break;
                case 2:
                    int a1,b1,c1;
                    System.out.println("Mời nhập số a: ");
                    a1 = sc.nextInt();
                    System.out.println("Mời nhập số b: ");
                    b1 = sc.nextInt();
                    System.out.println("Mời nhập số c: ");
                    c1 = sc.nextInt();
                    timNghiemBacHai(a1,b1,c1);
                    break;

                case 3:
                    int soDien;
                    System.out.println("Mời nhập số điện");
                    soDien= sc.nextInt();
                    double sotien= tinhTienDien(soDien);
                    System.out.format("Số tiền bạn phải trả là: %.1f",sotien);
                    break;

                case 4:
                    System.out.println("Bạn đã thoát chương trình!");
                    break menuLoop;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }


    }


        static void timNghiemBacHai(int a,int b,int c){
            double delta,x1,x2;
             if(a==0) {
                double result = timNghiemBacNhat(b,c);
                if(result==Double.POSITIVE_INFINITY) System.out.print("Phương trình vô số nghiệm!");
                else if (result==Double.NaN) {
                    System.out.println("Phương trình vô nghiệm!");
                }
                else {
                    System.out.format("Phương trình có nghiệm: %f",result);
                }
             }
             else{
                 delta = b*b -4*a*c;
                 if(delta<0) System.out.print("Phương trình vô nghiệm");
                 else if (delta ==0) {
                     x1 = x2 = -(double) b/2*a;
                     System.out.format("Phương trình có nghiệm kép x1 = x2 = %f",x1);
                 }
                 else {
                     x1 = (-b + Math.sqrt(delta))/2*a;
                     x2 =  (-b - Math.sqrt(delta))/2*a;
                     System.out.format("Phương trình có nghiệm x1 = %f",x1);
                     System.out.format("Phương trình có nghiệm x2 = %f",x2);
                 }
             }

    }
        static double timNghiemBacNhat(int a, int b){
            if (a == 0) {
                if (b == 0) return Double.POSITIVE_INFINITY;
                else return Double.NaN;
            }
            return -(double) b / a;
        }
        static double tinhTienDien(int soDien){
         if(soDien<=100){
              return soDien*1000;
            }
            return  100 * 1000 + (soDien-100)*1500;


        }


   }

