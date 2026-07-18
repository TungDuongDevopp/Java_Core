package labs.lab8;

abstract class Student {
    protected String name;
    protected int age;
    protected String faculty;
    protected String id;

    public Student(String id, String name,int age, String faculty) {
        this.age = age;
        this.faculty = faculty;
        this.id = id;
        this.name = name;
    }

    abstract double getDiem();
}
