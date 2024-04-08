/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg3;

/**
 *
 * @author Lavilia
 */
public class Novel {
    protected String judul;
    protected String penulis;
    protected String penerbit;
    protected String kategori;
    protected int stok;
    protected int tahunTerbit;

    public Novel(String judul, String penulis, String penerbit, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public String getKategoriString() {
        switch (kategori) {
            case "SU":
                return "Semua Umur";
            case "D":
                return "Dewasa";
            case "R":
                return "Remaja";
            case "A":
                return "Anak-anak";
            default:
                return "Tidak valid";
        }
    }
}