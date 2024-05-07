/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull.pkg5;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar[] bangunDatars = new BangunDatar[4];

        int choice;
        do {
            System.out.println("\nPilih bangun datar:");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    bangunDatars[0] = new PersegiPanjang(panjang, lebar);
                    break;
                case 2:
                    System.out.print("Masukkan alas: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();
                    bangunDatars[1] = new Segitiga(alas, tinggi);
                    break;
                case 3:
                    System.out.print("Masukkan sisi: ");
                    double sisi = scanner.nextDouble();
                    bangunDatars[2] = new Persegi(sisi);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = scanner.nextDouble();
                    bangunDatars[3] = new Lingkaran(jariJari);
                    break;
                case 0:
                    System.out.println("Terima kasih! Sampai jumpa lagi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            // Menampilkan informasi dan menghitung luas setiap bangun datar yang sudah dimasukkan
            for (BangunDatar bangunDatar : bangunDatars) {
                if (bangunDatar != null) {
                    System.out.println("=============================================");
                    bangunDatar.info();
                    System.out.println("Hasil Luasnya adalah: " + bangunDatar.hitungLuas());
                    System.out.println("=============================================");
                }
            }
        } while (choice != 0);

        scanner.close();
    }
}

