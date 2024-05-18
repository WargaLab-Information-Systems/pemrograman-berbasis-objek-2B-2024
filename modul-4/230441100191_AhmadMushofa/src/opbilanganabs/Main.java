package opbilanganabs;

public class Main {
    public static void main(String[] args) {
        Operasi[] operasi = new Operasi[] {new penjumlahan(), new pengurangan(), new perkalian(), new pembagian()};
        
        for (Operasi op : operasi) {
            op.tampilHasil();
        }
    }
}
