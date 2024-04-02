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
import java.util.ArrayList;
import java.util.Scanner;

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

            String jurusan;
            // Meminta input kode jurusan hingga valid
            while (true) {
                System.out.print("Masukkan kode jurusan (41-49): ");
                jurusan = scanner.nextLine();
                if ("41".equals(jurusan) || "42".equals(jurusan) || "43".equals(jurusan) ||
                    "44".equals(jurusan) || "48".equals(jurusan) || "49".equals(jurusan)) {
                    break; // Keluar dari loop jika kode jurusan valid
                } else {
                    System.out.println("Kode jurusan tidak valid. Silakan masukkan kode jurusan yang benar.");
                }
            }

            // Input data mahasiswa
            System.out.print("1. NIM: ");
            String nim = scanner.nextLine();
            System.out.print("2. NAMA: ");
            String nama = scanner.nextLine();
            System.out.print("3. ALAMAT: ");
            String alamat = scanner.nextLine();

            // Membuat objek Mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            ulangi = scanner.nextLine().charAt(0);
        } while (ulangi == 'Y' || ulangi == 'y');

        // Menampilkan daftar mahasiswa
        System.out.println("\nDaftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama Universitas: " + Universitas.getNamaUniversitas());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("NAMA: " + mahasiswa.getNama());
            System.out.println("ALAMAT: " + mahasiswa.getAlamat());
            System.out.println("JURUSAN: " + mahasiswa.getJurusan());
            System.out.println("--------------------------");
        }
        scanner.close();
    }
}

  

