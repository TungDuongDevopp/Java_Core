package labs.lab9;
import utils.validator.ValidationInput;
public class Student extends Person{
    private double mark;
    public Student(String id, String name, int age, double mark) {
        super(id, name, age);
        setMark(mark);
    }
    public Student(){}

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
       if(!ValidationInput.isValidDouble(mark,0,10,false)){
           throw new IllegalArgumentException("Điểm phải nằm trong khoảng 0-10");
       }
        this.mark = mark;
    }

    @Override
    public void display() {
        super.display();
        System.out.format("\nMark: %.1f |Grade: %s",mark,getGrade());
    }
    @Override
    public void input() {
        super.input();
        setMark(ValidationInput.getValidDouble("Mời bạn nhập điểm: ", 0, 10));
    }

    public String getGrade(){
        if (mark >= 8) return "A";
        if (mark >= 7) return "B";
        if (mark >= 6) return "C";
        if (mark >= 5) return "D";
        return "Trượt";

    }

}
