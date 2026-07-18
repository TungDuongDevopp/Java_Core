package labs.lab6;

import utils.validator.ValidationInput;

public class Student {
    private String name,id;

    public Student(String name,String id){
        setName(name);
        setId(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!ValidationInput.isValidString(name)){
            throw new IllegalArgumentException("Name không được để trống");
        }
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        if(!ValidationInput.isValidString(id)){
            throw new IllegalArgumentException("Id không được để trống");
        }
        this.id = id;
    }
    public boolean searchName(String s, boolean isFirstName){
        if (s == null || s.isBlank()) return false;
        String searchKeyword = s.trim().toLowerCase();
        String nameLowerCase = this.name.toLowerCase();
        if (isFirstName) {
            // Tìm theo Họ (Bắt đầu chuỗi)
            return nameLowerCase.startsWith(searchKeyword);
        }

        // Tìm theo Tên (Kết thúc chuỗi) HOẶC chứa từ khóa ở giữa
        return nameLowerCase.contains(searchKeyword);
    }
}
