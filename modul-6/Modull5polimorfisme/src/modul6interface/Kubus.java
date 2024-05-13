/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6interface;

/**
 *
 * @author H
 */
//public class Kubus {
//    
//}
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double getJariJari() {
        return sisi / 2;
    }

    @Override
    public double getLebar() {
        return sisi;
    }

    @Override
    public double getTinggi() {
        return sisi;
    }

    public void info() {
        System.out.println("Ini adalah kubus dengan sisi = " + sisi);
        System.out.println("Volume kubus: " + hitungVolume());
    }
}
