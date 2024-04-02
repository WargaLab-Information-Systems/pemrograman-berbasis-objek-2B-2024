/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikan.pkg2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Praktikan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner identitas = new Scanner(System.in);
     System.out.println("Masukkan nama:");
     String nama = identitas.nextLine();
     
     System.out.println("Masukkan NIM:");
     int nim = identitas.nextInt();
    identitas.nextLine();
     System.out.println("Masukkan Prodi/Jurusan:");
     String prodi = identitas.nextLine();
     System.out.println("Masukkan Alamat Mhs:");
     String alamat = identitas.nextLine();
     
     System.out.println("Nama:" + nama);
     System.out.println("Nim:" + nim);
     System.out.println("Prodi/Jurusan:" + prodi);
     System.out.println("Alamat:" + alamat);
     
     
    }
}
