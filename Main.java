/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3;

/**
 *
 * @author Lavilia
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Masukkan data novel");
            System.out.println("2. Lihat daftar novel");
            System.out.println("3. Keluar");
            System.out.println("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data novel:");
                    scanner.nextLine(); // consume newline
                    System.out.println("Judul: ");
                    String judul = scanner.nextLine();
                    System.out.println("Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.println("Penerbit: ");
                    String penerbit = scanner.nextLine();
                    System.out.println("Kategori (SU/D/R/A): ");
                    String kategori = scanner.nextLine();
                    System.out.println("Stok: ");
                    int stok = scanner.nextInt();
                    System.out.println("Tahun Terbit: ");
                    int tahunTerbit = scanner.nextInt();
                    perpustakaan.tambahNovel(judul, penulis, penerbit, kategori, stok, tahunTerbit);
                    break;
                case 2:
                    perpustakaan.lihatDaftarNovel();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan program perpustakaan.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
    }
}
