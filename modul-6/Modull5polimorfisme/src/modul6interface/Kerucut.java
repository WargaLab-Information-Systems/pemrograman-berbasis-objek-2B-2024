/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6interface;

/**
 *
 * @author H
 */

class Kerucut extends BangunRuang {
    private double radius;
    private double tinggi;
    private final double PI = 3.14;

    public Kerucut(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * PI * Math.pow(radius, 2) * tinggi;
    }

    @Override
    public double getJariJari() {
        return radius;
    }

    @Override
    public double getLebar() {
        return 0;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }

    public void info() {
        System.out.println("Ini adalah kerucut dengan jari-jari = " + radius + " dan tinggi = " + tinggi);
        System.out.println("Volume kerucut: " + hitungVolume());
    }
}
