/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package posttest;

public class Division extends Operation {
    @Override
    public double operate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: angka kedua tidak boleh kosong");
            return Double.NaN; 
        }
        return num1 / num2;
    }
}