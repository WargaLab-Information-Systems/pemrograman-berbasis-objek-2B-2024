/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author Asus
 */

public class Manusia {
    String Nama,Alamat;
    int Umur,Berjalan,Berlari;
    
    public void berjalan(){
        System.out.println("Object " + this.Nama + " berjalan Sejauh "+ this.Berjalan + "KM");
    }
    public void berlari (){
        System.out.println("Object " + this.Nama + " Sedang berlari " + this.Berlari + "KM");  
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------------------");
        System.out.println("CONTOH OBJECT ORANG KE 1 ");
        System.out.println("--------------------------");
        
//     ini adalah objek orang 1 dari class manusia
        Manusia Orang1 = new Manusia();
        
        Orang1.Nama = "Dony Eka Octavian Putra";
        Orang1.Umur = 19;
        Orang1.Alamat ="sidoarjo";
        Orang1.Berjalan = 4;
        Orang1.Berlari = 15;
        System.out.println("Perkenalkan Nama saya "+Orang1.Nama);
        System.out.println("Tahun ini saya Berumur "+Orang1.Umur + "Tahun");
        System.out.println("Saya Berasal dari Kota "+Orang1.Alamat);
        Orang1.berjalan();
        Orang1.berlari();
        
        System.out.println("--------------------------");
        System.out.println("CONTOH OBJECT ORANG KE 2 ");
        System.out.println("--------------------------");
        Manusia Orang2 = new Manusia();
        Orang2.Nama = "Donzz";
        Orang2.Umur = 19;
        Orang2.Alamat ="Bojonegoro";
        Orang2.Berjalan = 10;
        Orang2.Berlari = 20;
        System.out.println("Perkenalkan Nama saya "+Orang2.Nama);
        System.out.println("Tahun ini saya Berumur "+Orang2.Umur + " Tahun");
        System.out.println("Saya Berasal dari Kota "+Orang2.Alamat);
        Orang2.berjalan();
        Orang2.berlari();
           
    }
}



//
//System.out.println("--------------------------");
//System.out.println("CONTOH OBJECT ORANG KE 2 ");
//System.out.println("--------------------------");
//Manusia Orang2 = new Manusia();
//Orang2.Nama = "Fajri";
//Orang2.Umur = 19;
//Orang2.Alamat ="Surabaya";
//Orang2.Berjalan = 21;
//Orang2.Berlari = 20;
//System.out.println("Perkenalkan Nama saya "+Orang2.Nama);
//System.out.println("Tahun ini saya Berumur "+Orang2.Umur + " Tahun");
//System.out.println("Saya Berasal dari Kota "+Orang2.Alamat);
//Orang2.berjalan();
//Orang2.berlari();
//}
//}
