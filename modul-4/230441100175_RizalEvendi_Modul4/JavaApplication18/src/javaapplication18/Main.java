/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication18;

/**
 *
 * @author M S I
 */
public class Main {
    public static void main(String[] args) {
        double a = 9.25;
        double b = 1.25;

        OperasiMatematika[] operasi = {
            new Penjumlahan(),
            new Pengurangan(),
            new perkalian(),
            new Pembagian()
        };

        for (OperasiMatematika op : operasi) {
            op.setA(a);
            op.setB(b);
            op.setC();
            op.tampil();
            System.out.println();
        }
    }
}
