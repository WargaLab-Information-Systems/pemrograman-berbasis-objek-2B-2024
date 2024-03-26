/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

import java.util.Scanner;

public class mahasiswa {

    public static void main(String[] args) {
        
        String nama;
        Long nim;
        String jurusan;
        String alamat;
        
        Scanner input = new Scanner(System.in);
      
        System.out.println("Masukkan informasi mahasiswa:");
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("NIM: ");
        nim = input.nextLong();
        input.nextLine();
        System.out.print("Jurusan: ");
        jurusan = input.nextLine();
        System.out.print("Alamat: ");
        alamat = input.nextLine();
        
        System.out.println("----------------------------------");
        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama saya: " + nama);
        System.out.println("NIM saya: " + nim);
        System.out.println("Jurusan saya: " + jurusan);
        System.out.println("Alamat saya: " + alamat);


    }
}

