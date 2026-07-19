package labs;

import utils.validator.ValidationInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       List<Double> nums = new ArrayList<>();
       double sum = 0;

        while(true){
            nums.add(ValidationInput.getValidDouble("Mời bạn nhập một số bất kỳ: "));
            sc.nextLine();
            if(!confirm(sc)) break;
            System.out.println("Mời bạn tiếp tục!");
        }
        for (double num : nums){
            System.out.print(num+" ");
            sum+=num;
        }
        System.out.format("\n Tổng của mảng %s = %.1f",nums.toString(),sum);
    }
    private static boolean confirm(Scanner sc) {
        System.out.print("Nhập thêm Y/N? ");
        String choice = sc.nextLine().trim();
        if (choice.equalsIgnoreCase("Y")) return true;
        if (choice.equalsIgnoreCase("N")) return false;
        System.out.println("Bạn đã nhập sai lựa chọn, vui lòng nhập lại!");
        return confirm(sc);
    }
}
