/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author TOSHIBA
 */
class Balok extends BangunRuang implements AtributRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    @Override
    double hitungVolume() {
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
    @Override
    public double getPanjang() {
        return panjang;
    }

    @Override
    public void info() {
        System.out.println("Ini adalah sebuah Balok dengan panjang : " + panjang + " Lebar : " + lebar + " dan tinggi : " + tinggi);
    }
}
