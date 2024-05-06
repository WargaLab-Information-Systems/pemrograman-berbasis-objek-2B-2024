/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Persegi extends BangunDatar {
    private final double sisi;

    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    } 

    @Override
    public void info() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + hitungLuas());
    }
}
