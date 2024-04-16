/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author AMANDA AULIA
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        int pilihan;
        do {
            // Menu
            System.out.println("Menu:");
            System.out.println("1. Masukkan data novel");
            System.out.println("2. Lihat daftar novel");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    // Memasukkan data novel
                    System.out.println("Masukkan data novel:");
                    System.out.print("Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Penulis: ");
                    String penulis = input.nextLine();
                    System.out.print("Penerbit: ");
                    String penerbit = input.nextLine();
                    System.out.print("Kategori (SU/D/R/A): ");
                    char kategori = input.nextLine().charAt(0);
                    System.out.print("Stok: ");
                    int stok = input.nextInt();
                    System.out.print("Tahun Terbit: ");
                    int tahunTerbit = input.nextInt();
                    input.nextLine(); // Membersihkan newline
                    System.out.print("Genre: ");
                    String genre = input.nextLine();

                    Buku buku = new Buku (judul, penulis, penerbit, kategori, stok, tahunTerbit, genre);
                    daftarBuku.add(buku);
                    break;
                case 2:
                    // Menampilkan daftar novel
                    System.out.println("Daftar novel:");
                    for (Buku b : daftarBuku) {
                        b.displayInfo();
                    }
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 3);
        
        input.close();
    }
}

