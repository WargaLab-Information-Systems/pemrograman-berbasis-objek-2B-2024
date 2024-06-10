/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

/**
 *
 * @author ASUS
 */
public class Smartphone extends Handphone implements Displayable {
    private int kapasitasMemori;
    private int kameraPiksel;

    public Smartphone(String merek, String model, int tahunProduksi, double harga, int kapasitasMemori, int kameraPiksel) {
        super(merek, model, tahunProduksi, harga);
        this.kapasitasMemori = kapasitasMemori;
        this.kameraPiksel = kameraPiksel;
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Kapasitas Memori: " + kapasitasMemori + " GB");
        System.out.println("Kamera: " + kameraPiksel + " Piksel");
    }
}

