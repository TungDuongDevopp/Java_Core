package labs;
import utils.validator.ValidationInput;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("""
    +-----------------------------------------+
    | Mời bạn chọn chức năng:                 |
    +-----------------------------------------+
    | 1. Tìm nghiệm phương trình bậc nhất     |
    | 2. Tìm nghiệm phương trình bậc hai      |
    | 3. Tính tiền điện                       |
    | 4. Thoát                                |
    +-----------------------------------------+
    """);
        menuLoop: while(true){
            int choice =  ValidationInput.getValidInt("Mời bạn nhập số: ",1,4);
            switch (choice){
                case 1:
                    int a,b;
                    a = ValidationInput.getValidInt("Mời bạn nhập só thứ nhất: ");
                    b = ValidationInput.getValidInt("Mời bạn nhập só thứ hai: ");
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
                    a1 = ValidationInput.getValidInt("Mời bạn nhập só thứ nhất: ");
                    b1 = ValidationInput.getValidInt("Mời bạn nhập só thứ hai: ");
                    c1 = ValidationInput.getValidInt("Mời bạn nhập só thứ ba: ");
                    timNghiemBacHai(a1,b1,c1);
                    break;
                case 3:
                    int soDien;
                    soDien = ValidationInput.getValidInt("Mời bạn nhập số điện: ",0);
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

