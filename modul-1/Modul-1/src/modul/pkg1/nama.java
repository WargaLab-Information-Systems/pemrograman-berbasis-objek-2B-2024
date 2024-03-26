/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg1;

import java.util.Scanner;

/**
 *
 * @author AMANDA AULIA
 */
public class nama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String NAMA;
        String NIM;
        String JURUSAN;
        String ALAMAT;
        
        
        System.out.println("INPUT NAMA = ");
        NAMA=input.nextLine();
        System.out.println("INPUT NIM =");
        NIM=input.nextLine();
        System.out.println("INPUT JURURSAN = ");
        JURUSAN=input.nextLine();
        System.out.println("INPUT ALAMAT =");
        ALAMAT=input.nextLine();
        
        
        System.out.println("---------------------");
        System.out.println("NAMA SAYA = " + NAMA);
        System.out.println("NIM SAYA = " + NIM);
        System.out.println("JURURSAN SAYA = " + JURUSAN);
        System.out.println("ALAMAT SAYA = " + ALAMAT);
    }
}
