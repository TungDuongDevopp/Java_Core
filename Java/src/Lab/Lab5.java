package Lab;

import utils.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       List<Double> nums = new ArrayList<>();
       double sum = 0;

        while(true){
            System.out.print("Mời bạn nhập 1 số bất kỳ: ");
            nums.add(Validation.validateOrDefault(sc.nextDouble(),false));
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
