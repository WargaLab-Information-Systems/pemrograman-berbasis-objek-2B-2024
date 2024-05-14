/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author TOSHIBA
 */
class Kubus extends BangunRuang implements AtributRuang {
    private double sisi;

    Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
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
    public double getPanjang() {
        return 0; 
    }

    @Override
    public void info() {
        System.out.println("Ini adalah sebuah kubus dengan panjang sisi: " + sisi);
    }
}

    
    

