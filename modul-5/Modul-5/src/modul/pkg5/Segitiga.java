/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author asus
 */
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    // Konstruktor overloading untuk segitiga
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}
