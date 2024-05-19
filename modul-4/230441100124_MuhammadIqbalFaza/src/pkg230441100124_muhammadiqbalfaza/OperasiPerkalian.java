/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100124_muhammadiqbalfaza;

/**
 *
 * @author faza
 */
public class OperasiPerkalian extends OperasiBilangan{
    protected double a,b,c;

    protected void setA(double a){
        this.a = a;
    }

    protected void setB(double b){
        this.b = b;
    }

    @Override
    protected void setC() {
        this.c = a * b;
    }

    protected double getA(){
        return a;
    }

    protected double getB(){
        return b;
    }

    protected double getC(){
        return c;
    }

    protected void tampil(){
        System.out.println("Hasil dari "+getA()+ " * "+getB()+" adalah "+ c);
    }
}
