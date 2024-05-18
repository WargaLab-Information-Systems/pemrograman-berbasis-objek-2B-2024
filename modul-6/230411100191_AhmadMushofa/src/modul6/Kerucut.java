/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;



public class Kerucut extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
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
        return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
    }

    @Override
    public void info() {
        System.out.println("Kerucut dengan jari-jari: " + jariJari + " dan tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}

