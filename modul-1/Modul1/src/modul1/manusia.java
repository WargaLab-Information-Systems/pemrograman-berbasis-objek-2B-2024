/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1;

/**
 *
 * @author asus
 */
public class manusia {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan() {
        System.out.println("Saya sekarang sedang berjalan kaki");
    }
    public void berlari() {
        System.out.println("kemudian sekarang saya sedang berlari " );
    }
    
    public static void main(String[] args) {
            manusia orang1 = new manusia();
            
        orang1.nama = "bell";
        orang1.umur = 13;
        orang1.alamat = "surabaya";
        
        System.out.println ("nama saya : " + orang1.nama);
        System.out.println ("umur saya : " + orang1.umur);
        System.out.println ("alamat saya : " + orang1.alamat);
        orang1.berjalan();
        orang1.berlari();
  
        manusia orang2 = new manusia();
        
        orang2.nama = "belia";
        orang2.umur = 20;
        orang2.alamat = "nganjuk";
        
        System.out.println ("nama saya : " + orang2.nama);
        System.out.println ("umur saya : " + orang2.umur);
        orang2.berjalan();
        System.out.println ("alamat saya : " + orang2.alamat);
        orang2.berlari();
    }
}
