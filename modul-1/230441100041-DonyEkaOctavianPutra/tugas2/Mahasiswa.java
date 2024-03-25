/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String Nama, Jurusan, Alamat,Nim;
        
        System.out.print("Masukkan Nama Anda Disini = ");
        Nama=input.nextLine();
        
        System.out.print("Masukkan Nim Anda Disini = ");
        Nim=input.nextLine();
        
        System.out.print("Masukkan Jurusan Anda Disini = ");
        Jurusan=input.nextLine();
        System.out.print("Masukkan Alamat Anda Disini = ");
        Alamat=input.nextLine();
        System.out.println("------------------------------");
        System.out.println("Nama kamu adalah " + Nama);
        System.out.println("Nim kamu adalah " + Nim);
        System.out.println("Jurusan kamu adalah " + Jurusan);
        System.out.println("Alamat kamu adalah " + Alamat);
        System.out.println("------------------------------");
     }
 }
        
