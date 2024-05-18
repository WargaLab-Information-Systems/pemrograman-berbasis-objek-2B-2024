/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;


public class Tabung extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Tabung dengan jari-jari: " + jariJari + " dan tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}

