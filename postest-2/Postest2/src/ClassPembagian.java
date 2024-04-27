/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class ClassPembagian extends ClassBilangan{
       @Override
    protected void set_B(double b) {
        this.b = b;
    }

    @Override
    protected void set_C(double c) {
        this.c = c;
    }

    @Override
    protected void set_D() {
         if (c == 0) {
            System.out.println("Pembagian dengan 0 tidak diperbolehkan.");
            d = 0;
        } else {
            d = b / c;
        }
            }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        return c;
    }

    @Override
    protected double get_D() {
        return d;
    }

    @Override
    protected void tampil() {
        System.out.println("Hasil penjumlahan: " + b + " : " + c + " = " + d);
    }

}
