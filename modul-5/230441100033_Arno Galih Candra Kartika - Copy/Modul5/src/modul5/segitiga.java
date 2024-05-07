/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Scanner;

class segitiga extends BangunDatar {
    double alas, tinggi;

    segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    void info() {
        System.out.println("Ini adalah segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}