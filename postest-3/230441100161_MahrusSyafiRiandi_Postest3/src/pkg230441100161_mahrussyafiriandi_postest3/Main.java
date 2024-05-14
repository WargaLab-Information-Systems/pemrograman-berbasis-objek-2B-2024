/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100161_mahrussyafiriandi_postest3;

/**
 *
 * @author 23-161 Mahrus S.R. 
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Kalkulator kalkulator = new Kalkulator();

            System.out.print("Masukkan Angka Pertama : ");
            int angka1 = scanner.nextInt();

            System.out.print("Masukkan Angka Kedua   : ");
            int angka2 = scanner.nextInt();

            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");

            System.out.print("Pilih Operasi Bilangan : ");
            int pilihan = scanner.nextInt();

            OperasiBilangan operasi = null; // Menggunakan interface sebagai tipe data

            switch (pilihan) {
                case 1 -> operasi = (OperasiBilangan) new Penjumlahan();
                case 2 -> operasi = (OperasiBilangan) new Pengurangan();
                case 3 -> operasi = (OperasiBilangan) new Perkalian();
                case 4 -> operasi = (OperasiBilangan) new Pembagian();
                default -> {
                    System.out.println("Pilihan tidak valid!");
                    System.exit(0);
                }
            }

            try {
                int hasil = kalkulator.operasi(operasi, angka1, angka2);
                System.out.println("Hasil : " + hasil);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
