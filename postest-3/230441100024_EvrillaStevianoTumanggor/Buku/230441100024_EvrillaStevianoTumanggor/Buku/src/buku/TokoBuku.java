<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class TokoBuku {
    public static void main(String[] args) {
        BukuTeks buku1 = new BukuTeks("Godzilla 2014", 1);
        BukuTeks buku2 = new BukuTeks("The Smurf 2", 2);
        BukuTeks buku3 = new BukuTeks("My Little Pony", 3);

        System.out.println("Buku Sebelum Perubahan :");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();

        buku1.ubahStatusKetersediaan(false);
        buku2.tambahEdisi("Terbaru");

        System.out.println("\nBuku Sesudah Perubahan :");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo("Informasi tambahan untuk buku 3");

        System.out.println("\nTotal Buku Yang Ada adalah : " + Buku.getTotalBukuTersedia());
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class TokoBuku {
    public static void main(String[] args) {
        BukuTeks buku1 = new BukuTeks("Godzilla 2014", 1);
        BukuTeks buku2 = new BukuTeks("The Smurf 2", 2);
        BukuTeks buku3 = new BukuTeks("My Little Pony", 3);

        System.out.println("Buku Sebelum Perubahan :");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();

        buku1.ubahStatusKetersediaan(false);
        buku2.tambahEdisi("Terbaru");

        System.out.println("\nBuku Sesudah Perubahan :");
        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo("Informasi tambahan untuk buku 3");

        System.out.println("\nTotal Buku Yang Ada adalah : " + Buku.getTotalBukuTersedia());
    }
}
>>>>>>> 3906db065b3e92a07e71977c56b9a44e229c5a0c
