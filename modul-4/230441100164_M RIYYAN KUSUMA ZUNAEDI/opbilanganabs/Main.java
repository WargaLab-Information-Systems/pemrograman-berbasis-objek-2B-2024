package opbilanganabs;

// Kelas abstrak untuk operasi bilangan

public class Main {
    public static void main(String[] args) {
        Operasi[] operasi = new Operasi[] {new Penjumlahan(), new Pengurangan(), new Perkalian(), new Pembagian()};
        
        for (Operasi op : operasi) {
            op.tampilHasil();
        }
    }
}