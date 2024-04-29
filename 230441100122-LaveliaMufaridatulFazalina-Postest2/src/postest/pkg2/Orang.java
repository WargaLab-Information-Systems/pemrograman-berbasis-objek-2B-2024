/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg2;

/**
 *
 * @author Lavilia
 */
import java.util.Scanner;

// Abstract class sebagai superclass
abstract class Orang {
    protected String nama;
    protected int umur;

    public Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Metode abstrak yang harus diimplementasikan oleh subclass
    public abstract void tampilkanInfo();
}