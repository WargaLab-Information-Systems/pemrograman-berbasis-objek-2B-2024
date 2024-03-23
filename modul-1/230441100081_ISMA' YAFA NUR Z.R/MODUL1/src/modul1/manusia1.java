/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul1;

/**
 *
 * @author HP VICTUS
 */

public class manusia1 {
    String nama, alamat ;
    int umur ;

    public void berjalan (){
        System.out.println("Saya adalah " + nama + " saya sedang berjalan" );
    }
    public void berlari (){
        System.out.println("kemudian " + nama + " sekarang sedang berlari setelah berjalan tadii");
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // orang pertama
        manusia1 org1 = new manusia1();
        org1.nama = "isma";
        org1.umur = 20;
        org1.alamat = "situbondo";
        System.out.println ("nama saya : " + org1.nama);
        System.out.println ("umur saya : " + org1.umur);
        System.out.println ("alamat saya : " + org1.alamat);
        org1.berjalan();
        org1.berlari();
        // orang kedua
        manusia1 org2 = new manusia1();
        org2.nama = "rapi";
        org2.umur = 19;
        org2.alamat = "krian";
        System.out.println ("nama saya : " + org2.nama);
        System.out.println ("umur saya : " + org2.umur);
        System.out.println ("alamat saya : " + org2.alamat);
        org2.berjalan();
        org2.berlari();
        // orang ketiga
        manusia1 org3 = new manusia1();
        org3.nama = "nopal";
        org3.umur = 19;
        org3.alamat = "Darjo";
        System.out.println ("nama saya : " + org3.nama);
        System.out.println ("umur saya : " + org3.umur);
        System.out.println ("alamat saya : " + org3.alamat);
        org3.berjalan();
        org3.berlari();
        
        
        
        
                
    }
}