package postest2;

import java.util.Scanner;

// Abstract class untuk barang
abstract class Barang {
    protected String nama;
    protected double harga;
    protected int stok;

    // Constructor
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Abstract method untuk menampilkan informasi barang
    public abstract void tampilkanInfo();

    // Abstract method untuk menambah stok barang
    public abstract void tambahStok(int jumlah);

    // Abstract method untuk mengurangi stok barang
    public abstract void kurangiStok(int jumlah);

    // Abstract method untuk mengubah harga barang
    public abstract void ubahHarga(double hargaBaru);

    // Abstract method untuk mendata barang yang keluar
    public abstract void dataBarangKeluar();
}

// Kelas turunan yang mengimplementasikan Barang
class Produk extends Barang {
    // Constructor
    public Produk(String nama, double harga, int stok) {
        super(nama, harga, stok);
    }

    // Implementasi abstract method untuk menampilkan informasi barang
    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Produk:");
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga); // Output harga dengan format Rp
        System.out.println("Stok: " + stok);
    }

    // Implementasi abstract method untuk menambah stok barang
    @Override
    public void tambahStok(int jumlah) {
        stok += jumlah;
        System.out.println("Stok produk \"" + nama + "\" ditambahkan sebanyak " + jumlah + ". Stok baru: " + stok);
    }

    // Implementasi abstract method untuk mengurangi stok barang
    @Override
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " unit produk \"" + nama + "\" terjual. Stok tersisa: " + stok);
        } else {
            System.out.println("Stok produk \"" + nama + "\" tidak mencukupi.");
        }
    }

    // Implementasi abstract method untuk mengubah harga barang
    @Override
    public void ubahHarga(double hargaBaru) {
        harga = hargaBaru;
        System.out.println("Harga produk \"" + nama + "\" diubah menjadi Rp" + harga);
    }

    // Implementasi abstract method untuk mendata barang yang keluar
    @Override
    public void dataBarangKeluar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang keluar: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline
        kurangiStok(jumlah);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data barang
        System.out.print("Masukkan nama barang: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan harga barang: Rp");
        double harga = scanner.nextInt();
        scanner.nextLine(); // Baca baris selanjutnya sebagai double
        // Alternatif: harga = scanner.nextDouble(); scanner.nextLine();

        System.out.print("Masukkan stok barang: ");
        int stok = scanner.nextInt();
        scanner.nextLine(); // Membersihkan karakter newline

        // Membuat objek barang
        Barang barang = new Produk(nama, harga, stok);

        // Memanggil method untuk menambah stok barang
        barang.tambahStok(0);

        // Memanggil method untuk mengurangi stok barang
        barang.kurangiStok(0);


        // Menampilkan informasi barang
        barang.tampilkanInfo();

        // Menu untuk mendata barang yang keluar
        barang.dataBarangKeluar();
    }
}
