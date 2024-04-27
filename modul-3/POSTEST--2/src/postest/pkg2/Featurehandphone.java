/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg2;

/**
 *
 * @author ASUS
 */

    public class Featurehandphone extends Handphone {
    private boolean memilikiKamera;
    private boolean memilikiRadio;

    public Featurehandphone(String merek, String model, int tahunProduksi, double harga, boolean memilikiKamera, boolean memilikiRadio) {
        super(merek, model, tahunProduksi, harga);
        this.memilikiKamera = memilikiKamera;
        this.memilikiRadio = memilikiRadio;
    }

    @Override
    public void tampilkanSpesifikasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Memiliki Kamera: " + (memilikiKamera ? "Ya" : "Tidak"));
        System.out.println("Memiliki Radio: " + (memilikiRadio ? "Ya" : "Tidak"));
    }
}
    

