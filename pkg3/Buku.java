/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3;

/**
 *
 * @author AMANDA AULIA
 */

// Kelas Anak (Child Class)
public class Buku extends Perpustakaan {
    // Atribut tambahan
    private String genre;

    // Konstruktor
    public Buku (String judul, String penulis, String penerbit, char kategori, int stok, int tahunTerbit, String tema) {
        super(judul, penulis, penerbit, kategori, stok, tahunTerbit,tema);
        this.genre = genre;
    }

    // Metode untuk menampilkan informasi buku (override metode displayInfo)
    @Override
    public void displayInfo() {
        super.displayInfo(); // Memanggil metode displayInfo dari kelas induk (Buku)
        
    }
}

