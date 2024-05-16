/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6nnew;

/**
 *
 * @author I MASTER ZEN
 */

class Kubus extends BangunRuang {
    protected double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    public double sisi() {
        return sisi;
    }

    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    public void info() {
        System.out.println("Kubus dengan sisi = " + sisi);
    }
}    

