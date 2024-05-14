package postest2;

import java.util.ArrayList;
import java.util.Scanner;

// Interface untuk mengelola stok barang
interface StokBarang {
    void tambahStok(int jumlah);
    void tambahStok(int jumlah, String supplier);
    void kurangiStok(int jumlah);
    void ubahHarga(double hargaBaru);
}

// Abstract class untuk barang
abstract class Barang implements StokBarang {
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

    // Implementasi method untuk menambah stok barang
    @Override
    public void tambahStok(int jumlah) {
        stok += jumlah;
        System.out.println("Stok produk \"" + nama + "\" ditambahkan sebanyak " + jumlah + ". Stok baru: " + stok);
    }

    // Overloaded method untuk menambah stok dengan informasi supplier
    @Override
    public void tambahStok(int jumlah, String supplier) {
        stok += jumlah;
        System.out.println("Stok produk \"" + nama + "\" ditambahkan sebanyak " + jumlah + " dari supplier " + supplier + ". Stok baru: " + stok);
    }

    // Implementasi method untuk mengurangi stok barang
    @Override
    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            System.out.println(jumlah + " unit produk \"" + nama + "\" terjual. Stok tersisa: " + stok);
        } else {
            System.out.println("Stok produk \"" + nama + "\" tidak mencukupi.");
        }
    }

    // Implementasi method untuk mengubah harga barang
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

        ArrayList<Produk> daftarBarang = new ArrayList<>();

        boolean runProgram = true;

        while (runProgram) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Edit Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan harga barang: Rp");
                    double harga = scanner.nextDouble();
                    scanner.nextLine(); // Membersihkan karakter newline
                    System.out.print("Masukkan stok barang: ");
                    int stok = scanner.nextInt();
                    scanner.nextLine(); // Membersihkan karakter newline

                    // Membuat objek barang
                    Produk barang = new Produk(nama, harga, stok);
                    daftarBarang.add(barang);
                    System.out.println("Barang berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("\n===== DAFTAR BARANG =====");
                    for (Produk item : daftarBarang) {
                        item.tampilkanInfo();
                    }
                    break;
                case 3:
                    System.out.print("\nMasukkan nama barang yang akan diubah: ");
                    String namaEdit = scanner.nextLine();
                    boolean ditemukan = false;
                    for (Produk item : daftarBarang) {
                        if (item.nama.equalsIgnoreCase(namaEdit)) {
                            System.out.println("\n=== MENU EDIT ===");
                            System.out.println("1. Ubah Harga");
                            System.out.println("2. Tambah Stok");
                            System.out.print("Pilih menu edit: ");
                            int menuEdit = scanner.nextInt();
                            scanner.nextLine(); // Membersihkan karakter newline

                            switch (menuEdit) {
                                case 1:
                                    System.out.print("Masukkan harga baru barang: Rp");
                                    double hargaBaru = scanner.nextDouble();
                                    item.ubahHarga(hargaBaru);
                                    break;
                                case 2:
                                    System.out.print("Masukkan jumlah stok yang akan ditambahkan: ");
                                    int tambahStok = scanner.nextInt();
                                    item.tambahStok(tambahStok);
                                    break;
                                default:
                                    System.out.println("Menu tidak valid.");
                                    break;
                            }
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.print("\nMasukkan nama barang yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    boolean ditemukanHapus = false;
                    for (Produk item : daftarBarang) {
                        if (item.nama.equalsIgnoreCase(namaHapus)) {
                            daftarBarang.remove(item);
                            System.out.println("Barang berhasil dihapus.");
                            ditemukanHapus = true;
                            break;
                        }
                    }
                    if (!ditemukanHapus) {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    runProgram = false;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        }
    }
}
