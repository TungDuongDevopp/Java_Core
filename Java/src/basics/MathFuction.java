package basics;

public class MathFuction {
    public static void main(String[] args) {
        int a = 5;
        int b =6;
        int c =25;
        // Có rất nhiều hàm toán học ví dụ min, max, round,...
        System.out.println(Math.max(a,b));//In ra 6
        System.out.println(Math.min(a,b)); // In ra 5
        // Hàm random
        int number = (int) (Math.random()*6);
        System.out.println(number);
        // Hàm tính căn bậc hai, lũy thừa
        System.out.println(Math.sqrt(c));
        System.out.println(Math.pow(a,2));
        // Hàm làm tròn
        System.out.println(Math.round(1.911111111));// Hàm làm tròn nếu hàng thập phân >5 làm tròn lên ngược lại làm tròn xuống;
    }
}
