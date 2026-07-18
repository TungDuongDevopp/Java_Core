package oop.encapsulation;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student( String id, String name,int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }
    public Student(){}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
