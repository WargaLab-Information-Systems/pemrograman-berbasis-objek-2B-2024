/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

/**
 *
 * @author TOSHIBA
 */
class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return 3.14 * jari * jari;
    }

    @Override
    void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jari);
    }
}
