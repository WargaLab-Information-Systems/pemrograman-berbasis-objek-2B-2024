/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manusia.pkg1a;

/**
 *
 * @author winar
 */

class identitas {
        String nama,alamat;
        int umur;
        long nim;
    
    public void nama(String nama){
        System.out.println("Kenalin ini tuh " + nama);
    }
    public void umur(int umur){
        System.out.println("Sekarang ini dia berumur " + umur);
    }
    public void alamat(String alamat){
        System.out.println("Dia tuh tinggalnya di " + alamat);
    }
    public void berjalan(String anggotatubuh1){
        System.out.println( "sekarang diatuh lagi " + anggotatubuh1);
    }
    public void berlari(String nama, String anggotatubuh2){
        System.out.println( "ini "+ nama + " larinya tuh " + anggotatubuh2 );
        System.out.println();
    }
}

public class Manusiabaru {
    
    public static void main(String[] args){
        identitas sihuman = new identitas();
        identitas sihuman2 = new identitas();
        identitas sihuman3 = new identitas();
        
        sihuman.nama(" Rafi ");
        sihuman.umur(19);
        sihuman.alamat(" Krian ");
        sihuman.berjalan(" jalan Kaki ");
        sihuman.berlari(" Rafi ", " lemes banget ");

        sihuman2.nama(" Rapii ");
        sihuman2.umur(19);
        sihuman2.alamat(" Sidoarjo ");
        sihuman2.berjalan(" santai ");
        sihuman2.berlari(" Rapii ", " cepat banget ");
        
        sihuman3.nama(" Pak wowo ");
        sihuman3.umur(34);
        sihuman3.alamat(" Bantengan ");
        sihuman3.berjalan(" Kaki ");
        sihuman3.berlari(" Pak Wowo "," ngos-ngosan banget ");
    }
}