package posttest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class paket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Berapa Barang Yang ingin Di Beli : ");
        int numObjects = scanner.nextInt();
        scanner.nextLine();

        List<toko> pembelianbarang = new ArrayList<>();
        for (int i = 0; i < numObjects; i++) {
            System.out.println("Data Produk Ke-" + (i + 1) +": ");
            System.out.print("ID Pelanggan: ");
            int idPelanggan = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.print("Harga Barang: " + "Rp");
            String hargaBarang = scanner.nextLine();
            System.out.print("Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();
            scanner.nextLine();
            pembelianbarang.add(new toko(idPelanggan, namaPelanggan, namaBarang, hargaBarang, jumlahBarang));
        }

        // method untuk menampilkan outputnya
        for (toko pelanggan : pembelianbarang) {
            pelanggan.pembelian();
        }
    }
}