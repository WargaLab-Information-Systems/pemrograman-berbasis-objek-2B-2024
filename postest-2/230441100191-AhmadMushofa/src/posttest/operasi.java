/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest;

/**
 *
 * @author ahmad
 */
abstract class Operation {
    abstract double operate(double num1, double num2);
}
class Addition extends Operation {
    @Override
    double operate(double num1, double num2) {
        return num1 + num2;
    }
}

class Subtraction extends Operation {
    @Override
    double operate(double num1, double num2) {
        return num1 - num2;
    }
}

class Multiplication extends Operation {
    @Override
    double operate(double num1, double num2) {
        return num1 * num2;
    }
}

class Division extends Operation {
    @Override
    double operate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: angka kedua tidak boleh kosong");
            return Double.NaN; 
        }
        return num1 / num2;
    }
}