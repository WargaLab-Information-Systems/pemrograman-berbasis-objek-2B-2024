/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulll.pkg1;

/**
 *
 * @author AMANDA AULIA
 */
public class manusiaa {
    String nama;
    int umur;
    String alamat;
    
    public void berjalan () {
        System.out.println("saya sekarang sedang berjalan");
    }
    public void berlari (){
        System.out.println("kemudian saya sedang berlari");

    }
    public void berdiri (){
        System.out.println(" sekarang sedang berdiri");
    }
    public static void main(String[] args) {
        manusiaa manusia1 = new manusiaa ();
        manusia1.nama = "amanda";
        manusia1.umur = 18;
        manusia1.alamat = "malang";
        System.out.println("nama saya "+ manusia1.nama);
        System.out.println("umur saya "+ manusia1.umur);
        System.out.println("alamat saya "+ manusia1.alamat);
        manusia1.berjalan();
        manusia1.berlari();
        manusia1.berdiri();
        
        manusiaa manusia2 = new manusiaa();
        
        manusia2.nama = "aulia";
        manusia2.umur = 20;
        manusia2.alamat = "bali";
        System.out.println("nama saya "+ manusia2.nama);
        System.out.println("umur saya "+ manusia2.umur);
        System.out.println("alamat saya "+ manusia2.alamat);
        manusia2.berjalan();
        manusia2.berlari();
        
 
    }
}

    
