package basics;

public class MyString {
    public static void main(String[] args) {
        //String là chuỗi ký tự, nó không phải là dữ liệu nguyên thủy mà là Object
        //Vì vậy cần viết hoa
        String name = "Dương";
        // Một số hàm hay dùng
        System.out.format("Độ dài của chuỗi %s : %d",name,name.length()); //dùng length() lấy độ dài chuỗi;
        String sentences = "     Hello world      ";
        System.out.println(sentences.trim());// Hàm trim() dùng để cắt khoảng trắng thừa 2 đầu
        System.out.println(name.toUpperCase()); // Hàm toUpperCase() dùng để chuyển chuỗi thành chuỗi in hoa
        System.out.println(name.contains("D"));// Hàm contains dùng để kiểm tra sự tồn tại của chuỗi con
        System.out.println(name.compareTo(sentences)); // Hàm so sánh chuỗi theo unicode > 0 thì a> b và ngược lại nếu = 0 thì chuỗi bằng nhau
        System.out.println(name.equals(sentences));// Hàm kiểm tra chuỗi có bằng nhau không phân biệt hoa, thường

    }
}
