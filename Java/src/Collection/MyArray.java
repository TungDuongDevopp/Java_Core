package Collection;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        // Array là một collection , nó chứa các thành phần có cùng kiểu dữ liệu
        // Khởi tạo một array
        int [] nums = new int[5];// Khởi tạo một mảng số nguyên có 5 phần tử
        // Nếu không khởi tạo giá trị thì cac phần tử kiểu số nguyên sẽ mặc định = 0; chuỗi-> Khoảng trắng
        String[] club = {"Liverpool","Mancity","Mu","Totenham"}; // Khởi tạo mảng có sẵn giá trị
        System.out.format("Mảng club có %d phần tử",club.length);
        //Tiến hành in mảng
        // in bằng vòng for
        for(int i =0;i<club.length;i++){
            System.out.println(club[i]);
        }

        // Một số hàm hay dùng vs mảng
        System.out.println(Arrays.toString(club));// Chuyển mảng string về chuoi
        // Hảm sort => sort theo thứ tự từ bé đến lớn
        Arrays.sort(club);
        //in bằng foreach, kết quả cũng tương tự
        for (String name : club){
            System.out.println(name);
        }

    }
}
