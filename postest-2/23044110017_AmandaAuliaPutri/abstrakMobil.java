/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg2;

/**
 *
 * @author AMANDA AULIA
 */
public abstract class abstrakMobil {
    protected static int totalMobil = 0;
    protected String merk;
    protected String model;
    protected int tahunProduksi;
    
    // Constructor
    public abstrakMobil(String merk, String model, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        totalMobil++;
    }
    
    // Abstract method untuk menampilkan informasi mobil
    public abstract void tampilkanInfo();
    
    // Abstract method untuk memeriksa apakah mobil dibuat oleh produsen tertentu
    public abstract boolean dibuatOleh(String namaProdusen);
    
    // Abstract method untuk memperbarui tahun produksi mobil
    public abstract void perbaruiTahunProduksi(int tahunBaru);
    
    public static int getTotalMobil() {
        return totalMobil;
    }
}
