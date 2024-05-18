package postest1;

public class Main {

    public static void main(String[] args) {
        
        MobilePhone phone1 = new MobilePhone("Samsung", 50, 799.99);
        
        MobilePhone phone2 = new MobilePhone("iPhone", 30, 999.99);

        System.out.println("Phone 1 Information:");
        phone1.displayInfo();
        System.out.println();

        System.out.println("Phone 2 Information:");
        phone2.displayInfo();
        System.out.println();

        phone1.updateStock(40);

        MobilePhone.displayTotalStock();
    }
}

    

    

