/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg3.amanda;

/**
 *
 * @author AMANDA AULIA
 */
public class MobilSedan extends Mobil {
    private String tipeMobil;

    public MobilSedan(String produsen, String model, int tahunProduksi, String tipeMobil) {
        super(produsen, model, tahunProduksi);
        this.tipeMobil = tipeMobil;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tipe Mobil: " + tipeMobil);
    }
}

