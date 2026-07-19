package labs.lab10;

import utils.validator.ValidationInput;
import utils.validator.NameValidator;
public class Student {
    private String name;
    private String id;
    private int age;
    private double score;
    public Student(){}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(!ValidationInput.isValidDouble(age,18,99,false)){
            throw new IllegalArgumentException("Tuổi phải nằm trong khoảng 18-99");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!ValidationInput.isValidString(id)){
            throw new IllegalArgumentException("Id không được để trống");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!NameValidator.isValidName(name)){
            throw new IllegalArgumentException("Name không hợp lệ!");
        }
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(!ValidationInput.isValidDouble(score,0,10,false)){
            throw new IllegalArgumentException("Điểm phải nằm trong khoảng 0-10");
        }
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
