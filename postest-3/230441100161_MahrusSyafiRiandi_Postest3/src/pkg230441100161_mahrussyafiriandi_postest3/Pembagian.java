/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100161_mahrussyafiriandi_postest3;

/**
 *
 * @author 23-161 Mahrus S.R. 
 */

public class Pembagian extends Operasi implements OperasiBilangan {

    public Pembagian() {
    }
    @Override
    public int hitung(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }
}


