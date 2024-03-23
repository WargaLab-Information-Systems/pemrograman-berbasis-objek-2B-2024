/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manusia.pkg1a;

/**
 *
 * @author winar
 */

//ini adalah sebuah class 
class identitas{
//    ini adalah atribute dari class yang berisi variabel atau bagian' dari obejek
    String nama,alamat;
    int umur;
    
////    ini adalah method atau fungsi yang dapat dipanggil berulang kali
//    public void nama(String nama){
//        System.out.println("Kenalin ini tuh " + nama);
//    }
//    public void umur(String umur){
//        System.out.println("Kenalin ini tuh " + umur);
//    }
//    public void alamat(String alamat){
//        System.out.println("Dia tuh tinggalnya di " + alamat);
//    }
    public void berjalan(){
        System.out.println( "Objek1 kan " + nama + " dia tuh lagi berjalan..");
    }
    public void berlari(){
        System.out.println( "Objek1 kan " + nama + " dia tuh lagi berlari..");
    }
}

public class manusia {
    //ini OOP (baru adalah parameter)   
    public static void main(String[] args){
//  --->mendeclare obeject di class manusia --> atribute objek = objek baru
        identitas baru = new identitas();
        identitas baru1 = new identitas();
        
//  --->ini memberi atribute ke objeknya
//  ini adalah objek 1 (baru)
        baru.nama = "Ar'raffi Abqori Nur Azizi";
        baru.alamat= "Sidoarjo";
        baru.umur = 19;
        System.out.println("Kenalin ini tuh " + baru.nama);
        System.out.println("Dia tuh tinggalnya di " + baru.alamat);
        System.out.println("Sekarang ini dia berumur " + baru.umur + " tahun");
//  --->ini perintah untuk menjalankan objek dengan memanggil si fungsinya
//        baru.nama(" Rafi ");
//        baru.nama("robet");
        baru.berjalan();
        baru.berlari();        
        
        
//  ini adalah objek 1 (baru)
        baru1.nama = "Mas Rapii";
        baru1.alamat = "Krian";
        baru1.umur = 19;
        System.out.println("Kenalin ini tuh " + baru1.nama);
        System.out.println("Dia tuh tinggalnya di " + baru1.alamat);
        System.out.println("Sekarang ini dia berumur " + baru1.umur + " tahun");
//  --->ini perintah untuk menjalankan objek dengan memanggil si fungsinya
        baru1.berjalan();
        baru1.berlari();

    }
}



