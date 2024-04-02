/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AMANDA AULIA
 */
public class main {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
       ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Input Nama Universitas
        System.out.println("Masukkan Nama Universitas:");
        String namaUniversitas = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);
        
        char ulangi;
        do {
            // Input data mahasiswa
            System.out.println("------------------------");
            System.out.println("JURUSAN:");
            
            System.out.println("41:TEKNIK INFORMATIKA");
            System.out.println("42:TEKNIK INDUSTRI");
            System.out.println("43:TEKNIK ELEKTRO");
            System.out.println("44:SISTEM INFORMASI");
            System.out.println("48:TEKNIK MESIN");
            System.out.println("49:TEKNIK MEKATRONIKA");

            System.out.println("Masukkan data mahasiswa:");
            System.out.print("1. NIM: ");
            String nim = scanner.nextLine();
            System.out.print("2. NAMA: ");
            String nama = scanner.nextLine();
            System.out.print("3. ALAMAT: ");
            String alamat = scanner.nextLine();
            System.out.print("4. JURUSAN (41-49): ");
            String jurusan = scanner.nextLine();
            
            // Membuat objek Mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulangi = scanner.nextLine().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NamaUniversitas: " +Universitas.getNamaUniversitas());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("NAMA: " + mahasiswa.getNama());
            System.out.println("ALAMAT: " + mahasiswa.getAlamat());
            System.out.println("JURUSAN: " + mahasiswa.getJurusan());
            System.out.println("--------------------------");
        }
        scanner.close();
     }
}

        
