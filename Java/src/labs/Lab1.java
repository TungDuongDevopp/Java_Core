package labs;
import utils.validator.ValidationInput;

public class Lab1 {

    public static void main(String[] args) {

        boolean isRunning = false;
        menuLoop:while (true){
            System.out.println();
            System.out.println("""
    +-----------------------------------------+
    | Mời bạn chọn chức năng:                 |
    +-----------------------------------------+
    | 1. Nhập và in thông tin sinh viên       |
    | 2. Tính chu vi diện tích hình chữ nhật  |
    | 3. Tính thể tích hình lập phương        |
    | 4. Thoát                                |
    +-----------------------------------------+
    """);
            int choice = (int) ValidationInput.getValidDouble("Mời bạn nhập số: ",1,4,true);
            switch (choice){
                case 1:
                    String name;
                    double gpa;
                    name = ValidationInput.getValidString("Mời nhập têm: ");
                    gpa = ValidationInput.getValidDouble("\nMời nhập điểm: ",0,10,false);
                    System.out.format("\n%s có điểm %.1f",name,gpa);
                    break;
                case 2:
                    double width,height,area,perimeter;
                    height= ValidationInput.getValidDouble("Mời nhập chiều dài hình chữ nhật: ",0,false);
                    width= ValidationInput.getValidDouble("\nMời nhập chiều rộng hình chữ nhật: ",0,false);
                    area = getArea(width,height);
                    perimeter = getPerimeter(width,height);
                    System.out.format("Chu vi hình chuw nhật là: %.2f",perimeter);
                    System.out.format("\nDiện tích hình chữ nhật là: %.2f",area);
                    System.out.format("\nCạnh nhỏ nhất là: %.2f",Math.max(width,height));
                    break;
                case 3:
                    double a,volume;
                    a = ValidationInput.getValidDouble("Mời nhập cạnh hình lập phương: ",0,false);
                    volume = getVolumn(a);
                    System.out.format("\nThể tích hình lập phương có cạnh %.1f là %.2f",a,volume);
                    break;
                case 4:
                    System.out.println("Bạn đã thoát chương trình!");
                    break menuLoop;
            }
        }






    }
    private static double getPerimeter(double width,double height){
        return (width+height)*2;
    }
    private static double getArea(double width,double height){
        return width*height;
    }
    private static double getVolumn(double a){
        return Math.pow(a,3);
    }

}
