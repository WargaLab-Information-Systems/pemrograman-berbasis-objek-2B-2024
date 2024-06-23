/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100017.amandaauliaputri;

import java.util.Scanner;

/**
 *
 * @author AMANDA AULIA
 */
public class nama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        String nim;
        String jurusan;
        String alamat;
        System.out.println("input nama = ");
        nama=input.nextLine();
        System.out.println("input nim =");
        nim=input.nextLine();
        System.out.println("input jurusan = ");
        jurusan=input.nextLine();
        System.out.println("input alamat =");
        alamat=input.nextLine();

        System.out.println("---------------------");
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("nama saya = " + nama);
        System.out.println("nim saya = " + nim);
        System.out.println("jurusan saya = " + jurusan);
        System.out.println("alamat saya = " + alamat);
    }
}
   
