/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100036_tricitraambarwati_mod4;

/**
 *
 * @author ACER
 */
public class OperasiPerkalian extends OperasiBilanganAbs {
    double a = 9.25;
    double b = 1.25;
    double c;
    protected void set_A(double a){
        this.a = a;
    }
    protected void set_B(double b){
        this.b = b;
    }
    protected void set_C(){
        this.c = a * b;
    }
    protected double get_A(){
        return a;
    }
    protected double get_B(){
        return b;
    }
    protected double get_C(){
        c = get_A() * get_B();
        return c;

    }
    protected void tampil(){
        System.out.println("Hasil Perkalian");
        System.out.println("Bilangan A = " + get_A());
        System.out.println("Bilangan B = " + get_B());
        System.out.println(get_A() + " x " + get_B() + " = " + get_C());
        System.out.println("=================");
    }
}