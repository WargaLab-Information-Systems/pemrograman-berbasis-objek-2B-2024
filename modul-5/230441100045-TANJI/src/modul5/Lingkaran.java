/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Tanji
 */
class Lingkaran extends BangunDatar {
    protected double jari;

    public Lingkaran(double Jari) {
        this.jari = Jari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    void hasil() {
        System.out.println("\nLingkaran dengan jari = " + jari);
    }
}