/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// File: Balok.java
class Balok extends BangunRuang implements JarijariLebar, Tinggi {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void info() {
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}
