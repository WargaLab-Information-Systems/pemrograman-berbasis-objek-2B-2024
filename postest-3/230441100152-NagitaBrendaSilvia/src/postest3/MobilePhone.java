package postest3;

    public class MobilePhone implements Displayable {
    private String brand;
    private int stock;
    private double price;
    private String color;
    private int id;

    public MobilePhone(String brand, int stock, double price, String color, int id) {
        this.brand = brand;
        this.stock = stock;
        this.price = price;
        this.color = color;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Stock: " + stock);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("ID: " + id);
    }

    public void updateStock(int newStock) {
        this.stock = newStock;
    }

    public void updateStock() {
        this.stock = 0; // Default to zero
    }
}
    

