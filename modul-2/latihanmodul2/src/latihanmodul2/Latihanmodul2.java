/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmodul2;

/**
 *
 * @author Asus
 */
class Mahasiswa {
        String Nama,Nim, Jurusan; 
        
        Mahasiswa(String InputNama,String InputNim,String InputJurusan) {
            Nama = InputNama;
            Nim = InputNim;
            Jurusan = InputJurusan;
            System.out.println("perkenalkan saya="+Nama);
            System.out.println("Nim saya="+Nim);
            System.out.println("Saya Jurusan="+Jurusan);
            System.out.println("apakah berhasil");
        }
}

public class Latihanmodul2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
       Mahasiswa Orang1 = new Mahasiswa ("Doni","230441100120","si");
    }
    
}
