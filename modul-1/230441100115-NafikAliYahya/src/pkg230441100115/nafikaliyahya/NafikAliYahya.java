/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100115.nafikaliyahya;

/**
 *
 * @author Administrator
 */
class Manusia{
    
    String nama;
    int umur;
    String alamat;
    
    public Manusia(String nama, int umur, String alamat){
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;  
    }
    
    public void berjalan1(){
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang berjalan\n");
    } 
    
    public void berlari(){
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang berlari\n");
    } 
    
    public void berjalan2(){
        System.out.println("nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("alamat : " + alamat);
        System.out.println("saat ini sedang berjalan");
    } 
}

public class NafikAliYahya {

    public static void main(String[] args) {
        Manusia manusia1 = new Manusia("nafik", 20, "lamongan");
        Manusia manusia2 = new Manusia("kepin", 19, "meduro");
        Manusia manusia3 = new Manusia("joni", 18, "jepang");
        
        manusia1.berjalan1();
        manusia2.berlari();
        manusia3.berjalan2();
    }    
}
