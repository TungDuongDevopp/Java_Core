package Lab.Lab4;

import utils.Validation;

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
        if(!Validation.isValidString(categoryName)){
            throw new IllegalArgumentException("Tên danh mục sản phẩm không được bỏ trống");
        }
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return this.categoryName;
    }
}

