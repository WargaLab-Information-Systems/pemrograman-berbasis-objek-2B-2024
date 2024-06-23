/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg3.amanda;

/**
 *
 * @author AMANDA AULIA
 */
public class Mobil {
    private String produsen;
    private String model;
    private int tahunProduksi;
    private static int totalMobil = 0;

    public Mobil(String produsen, String model, int tahunProduksi) {
        this.produsen = produsen;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        totalMobil++;
    }

    public void tampilkanInfo() {
        System.out.println("Produsen: " + produsen);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public boolean dibuatOleh(String produsen) {
        return this.produsen.equals(produsen);
    }

    public void perbaruiTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public static int getTotalMobil() {
        return totalMobil;
    }
}
