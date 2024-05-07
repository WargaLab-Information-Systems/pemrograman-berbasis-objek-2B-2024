/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Scanner;

class lingkaran extends BangunDatar {
    double jari;

    lingkaran(double jari) {
        this.jari = jari;
    }

    double hitungLuas() {
        return Math.PI * jari * jari;
    }

    void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jari);
    }
}