package shopping;

public class Product {
    private String name;
    private double Price;
    private int Quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.Price = price;
        this.Quantity = quantity;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        this.Quantity = quantity;
    }
}


