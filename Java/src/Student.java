public class Student {
        // Student có thuộc tính name, age, id,email: Thuộc tính là những thứ định nghĩa nên bạn hs
        String name,id,email;
        int age;
        // Hàm tạo: Mỗi khi ta tạo đối tượng, một hàm tạo sẽ được gọi yeeu cầu cấp bộ nhớ
        public Student(String name, int age){
            this.name =name;
            this.age = age;
        }
        // Student có phương thức :đi học, đi chơi. Phương Thức là những hành động của đối tướng
        public void diHoc(){
            System.out.println("Tôi đi học");
        }
        public void diChoi(){
            System.out.println("Tôi đi chơi");
        }

}
