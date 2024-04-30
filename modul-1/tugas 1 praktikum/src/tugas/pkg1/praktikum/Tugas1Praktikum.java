/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas.pkg1.praktikum;
<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 778d5daf48b89516e25b4732585ab83dfd002745
/**
 *
 * @author TOSHIBA
 */



public class Tugas1Praktikum {

<<<<<<< HEAD
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
=======
    /**``
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        manusia pertama = new manusia("Baihaqi", 19,"Surabaya");
        manusia kedua = new manusia("Rizal", 20, "Bangkalan");
        
        System.out.println( pertama.nama + " adalah Seseorang berumur " + pertama.umur + " yang berasal dari " +pertama.alamat);
        System.out.println(kedua.nama + " adalah seseorang yang berumur " + kedua.umur + " yang berasal dari " +kedua.alamat);
        
        pertama.berjalan();
        kedua.berlari();
        
>>>>>>> 778d5daf48b89516e25b4732585ab83dfd002745
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
