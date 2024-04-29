/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1.praktikum;
import java.util.Scanner;
/**
 *
 * @author TOSHIBA
 */



public class Tugas1Praktikum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda : ");
        String namainput = input.nextLine();
        
        manusia pertama = new manusia(namainput, 19,"surabaya");
        manusia kedua = new manusia("riki", 20, "sidoarjo");
        manusia ketiga = new manusia("dani", 18, "surakarta");
        
        
        
        pertama.berjalan();
        kedua.berlari();
        ketiga.berlari();
        
        System.out.println("Umur " + pertama.nama + " adalah " + pertama.umur);
    }
}

class manusia {
    public String nama;
    public int umur;
    public String alamat;
    
    public manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public void berjalan() {
        System.out.println(nama + " sedang berjalan");
    }
    
    public void berlari() {
        System.out.println(nama + " sedang berlari");
    }
  
}
