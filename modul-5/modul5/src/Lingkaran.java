/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    double hitungLuas(double faktor) { // Metode overloading
        return (Math.PI * jariJari * jariJari) * faktor;
    }

    void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari);
    }
}
