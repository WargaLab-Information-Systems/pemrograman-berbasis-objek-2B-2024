/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPilih operasi bilangan:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan program ini.");
                break;
            }

            System.out.print("Masukkan nilai pertama: ");
            double b = scanner.nextDouble();

            System.out.print("Masukkan nilai kedua: ");
            double c = scanner.nextDouble();

            switch (pilihan) {
                case 1:
                    ClassPenjumlahan penjumlahan = new ClassPenjumlahan();
                    penjumlahan.set_B(b);
                    penjumlahan.set_C(c);
                    penjumlahan.set_D();
                    penjumlahan.tampil();
                    break;
                case 2:
                    ClassPengurangan pengurangan = new ClassPengurangan();
                    pengurangan.set_B(b);
                    pengurangan.set_C(c);
                    pengurangan.set_D();
                    pengurangan.tampil();
                    break;
                case 3:
                    ClassPerkalian perkalian = new ClassPerkalian();
                    perkalian.set_B(b);
                    perkalian.set_C(c);
                    perkalian.set_D();
                    perkalian.tampil();
                    break;
                case 4:
                    ClassPembagian pembagian = new ClassPembagian();
                    pembagian.set_B(b);
                    pembagian.set_C(c);
                    pembagian.set_D();
                    pembagian.tampil();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
