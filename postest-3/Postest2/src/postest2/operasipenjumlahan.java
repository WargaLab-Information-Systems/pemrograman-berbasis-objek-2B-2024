/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest2;


class OperasiPenjumlahan extends Postest2 {
    @Override
    public void set_A(double a) {
        this.a = a;
    }

    @Override
    public void set_B(double b) {
        this.b = b;
    }

    @Override
    public void set_C() {
        this.c = a + b;
    }

    @Override
    public double get_A() {
        return a;
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
    public void tampil() {
        System.out.println("x Hasil Penjumlahan ");
        System.out.println("x " + get_A() + " + " + get_B() + " = " + get_C());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    // Method Overloading
    public void tampil(String message) {
        System.out.println(message);
        tampil();
    }
}
