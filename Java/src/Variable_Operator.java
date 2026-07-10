

public class Variable_Operator {
    public static void main(String[] args) {
        //Khai báo biến
        int a,b,c;
        //Gán biến
        a = 5;
        b = 6;
        c = 7;


        // Một số toán tử cơ bản
        // + Dùng để cộng hai số vs nhau, và dùng để nối chuôi
        int sum = a + b;
        System.out.println(sum); //Kết quả a + b = 5+6 =11

        System.out.println(a+"11"); // Kết quả sẽ là "511" do khi cộng số vs chuỗi luôn chuyển về chuỗi

        // Các toán tử  - , *, /, %  đều giống toán học

        // Toán tử quan hệ >=, <=, == ,!= Dùng để so sánh, kết quả sẽ ra true hoặc false
        System.out.println(b==c); // false do b khác c
        /* Toán tử logic :
         && (AND) : Trả về true khi tất cả điều kiện đều true
         || (OR): Trả về true khi một điều kiện true
         ! (NOT): phủ định của điều kiện true -> false và ngược lại
        */
        System.out.println(a >=0 && b<=0); // false do b<=0 false
        System.out.println(a >=0 || b<=0); // true do a>=0 true
        System.out.println(!true); // Phủ định của true là false
        // Toán tử gán = Khác với toán học a=b, thì toán tử gán có nghĩa gán giá trị b cho a
        String name = "Dương"; // Gán chuôi dương cho biến name
        //Toán tử gán rút gọn: Thay vì a=a+b có thể viết a+=b, tương tự các toán tử khác

        // Toán tử tăng giảm đơn vị, ++,--
        // Ví dụ tăng a lên 1 đơn vị
        System.out.println(a++);// Kết quả vẫn sẽ là 5 do ++ ở sau là hậu tố, sẽ in trước r mới cộng 1 đơn vị
        System.out.println(++a);// Kết quả sẽ là  do ++ ở trước là tiền tố, sẽ cộng r mới in


        // Toán tử thao tác bit : & (AND BIT) , | (OR BIT), ^ (XOR BIT), ~NOR BIT

        int bit1 = 12; // Chuyển sang nhị phân 1100 = 8*1 + 4*1 + 2*0 +1*0
        int bit2 = 7; // Chuyển sang nhị phân 0111 = 8*0 + 4*1 + 1*1 + 1*1
        System.out.println(12&7); // Do chung bit 4 nên kết quả sẽ là 4
        System.out.println(12|7); // Gộp tất cả bit nên kết quả 1111 = 8 + 4 + 2 + 1 = 15
        System.out.println(12^7); // So sánh từng bit 1 nếu khác, 0 nếu giống => 1011 = 8 + 2 + 1 =11
        System.out.println(~(12|7)); // Phủ định của OR ~x = -x-1 = -16
        // Toán tử dịch bit : >>(Phải) , <<(Trái), >>>(Phải k dấu)
        System.out.println(12>>1);// Dịch phải 1 bit 1100-> 0110 = 4 + 2 = 6
        System.out.println(12<<1);//Dịch trái 1 bit 1100-> 11000 = 16 + 8 = 24

    }
}
