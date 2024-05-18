/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bagundatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Lingkaran");

        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                double panjang, lebar;
                System.out.println("Masukkan panjang dan lebar persegi panjang:");
                panjang = scanner.nextDouble();
                lebar = scanner.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                persegiPanjang.info();
                System.out.println("Luas: " + persegiPanjang.hitungLuas());
                break;
            case 2:
                double alas, tinggi;
                System.out.println("Masukkan alas dan tinggi segitiga:");
                alas = scanner.nextDouble();
                tinggi = scanner.nextDouble();
                Segitiga segitiga = new Segitiga(alas, tinggi);
                segitiga.info();
                System.out.println("Luas: " + segitiga.hitungLuas());
                break;
            case 3:
                double sisi;
                System.out.println("Masukkan panjang sisi persegi:");
                sisi = scanner.nextDouble();
                Persegi persegi = new Persegi(sisi);
                persegi.info();
                System.out.println("Luas: " + persegi.hitungLuas());
                break;
            case 4:
                double jari;
                System.out.println("Masukkan jari-jari lingkaran:");
                jari = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jari);
                lingkaran.info();
                System.out.println("Luas: " + lingkaran.hitungLuas());
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}