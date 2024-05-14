/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100036_tricitraambarwati_3;

/**
 *
 * @author ACER
 */
// Parent class
class Buku {
    // Atribut-atribut yang umum untuk semua buku
    public String judul;
    public String penulis;
    public String publisher;
    public int tahunTerbit;

    // Constructor untuk menginisialisasi atribut-atribut
    public Buku(String judul, String penulis, String publisher, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.tahunTerbit = tahunTerbit;
    }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Judul        : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Publisher    : " + publisher);
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

// Child class yang mewarisi Buku
class BukuPerpustakaan extends Buku {
    // Atribut tambahan untuk buku perpustakaan
    private final String kategori;
    private final int stok;

    // Constructor untuk menginisialisasi atribut tambahan
    public BukuPerpustakaan(String judul, String penulis, String publisher, int tahunTerbit, String kategori, int stok) {
        super(judul, penulis, publisher, tahunTerbit);
        this.kategori = kategori;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi buku perpustakaan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kategori     : " + kategori);
        System.out.println("Stok         : " + stok);
    }
}
