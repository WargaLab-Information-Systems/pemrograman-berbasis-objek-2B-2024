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
        System.out.println("Nama: \t \t" + nama);
        System.out.println("NIM: \t \t" + nim);
        System.out.println("Jurusan/Prodi: \t" + prodi);
        System.out.println("Alamat: \t" + alamat);
        System.out.println("========================================");
    }

    public static void main(String[] args ){
        siswanya baru = new siswanya();
        baru.inputannya();
        baru.tampilkanInfo();
    }
}

