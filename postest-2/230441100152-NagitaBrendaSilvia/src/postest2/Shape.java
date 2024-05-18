package postest2;

abstract class Shape {
    protected String brand;
    protected int stock;
    protected double price;
    protected String color;
    protected static int totalStock = 0;

    public Shape(String brand, int stock, double price, String color) {
        this.brand = brand;
        this.stock = stock;
        this.price = price;
        this.color = color;
        totalStock += stock;
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
}
