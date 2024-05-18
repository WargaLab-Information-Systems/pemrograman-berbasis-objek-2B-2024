/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author M S I
 */
class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return Math.PI* jari * jari;
    }

    @Override
    void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jari);
    }
}
