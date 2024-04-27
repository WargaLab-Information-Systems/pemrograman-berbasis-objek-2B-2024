package postest2;

public class MobilePhone extends Shape {
    private String brand;
    private int stock;
    private double price;
    private static int totalStock = 0;

    public MobilePhone(String brand, int stock, double price, String color) {
        super(color);
        this.brand = brand;
        this.stock = stock;
        this.price = price;
        totalStock += stock;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Stock: " + stock);
        System.out.println("Price: Rp" + price);
        System.out.println("Color: " + color);
    }

    public void updateStock(int newStock) {
        totalStock -= stock;
        stock = newStock;
        totalStock += stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public static void displayTotalStock() {
        System.out.println("Total stock of all phones: " + totalStock);
    }

    public double calculateArea() {
        return 0;
    }
    public double calculatePerimeter() {
         return 0;
    }
}
