public class Loop_Structure {
    public static void main(String[] args) {
        // Vòng lặp for gồm ba phần: khởi tạo, điều kiện, biến tăng, thiếu 1 trong 3 vòng lặp sẽ lặp vĩnh viên
        for(int i =0;i<10;i++){
            System.out.println(i);
            if(i==5) break; // Vòng lặp khi gặp từ break sẽ thoát khỏi vòng lăp
            if(i%2==0) continue; // Khi gặp continue thì ngay lập tức vỏng qua vòng lặp hiện tại
            System.out.println(i);
        }
        // Vòng lặp while và do while : Khác nhau là while kiểm tra luôn trong khi do while thực hiện đoạn code ít nhất 1 lần

        int x =5;
        while (x>5){
            System.out.println("Xin chào"); // Đoạn này k bao h chạy do điều kiện x>5 false
        }
        do{
            System.out.println("Xin chào"); //Đoạn này sẽ được chạy ít nhất một lần kể cả đk ban đầu có sai
        } while (x>5);
        // Vòng lặp foreach : Biến thể của for, foreach khong the truy cập theo chỉ số ví dụ a[i]
            int [] nums = {1,2,6,4,3};
        for (int i : nums){
            System.out.println(i);
        }
    }
}
