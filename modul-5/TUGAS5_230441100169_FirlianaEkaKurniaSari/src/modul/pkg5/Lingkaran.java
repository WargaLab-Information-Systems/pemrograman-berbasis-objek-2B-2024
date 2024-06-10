/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg5;

/**
 *
 * @author ASUS
 */
class Lingkaran extends BangunDatar {
    private double jariJari;

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    @Override
    public void hitungLuas() {
        luas = Math.PI * jariJari * jariJari;
    }
//  overloading
    public double hitungluas (){
        return 2 * jariJari*jariJari;
    }

    public void info() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + getLuas());
    }
}
    

