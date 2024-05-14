/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */


class Kubus extends BangunRuang implements jarijari {
    private double jariJari;

    public Kubus(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
        return Math.pow(jariJari, 3);
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    public void info() {
        System.out.println("Kubus dengan sisi " + jariJari + " memiliki volume " + hitungVolume());
    }
}
