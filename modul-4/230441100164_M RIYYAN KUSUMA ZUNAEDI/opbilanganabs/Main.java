<<<<<<< HEAD
package opbilanganabs;

// Kelas abstrak untuk operasi bilangan

public class Main {
    public static void main(String[] args) {
        Operasi[] operasi = new Operasi[] {new Penjumlahan(), new Pengurangan(), new Perkalian(), new Pembagian()};
        
        for (Operasi op : operasi) {
            op.tampilHasil();
        }
    }
=======
package opbilanganabs;

// Kelas abstrak untuk operasi bilangan

public class Main {
    public static void main(String[] args) {
        Operasi[] operasi = new Operasi[] {new Penjumlahan(), new Pengurangan(), new Perkalian(), new Pembagian()};
        
        for (Operasi op : operasi) {
            op.tampilHasil();
        }
    }
>>>>>>> fee4602ebba544a77304532e7f937bb49a21589a
}