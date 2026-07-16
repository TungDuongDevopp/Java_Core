package Lab.Lab4;

public class Category {
    private String categoryName;

    public Category() {}

    public Category(String categoryName) {
        setCategoryName(categoryName);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        // Áp dụng luôn hàm validate chuỗi rỗng của bạn
        this.categoryName = Validation.validateStringOrDefault(categoryName, "Danh mục chung");
    }

    @Override
    public String toString() {
        return this.categoryName;
    }
}

