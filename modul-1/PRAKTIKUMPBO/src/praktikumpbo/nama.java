/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo;
import java.util.Scanner;
/**
 *
 * @author Lavilia
 */
public class nama{
    
    
    
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        
        String NAMA;
        String NIM;
        String JURUSAN;
        String ALAMAT;
           
        System.out.print("INPUT NAMA = ");
        NAMA=input.nextLine();
        System.out.print("INPUT NIM = ");
        NIM=input.nextLine();
        System.out.print("INPUT JURUSAN = ");
        JURUSAN=input.nextLine();
        System.out.print("INPUT ALAMAT = ");
        ALAMAT=input.nextLine();
        
        
        System.out.println("------------------------");
        System.out.println("\nInformasi Mahasiswa : ");
        System.out.println("Nama saya: " + NAMA);
        System.out.println("Nim saya: " + NIM);
        System.out.println("Jurusan saya: " + JURUSAN);
        System.out.println("Alamat saya: " + ALAMAT);
    }

    

    
    
    
    

    
}
