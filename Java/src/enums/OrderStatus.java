package enums;

public enum OrderStatus {
    PENDING(1),

    SHIPPING(2),

    COMPLETED(3),

    CANCELLED(4);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
