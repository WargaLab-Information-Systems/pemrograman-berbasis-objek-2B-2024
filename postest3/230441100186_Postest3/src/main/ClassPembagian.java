/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
class ClassPembagian extends ClassBilangan implements OperasiBilangan {
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
        if (c != 0) {
            d = b / c;
        } else {
            System.out.println("Pembagian dengan nol tidak valid!");
        }
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
        if (c != 0) {
            System.out.println("Hasil pembagian: " + b + " / " + c + " = " + d);
        }
    }
}
