/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author M S I
 */
public class Kerucut implements BangunRuang, atribut {
    private double jarijari;
    private double tinggi;

    public Kerucut(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3) * 3.14 * jarijari*jarijari* tinggi;
    }

    @Override
    public void info() {
        System.out.println("Kerucut dengan jari-jari " + jarijari + " dan tinggi " + tinggi);
    }

    @Override
    public double getJariJari() {
        return jarijari;
    }

    @Override
    public double getLebar() {
        return 0;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
    
    @Override
    public double getpanjang() {
        return 0;
    }
    @Override
    public double getsisi() {
        return 0;
    }
    
}


