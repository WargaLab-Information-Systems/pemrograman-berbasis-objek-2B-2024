/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg3.amanda;

/**
 *
 * @author AMANDA AULIA
 */
public class MobilSUV extends Mobil {
    private boolean is4WD;

    public MobilSUV(String produsen, String model, int tahunProduksi, boolean is4WD) {
        super(produsen, model, tahunProduksi);
        this.is4WD = is4WD;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("4WD: " + (is4WD ? "Ya" : "Tidak"));
    }
}

