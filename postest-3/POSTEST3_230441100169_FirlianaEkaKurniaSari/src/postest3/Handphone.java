/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

/**
 *
 * @author ASUS
 */
public abstract class Handphone {
    protected String merek;
    protected String model;
    protected int tahunProduksi;
    protected double harga;

    public Handphone(String merek, String model, int tahunProduksi, double harga) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public abstract void tampilkanSpesifikasi();

    public static void cetakInfoProduksi(Handphone hp) {
        System.out.println("Merek: " + hp.merek);
        System.out.println("Model: " + hp.model);
        System.out.println("Tahun Produksi: " + hp.tahunProduksi);
    }
}   

