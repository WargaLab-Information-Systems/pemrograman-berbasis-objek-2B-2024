/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Tanji
 */
class PersegiPanjang extends BangunDatar {
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double Panjang, double Lebar) {
        this.panjang = Panjang;
        this.lebar = Lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    void hasil() {
        System.out.println("\nPersegi Panjang dengan panjang = " + panjang);
        System.out.println("\nPersegi Panjang dengan lebar = " + lebar);
    }
}
