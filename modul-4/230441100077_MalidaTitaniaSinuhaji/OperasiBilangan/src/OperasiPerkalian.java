/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class OperasiPerkalian extends OperasiBilangan {
     protected double a = 9.25;
    protected double b = 1.25;
    protected double c = 0; 

    @Override
    protected void set_A(double a) {
        this.a = a;
    }

    @Override
    protected void set_B(double b) {
        this.b = b;
    }

    // Perbaiki parameter dan implementasi dari set_C
    protected void set_C(double c) {
        this.c = c;
    }

    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    // Perbaiki parameter dan implementasi dari get_C
    @Override
    protected double get_C() {
        c = get_A() * get_B();
        return c;
    }

    @Override
    protected void tampil() {
        System.out.println("========================================");
        System.out.println("         Operasi Perkalian             ");
        System.out.println("Bilangan A = " +  get_A());
        System.out.println("Bilangan B = " +  get_B());
        System.out.println("Hasil Perkalian A * B = " + get_C());
    }

 
}
    

