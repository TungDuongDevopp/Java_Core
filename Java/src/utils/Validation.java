package utils;

public class Validation {

        public static double validateOrDefault(double value, double min, double max, boolean isInteger) {

            // 1. Kiểm tra nếu giá trị không phải là một số hợp lệ (Tránh lỗi hệ thống NaN)
            if (Double.isNaN(value)) {
                System.out.println("Lỗi: Giá trị không phải là số! Tự động gán = 0.");
                return 0;
            }

            // 2. Kiểm tra điều kiện số nguyên (Nếu isInteger = true, phần thập phân phải bằng 0)
            if (isInteger && value % 1 != 0) {
                System.out.printf("Lỗi: Số %.2f không phải là số nguyên! Tự động gán = 0.\n", value);
                return 0;
            }

            // 3. Kiểm tra khoảng giới hạn [min, max]
            if (value < min || value > max) {
                System.out.printf("Lỗi: Giá trị %.1f nằm ngoài khoảng [%.1f, %.1f]! Tự động gán = 0.\n", value, min, max);
                return 0;
            }

            // Hợp lệ hoàn toàn, trả về giá trị gốc
            return value;
        }

        public static double validateOrDefault(double value,boolean isInteger){
            return validateOrDefault(value, -Double.MAX_VALUE,Double.MAX_VALUE,isInteger);
        }
        public static double validateOrDefault(double value,double min, boolean isInteger){
            return validateOrDefault(value,min,Double.MAX_VALUE,isInteger);
        }
    public static String validateStringOrDefault(String value, String defaultValue) {
        // 1. Kiểm tra null hoặc rỗng/chỉ chứa khoảng trắng (isBlank yêu cầu Java 11+)
        if (value == null || value.isBlank()) {
            System.out.println("Cảnh báo: Tên không được để trống! Đã tự động gán tên mặc định.");
            return defaultValue;
        }

        // 2. Nếu hợp lệ, trả về chuỗi đã được cắt bỏ khoảng trắng thừa ở 2 đầu
        return value.trim();
    }
    }


