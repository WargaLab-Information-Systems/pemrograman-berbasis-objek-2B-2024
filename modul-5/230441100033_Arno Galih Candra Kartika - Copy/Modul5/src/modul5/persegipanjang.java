/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

import java.util.Scanner;

class persegipanjang extends BangunDatar {
    double panjang, lebar;

    persegipanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double hitungLuas() {
        return panjang * lebar;
    }

    void info() {
        System.out.println("Ini adalah persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }
}