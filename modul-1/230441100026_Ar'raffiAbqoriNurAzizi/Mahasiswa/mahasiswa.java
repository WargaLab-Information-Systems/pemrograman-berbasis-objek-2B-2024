
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;
import java.util.Scanner;
/**
 *
 * @author winar
 */

class siswanya {
    String nama, prodi, alamat;
    Long nim;
    Scanner inputan = new Scanner(System.in);

    public void inputannya(){
        System.out.print("Masukkan Nama Mahasiswa: ");
        nama = inputan.nextLine();
        System.out.print("Masukkan Nim Mahasiswa: ");
        nim = inputan.nextLong();
        inputan.nextLine();
        System.out.print("Masukkan Prodi/Jurusan Mahasiswa: ");
        prodi = inputan.nextLine();
        System.out.print("Masukkan Alamat Mahasiswa: ");
        alamat = inputan.nextLine();
    }
    
    public void tampilkanInfo() {
        System.out.println("========================================");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
        System.out.println("========================================");

    }
}

public class mahasiswa {
    public static void main(String[] args ){
        siswanya baru = new siswanya();
        baru.inputannya();
        baru.tampilkanInfo();
    }
}









///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Mahasiswa;
//import java.util.Scanner;
///**
// *
// * @author winar
// */
//
//public class mahasiswa {
//    
//    public static void main(String[] args){
////  deklarasi variabel 
//    String nama,prodi,alamat,nim;
//        
//    Scanner inputan = new Scanner(System.in);
//    
//    System.out.println("Ketik Nama Mahasiswa : ");
//    nama = inputan.nextLine();
//    
//    System.out.println("Ketik Nim Mahasiswa : ");
//    nim = inputan.nextLine();
//    inputan.nextLine();
//    
//    System.out.println("Ketik Prodi Mahasiswa : ");
//    prodi = inputan.nextLine();
//    
//    System.out.println("Ketik Alamat Mahasiswa : ");
//    alamat = inputan.nextLine();
//    
//    System.out.println();
//    System.out.println("==========''=========");
//    System.out.println("Nama Mahasiswa : " + nama);
//    System.out.println("Nim Mahasiswa : " + nim);
//    System.out.println("Prodi Mahasiswa : " + prodi);
//    System.out.println("Alamat Mahasiswa : " + alamat);
//
//    }
//
//}






//class identitas {
//    String nama, prodi, alamat;
//    int nim;
//    
//    public void nama(String nama){
//        System.out.println(" --Masukkan Nama lengkap : " +  inputan);
//    }
//    public void prodi(String prodi){
//        System.out.println(" --Masukkan Program Studi : " + prodi);
//    }
//} 
//

//
//
//public class mahasiswa {
//    
//    public static void main (String[] args){
//        
////      membuat objeknya
//        Scanner inputan = new Scanner(System.in);
//        identitas diri = new identitas();
//        
//        
////        diri.nama = "Rafi";
////        diri.nama = ("masukkan Nama Lengkap : " + inputan);
//
//        diri.nama = inputan.nextLine();
//        
////        manusianya.nama ("rafii");
////        manusianya.prodi("Sistem Informasi"); 
//
//        System.out.println(diri.nama);
////        System.out.println("");
//    }
//}