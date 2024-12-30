package workshop4;

public class Product2 {
    private String name;
    private double price;
    private int quantity;

    public Product2(String name, double price, int quantity) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isAffordable(double budget) {
        return (price * quantity) <= budget;
    }

    public boolean isProductAvailable(String productName, int requestedQuantity) {
        if (!this.name.equals(productName)) {
            return false;
        }
        return this.quantity >= requestedQuantity;
    }
}