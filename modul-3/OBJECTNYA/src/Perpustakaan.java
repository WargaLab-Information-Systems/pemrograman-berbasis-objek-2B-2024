/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
   public class Perpustakaan extends Buku {
       private ArrayList<Buku> daftarBuku;

    public Perpustakaan(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        super( judul, penulis, penerbit, kategori, stok, tahunTerbit);
        daftarBuku = new ArrayList<>();
    }

    public void entryBuku() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah buku yang akan dientrikan: ");
        int jumlahBuku = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
    
        for (int i =0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data buku ke-" + (i + 1) + ":"); 
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Penerbit: ");
            String penerbit = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            switch (kategori.toUpperCase()) {
                case "SU":
                    kategori = "Semua Umur";
                    break;
                case "D":
                    kategori = "Dewasa";
                    break;
                case "R":
                    kategori = "Remaja";
                    break;
                case "A":
                    kategori = "Anak-anak";
                    break;
                default:
                    System.out.println("Kategori tidak valid. Masukkan SU, D, R, atau A.");
                    break;
            }
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            
            Buku buku = new Buku(judul, penulis, penerbit, kategori, stok, tahunTerbit);
            daftarBuku.add(buku);
        }
    }
            
    public void viewDaftarBuku() {
        System.out.println("\nDaftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.getJudul());
            System.out.println("Penulis: " + buku.getPenulis());
            System.out.println("Penerbit: " + buku.getPenerbit());
            System.out.println("Kategori: " + buku.getKategori());
            System.out.println("Stok: " + buku.getStok());
            System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
            System.out.println();
        }
    }
}
