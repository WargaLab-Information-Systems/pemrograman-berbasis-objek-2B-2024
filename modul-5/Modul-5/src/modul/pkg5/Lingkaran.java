/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author asus
 */
public class Lingkaran extends BangunDatar {
    private double jariJari;

    // Konstruktor untuk lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    protected double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    protected void info() {
        System.out.println("Lingkaran dengan jari-jari " + jariJari);
    }
}
