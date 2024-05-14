/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author TOSHIBA
 */
class Kerucut extends BangunRuang implements AtributRuang {
    private double jariJari;
    private double tinggi;

    Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return  3.14 * (1.0/3.0)* jariJari * jariJari * tinggi;
    }

    @Override
    public double getJariJari() {
        return jariJari;
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
    public double getPanjang() {
        return 0; 
    }

    @Override
    public void info() {
        System.out.println("Ini adalah sebuah kerucut dengan jari-jari: " + jariJari + " dan tinggi: " + tinggi);
    }
}