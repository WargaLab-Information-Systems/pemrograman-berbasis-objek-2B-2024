/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
// File: Tabung.java
class Tabung extends BangunRuang implements JarijariLebar, Tinggi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Tabung dengan jari-jari = " + jariJari + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}
