/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
class ClassPenjumlahan extends ClassBilangan implements OperasiBilangan  {
    @Override
    public void set_B(double b) {
        this.b = b;
    }

    @Override
    public void set_C(double c) {
        this.c = c;
    }

    @Override
    public void set_D() {
        d = b + c;
    }

    @Override
    public double get_B() {
        return b;
    }

    @Override
    public double get_C() {
        return c;
    }

    @Override
    public double get_D() {
        return d;
    }

    @Override
    public void tampil() {
        System.out.println("Hasil penjumlahan: " + b + " + " + c + " = " + d);
    }
}
