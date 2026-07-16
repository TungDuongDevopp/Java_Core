package Collection;

import java.util.ArrayList;
import java.util.Arrays;


public class MyArrayList {
    public static void main(String[] args) {
        // Mảng chúng ta đã học dùng để lưu trữ phân tử imitiative, object
        // Mảng có một số lượng phần tử nhất định, muốn thêm, sửa xóa rất khó
        //Mảng chỉ lưu được chung 1 kiểu dữ liệu, một mảng k thể có 2 kiểu trở lên
        // Để đáp ưng nhu cầu thì ArrayList ra đời
        // Khởi tạo ArrayList
        ArrayList a = new ArrayList();// Do mảng là object nên khởi tạo phải có toán tử new
        a.add("Dương");
        a.add(22);
        for(Object obj : a){
            System.out.println(obj);
        }
        // Thực te khai báo kiểu trên rất khó để biết list có kiểu dữ liệu gi, nếu muốn chỉ có 1 kiểu ta nên khởi tạo sẵn kiểu
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        //nums.add("Dương"); Nếu add  như này sẽ lỗi do list chỉ được lưu số nguyên
        nums.add(2);

        for (int num : nums ){
            System.out.println(num);
        }
        // Chuyển đổi list -> array và ngược lại
        // Do list lưu dữ liệu object, array lưu dữ liệu nguyên thủy nên muốn chuyển phải boxing(unboxing)
        int[] number = nums.stream()
                .mapToInt(Integer::intValue) // Unboxing từ Integer về int
                .toArray();

        int[] rawNumbers = {1, 2, 3};

      // Chuyển từ int[] sang ArrayList<Integer> (Cần Boxing)
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(rawNumbers).boxed().toList();
    }



}
