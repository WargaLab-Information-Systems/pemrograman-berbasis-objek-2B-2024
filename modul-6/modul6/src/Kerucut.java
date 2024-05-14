/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// File: Kerucut.java
class Kerucut extends BangunRuang implements JarijariLebar, Tinggi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Kerucut dengan jari-jari = " + jariJari + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}
