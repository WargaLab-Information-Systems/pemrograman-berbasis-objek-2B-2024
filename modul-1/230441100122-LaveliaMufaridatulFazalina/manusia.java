/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg1;

/**
 *
 * @author Lavilia
 */
public class manusia {
    String nama, alamat;
    int umur;
    
    public void berjalan(){
        System.out.println("saya sedang berjalan");
    }
    public void berlari (){
        System.out.println("sedang berlari");
        
    }
    public static void main(String[] args) {
        manusia manusiaA = new manusia ();
        manusiaA.nama = "Lavelia";
        manusiaA.umur = 18;
        manusiaA.alamat = "yogyakarta";
        System.out.println("nama saya "+ manusiaA.nama);
        System.out.println("umur saya "+ manusiaA.umur);
        System.out.println("alamat saya "+ manusiaA.alamat);
        manusiaA.berjalan ();
        manusiaA.berlari();
    }
}
