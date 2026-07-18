package labs.lab8;

public class ITStudent  extends Student{
    private double scoreJava;
    private double scoreHtml;
    public ITStudent(String id, String name, int age, String faculty,double scoreJava,double scoreHtml) {
        super(id, name, age, faculty);
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
    }

    @Override
    double getDiem() {
        return (scoreJava * 2 + scoreHtml)/3;
    }

    @Override
    public String toString() {
        return "ITStudent{" +
                "scoreHtml=" + scoreHtml +
                ", scoreJava=" + scoreJava +
                ", scoreFinal=" + getDiem() +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
