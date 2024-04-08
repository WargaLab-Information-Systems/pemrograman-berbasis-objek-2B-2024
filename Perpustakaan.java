/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3;
/**
 *
 * @author Lavilia
 */
import java.util.ArrayList;

public class Perpustakaan {
    protected ArrayList<Novel> daftarNovel;

    public Perpustakaan() {
        this.daftarNovel = new ArrayList<>();
    }

    public void tambahNovel(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        Novel novel = new Novel(judul, penulis, penerbit, kategori, stok, tahunTerbit);
        daftarNovel.add(novel);
    }

    public void lihatDaftarNovel() {
        if (daftarNovel.isEmpty()) {
            System.out.println("Tidak ada novel yang tersedia.");
        } else {
            System.out.println("===============================================");
            System.out.println("|               Daftar Novel                  |");
            for (Novel novel : daftarNovel) {
                System.out.println("===============================================");
                System.out.println("Judul Novel: " + novel.judul);
                System.out.println("Nama Penulis: " + novel.penulis);
                System.out.println("Nama Penerbit: " + novel.penerbit);
                System.out.println("Kategori: " + novel.getKategoriString());
                System.out.println("Stok: " + novel.stok);
                System.out.println("Tahun terbit: " + novel.tahunTerbit);
            }
        }
    }
}