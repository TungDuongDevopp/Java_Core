package labs.lab6;

import utils.validator.ValidationInput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n =  ValidationInput.getValidInt("Mời bạn nhập số học sinh cần thêm: ",0,5);
        List<Student> students = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            students.add(new Student(ValidationInput.getValidString(String.format("Mời nhập tên sinh viên thứ %d: ",i)),String.format("%s",i)));
        }

        for (Student student : students){
            if(student.searchName("Tùng Dương",false)){
                System.out.println(student);
            }
        }
    }
}
