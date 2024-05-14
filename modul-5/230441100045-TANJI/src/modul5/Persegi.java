/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Tanji
 */
class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double Sisi) {
        this.sisi = Sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    void hasil() {
        System.out.println("\nPersegi dengan sisi = " + sisi);
    }
}
