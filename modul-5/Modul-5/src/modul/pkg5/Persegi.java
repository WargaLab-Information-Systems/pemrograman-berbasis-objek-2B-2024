/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author asus
 */
public class Persegi extends BangunDatar {
    private double sisi;

    // Konstruktor untuk persegi
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    protected void info() {
        System.out.println("Persegi dengan sisi " + sisi);
    }
}
