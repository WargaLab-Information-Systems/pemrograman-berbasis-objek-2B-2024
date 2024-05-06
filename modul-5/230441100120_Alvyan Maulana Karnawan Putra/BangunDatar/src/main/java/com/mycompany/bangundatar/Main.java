/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangundatar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BangunDatar> bangunDatars = new ArrayList<>();

        System.out.println("Masukkan jumlah bangun datar yang ingin Anda hitung luasnya:");
        int jumlahBangunDatar = scanner.nextInt();

        for (int i = 0; i < jumlahBangunDatar; i++) {
            System.out.println("Masukkan jenis bangun datar ke-" + (i + 1) + ":");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan panjang persegi panjang:");
                    double panjangPersegiPanjang = scanner.nextDouble();
                    System.out.println("Masukkan lebar persegi panjang:");
                    double lebarPersegiPanjang = scanner.nextDouble();
                    bangunDatars.add(new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang));
                    break;
                case 2:
                    System.out.println("Masukkan alas segitiga:");
                    double alasSegitiga = scanner.nextDouble();
                    System.out.println("Masukkan tinggi segitiga:");
                    double tinggiSegitiga = scanner.nextDouble();
                    bangunDatars.add(new Segitiga(alasSegitiga, tinggiSegitiga));
                    break;
                case 3:
                    System.out.println("Masukkan sisi persegi:");
                    double sisiPersegi = scanner.nextDouble();
                    bangunDatars.add(new Persegi(sisiPersegi));
                    break;
                case 4:
                    System.out.println("Masukkan jari-jari lingkaran:");
                    double jariLingkaran = scanner.nextDouble();
                    bangunDatars.add(new Lingkaran(jariLingkaran));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        for (BangunDatar bangunDatar : bangunDatars) {
            System.out.println("Luas: " + bangunDatar.hitungLuas());
            bangunDatar.info();
        }
        

        scanner.close();
    }
}
