package labs.lab8;

public class MechanicalStudent extends Student{
    private double scorePLC;
    private double scoreCNC;
    public MechanicalStudent(String id, String name, int age, String faculty,double scorePLC,double scoreCNC) {
        super(id, name, age, faculty);
        this.scorePLC = scorePLC;
        this.scoreCNC = scoreCNC;
    }

    @Override
    double getDiem() {
        return (scoreCNC+scorePLC) / 2;
    }

    @Override
    public String toString() {
        return "MechanicalStudent{" +
                "scoreCNC=" + scoreCNC +
                ", scorePLC=" + scorePLC +
                ", scoreFinal=" + getDiem() +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
