/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author M S I
 */
// Kubus
public class Kubus implements BangunRuang, atribut {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi*sisi*sisi;
    }

    @Override
    public void info() {
        System.out.println("Kubus dengan sisi " + sisi);
    }

    @Override
    public double getJariJari() {
        return 0;
    }

    @Override
    public double getLebar() {
        return 0;
    }

    @Override
    public double getTinggi() {
        return 0;
    }
    @Override
    public double getpanjang() {
        return 0;
    }
    @Override
    public double getsisi() {
        return sisi;
    }
}

