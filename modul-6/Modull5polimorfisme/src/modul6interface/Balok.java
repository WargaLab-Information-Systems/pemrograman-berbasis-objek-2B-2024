/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6interface;

/**
 *
 * @author H
 */
class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double getJariJari() {
        return 0;
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    public void info() {
        System.out.println("Ini adalah balok dengan panjang = " + panjang + ", lebar = " + lebar + ", dan tinggi = " + tinggi);
        System.out.println("Volume balok: " + hitungVolume());
    }
}
