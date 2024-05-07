/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Scanner;

class persegi extends BangunDatar {
    double sisi;

    persegi(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }

    void info() {
        System.out.println("Ini adalah persegi dengan sisi " + sisi);
    }
}