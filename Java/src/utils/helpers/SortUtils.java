package utils.helpers;

import java.util.Comparator;
import java.util.List;

public class SortUtils {
    // Ký tự <T> nghĩa là hàm này chấp nhận BẤT KỲ kiểu dữ liệu nào (Student, Person, Integer...)
    public static <T> void customSort(List<T> list, Comparator<T> comparator, boolean isIncrease) {

        // Nếu muốn giảm dần, ta chỉ cần đảo ngược (reverse) tiêu chí so sánh lại
        if (!isIncrease) {
            comparator = comparator.reversed();
        }

        // Gọi hàm sort tối ưu O(n log n) của Java
        list.sort(comparator);
    }
}
