package labs.lab9;
import utils.validator.NameValidator;
import utils.validator.ValidationInput;
abstract class Person implements IPerson{
    protected String name;
    protected String id;
    protected int age;
    public Person(String id, String name, int age) {
        setAge(age);
        setId(id);
        setName(name);
    }
    public Person(){}
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(!ValidationInput.isValidDouble(age,0,100,true)){
            throw new IllegalArgumentException("Tuổi phải nằm trong khoảng 0-100!");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!ValidationInput.isValidString(id)){
            throw new IllegalArgumentException("Id không được để trống!");
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


    @Override
    public void input() {
        id = ValidationInput.getValidString("Mời bạn nhập id: ");
        name = ValidationInput.getValidString("Mời bạn nhập name: ");
        age = ValidationInput.getValidInt("Mời bạn nhập tuổi: ",0,100);
    }

    @Override
    public void display() {
       System.out.format("\nId: %s |Name: %s |Age: %d",id,name,age);
    }

}
