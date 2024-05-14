/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6;

/**
 *
 * @author Tanji
 */

interface Jari {
    double jarijari();
}

interface Panjang {
    double panjang();
}

interface Lebar {
    double lebar();
}

interface Tinggi {
    double tinggi();
}

abstract class BangunRuang {
    abstract double hitungVolume();
    abstract void info();
}
