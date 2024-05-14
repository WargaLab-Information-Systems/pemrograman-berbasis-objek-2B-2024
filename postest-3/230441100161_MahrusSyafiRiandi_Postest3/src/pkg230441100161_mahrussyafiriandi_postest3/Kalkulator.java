/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100161_mahrussyafiriandi_postest3;

/**
 *
 * @author 23-161 Mahrus S.R. 
 */

public class Kalkulator {
    // Method overriding
    public int operasi(OperasiBilangan operasi, int a, int b) {
        return operasi.hitung(a, b);
    }

    // Method overloading
    public int operasi(OperasiBilangan operasi, int a, int b, int c) {
        int temp = operasi.hitung(a, b);
        return operasi.hitung(temp, c);
    }
}

