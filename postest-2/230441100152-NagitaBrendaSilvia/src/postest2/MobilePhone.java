package postest2;

class MobilePhone extends Shape {

    private final int number;

    public MobilePhone(String brand, int stock, double price, String color, int number) {
        super(brand, stock, price, color);
        this.number = number; 
    }

    void displayInfo() {
        System.out.println("Phone " + number + " Information:"); 
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Stock: " + stock);
        System.out.println("Price: Rp" + price);
    }
}
