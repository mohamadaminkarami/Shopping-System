package main.java.models;

public class Product extends Saleable {
    private String description;
    private int capacity;

    public Product(String name, int price, String description, int capacity) {
        super(name, price);
        this.description = description;
        this.capacity = capacity;

    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "|capacity: " + this.getCapacity() + "|description: " + this.getDescription();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Product)) {
            return false;
        }

        Product product = (Product) obj;

        return super.equals(product) && this.getCapacity() == product.getCapacity()
                && this.getDescription() == product.getDescription();
    }
}