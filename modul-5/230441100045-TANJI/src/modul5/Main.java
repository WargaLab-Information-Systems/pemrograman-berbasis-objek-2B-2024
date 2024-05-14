/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul5;

/**
 *
 * @author Tanji
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BangunDatar[] bangunDatars = new BangunDatar[4]; 

        System.out.println("\nMasukkan panjang dan lebar persegi panjang: ");
        System.out.print("Masukkan panjang: ");
        double panjangPersegiPanjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebarPersegiPanjang = scanner.nextDouble();
        bangunDatars[0] = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);

        System.out.println("\nMasukkan alas dan tinggi segitiga: ");
        System.out.print("Masukkan alas: ");
        double alasSegitiga = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggiSegitiga = scanner.nextDouble();
        bangunDatars[1] = new Segitiga(alasSegitiga, tinggiSegitiga);

        System.out.println("\nMasukkan sisi persegi: ");
        double sisiPersegi = scanner.nextDouble();
        bangunDatars[2] = new Persegi(sisiPersegi);

        System.out.println("\nMasukkan jari-jari lingkaran: ");
        double radiusLingkaran = scanner.nextDouble();
        bangunDatars[3] = new Lingkaran(radiusLingkaran);

        // Iterasi melalui array dan hitung serta tampilkan hasil
        for (BangunDatar bangunDatar : bangunDatars) {
            bangunDatar.hasil();
            double luas = bangunDatar.hitungLuas();
            System.out.println("Luas = " + luas);
        }

        scanner.close();
    }
}
