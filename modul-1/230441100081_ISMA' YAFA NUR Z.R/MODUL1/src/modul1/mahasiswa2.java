/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author HP VICTUS
 */
public class mahasiswa2 {
    /**
     * @param args the command line arguments
     */
        String nama, prodi,alamat;
        Long nim;
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        mahasiswa2 baru = new mahasiswa2();
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nama : ");
        baru.nama = input.nextLine();
        
        System.out.print("masukkan nim : ");
        baru.nim = input.nextLong();
        input.nextLine();
        
        System.out.print("masukkan prodi : ");
        baru.prodi = input.nextLine();
        
        System.out.print("masukkan alamat : ");
        baru.alamat = input.nextLine();
        
        System.out.println();
        System.out.println("Nama Mahasiswa : " + baru.nama);
        System.out.println("NIM Mahasiswa : " + baru.nim);
        System.out.println("Prodi Mahasiswa : " + baru.prodi);
        System.out.println("Alamat Mahasiswa : " + baru.alamat);
        
    }
    
}
