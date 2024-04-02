/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull.pkg2;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Lavilia
 */

public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        ArrayList<mahasiswa> daftarMahasiswa = new ArrayList<>();

        
         System.out.println("Masukkan Nama Universitas:");
         String namaUniversitas = scanner.nextLine();

        char ulangi;
        do {
            
            System.out.println("------------------------");
            System.out.println("JURUSAN:");
            
            System.out.println("41:TEKNIK INFORMATIKA");
            System.out.println("42:TEKNIK INDUSTRI");
            System.out.println("43:TEKNIK ELEKTRO");
            System.out.println("44:SISTEM INFORMASI");
            System.out.println("48:TEKNIK MESIN");
            System.out.println("49:TEKNIK MEKATRONIKA");

            System.out.println("Masukkan data mahasiswa:");
            
            System.out.print("1. NAMA: ");
            String nama = scanner.nextLine();
            System.out.print("2. NIM: ");
            String nim = scanner.nextLine();
            System.out.print("3. ALAMAT: ");
            String alamat = scanner.nextLine();
            System.out.print("4. JURUSAN (41-49): ");
            String jurusan = scanner.nextLine();

            
            mahasiswa mahasiswa = new mahasiswa(nim, nama, alamat, jurusan, namaUniversitas);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulangi = scanner.nextLine().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        
        System.out.println("\nDaftar Mahasiswa:");
        for (mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("---------------------------------");
            System.out.println("UNIVERSITAS: " + mahasiswa.getNamaUniversitas()); 
            System.out.println("NAMA: " + mahasiswa.getNama());
            System.out.println("ALAMAT: " + mahasiswa.getAlamat());
            System.out.println("JURUSAN: " + mahasiswa.getJurusan());
        }

        scanner.close();
    }
}