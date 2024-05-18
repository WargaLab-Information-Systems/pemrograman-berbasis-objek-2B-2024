/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul2;

import java.util.Scanner;

public class HAL3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        HAL2.setNamaUniversitas(namaUniversitas);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        HAL1[] daftarMahasiswa = new HAL1[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.println("Pilih Jurusan : ");
            System.out.println("1 = TEKNIK INFORMATIKA");
            System.out.println("2 = TEKNIK INDUSTRI,");
            System.out.println("3 = TEKNIK ELEKTRO");
            System.out.println("4 = SISTEM INFORMASI");
            System.out.println("5 = TEKNIK MESIN");
            System.out.println("6 = TEKNIK MEKATRONIKA");
            System.out.print("Jurusan (1-6): ");
            int jurusan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            HAL1 mahasiswa = new HAL1(nim, nama, alamat, jurusan);
            daftarMahasiswa[i] = mahasiswa;
        }

        System.out.println("\nDaftar Mahasiswa di " + HAL2.getNamaUniversitas() + ":");
        for (HAL1 m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + getJurusanString(m.getJurusan()));
            System.out.println();
        }
    }

    private static String getJurusanString(int jurusan) {
        return switch (jurusan) {
            case 1 -> "Teknik Informatika";
            case 2 -> "Teknik Industri";
            case 3 -> "Teknik Elektro";
            case 4 -> "Sistem Informasi";
            case 5 -> "Teknik Mesin";
            case 6 -> "Teknik Mekatronika";
            default -> "Jurusan tidak valid";
        };
    }
}

