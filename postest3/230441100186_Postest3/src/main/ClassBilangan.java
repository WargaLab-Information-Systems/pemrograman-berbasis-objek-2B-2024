/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
// Class Abstrak
abstract class ClassBilangan implements OperasiBilangan {
    protected double b, c, d;

    // Overloading method set_D()
    @Override
    public void set_D() {
        // Implementasi default
    }

    protected void set_D(double nilai) {
        d = nilai;
    }
}

