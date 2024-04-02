/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kampus;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class proses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Ulang;

        System.out.println("Masukkan Nama Universitas:");
        String namaUniversitas = scan.nextLine();
        Kampus.setUniversitas(namaUniversitas);/*set univ dari krlas kampus, untuk mengatur nama*/

        do {
            System.out.println("Silahkan Input");
            System.out.println("NIM :");
            String nim = scan.nextLine();
            System.out.println("Nama :");
            String nama = scan.nextLine();
            System.out.println("Alamat :");
            String alamat = scan.nextLine();

            String jurusan = "";
            while (true) {
                System.out.println("Jurusan");
                System.out.println("41=TEKNIK INFORMATIKA");
                System.out.println("42=TEKNIK INDUSTRI");
                System.out.println("43=TEKNIK ELEKTRO");
                System.out.println("44=SISTEM INFORMASI");
                System.out.println("48=TEKNIK MESIN");
                System.out.println("49=TEKNIK MEKATRONIKA");
                System.out.println("Pilih Kode Jurusan :");
                String kodeJurusan = scan.nextLine();

                jurusan = switch (kodeJurusan) {/*menentukan jurusan berdasarkan kode*/
                    case "41" -> "TEKNIK INFORMATIKA";
                    case "42" -> "TEKNIK INDUSTRI";
                    case "43" -> "TEKNIK ELEKTRO";
                    case "44" -> "SISTEM INFORMASI";
                    case "48" -> "TEKNIK MESIN";
                    case "49" -> "TEKNIK MEKATRONIKA";
                    default -> "Tersedia";
                };

                if (!jurusan.equalsIgnoreCase("Tersedia")) {
                    break;
                } else {
                    System.out.println("Maaf, Jurusan yang Anda masukkan tidak tersedia.");
                }
            }

            Mahasiswa pertama = new Mahasiswa(nama, nim, alamat, jurusan);
            System.out.println("Nama :" + pertama.nama);
            System.out.println("NIM :" + pertama.nim);
            System.out.println("Alamat :" + pertama.alamat);
            System.out.println("Jurusan :" + pertama.jurusan);

            System.out.print("APAKAH ANDA INGIN MEMASUKKAN DATA LAGI ? Y/T:");
            Ulang = scan.nextLine();
        } while (Ulang.equalsIgnoreCase("Y"));
    }
}/*for= ketika iterasi sudah di kehahui, while= blok kode di uji sebelum di jalankan, 
do-while= blok kode di uji minim sekali sebelum kondisi di uji*/