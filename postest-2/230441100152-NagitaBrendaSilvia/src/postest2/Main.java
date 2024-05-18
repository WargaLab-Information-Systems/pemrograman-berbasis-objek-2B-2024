package postest2;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Samsung", 50, 799.99, "Black", 1); 
        MobilePhone phone2 = new MobilePhone("iphone", 30, 999.99, "White", 2); 

        phone1.displayInfo();
        
        System.out.println();
        
        phone2.displayInfo();
        System.out.println();

        phone1.updateStock(40);
        phone2.updateStock(30);

        Shape.displayTotalStock();
    }
}
