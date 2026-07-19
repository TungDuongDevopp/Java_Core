package labs.lab10;

import utils.validator.NameValidator;
import utils.validator.ValidationInput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName(ValidationInput.getValidString("Mời nhập name: "));
        st.setId(ValidationInput.getValidString("Mời nhập id: "));
        st.setAge(ValidationInput.getValidInt("Mời bạn nhập tuổi: ", 18, 100));
        st.setScore(ValidationInput.getValidDouble("Mời bạn nhập điểm: ", 0, 10));
        System.out.println(st);

    }
}
