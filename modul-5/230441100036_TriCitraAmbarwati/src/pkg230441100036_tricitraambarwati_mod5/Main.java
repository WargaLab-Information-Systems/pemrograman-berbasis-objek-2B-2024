package pkg230441100036_tricitraambarwati_mod5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        BangunDatar[] bangunan = new BangunDatar[50]; 

        int jumlahBangunan = 0;

        while (ulang) {
            System.out.println("\n-----Pilih Jenis Bangun Datar-----");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.println("----------------------------------");
            System.out.print("\nMasukkan Pilihan Anda (angka): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 -> {
                    System.out.print("\nMasukkan panjang (P) dari persegi panjang : ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar (L) dari persegi panjang : ");
                    double lebar = scanner.nextDouble();
                    bangunan[jumlahBangunan] = new PersegiPanjang(panjang, lebar);
                }
                case 2 -> {
                    System.out.print("\nMasukkan alas (A) dari segitiga : ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi (T) dari segitiga : ");
                    double tinggi = scanner.nextDouble();
                    bangunan[jumlahBangunan] = new Segitiga(alas, tinggi);
                }
                case 3 -> {
                    System.out.print("\nMasukkan sisi (S) dari persegi : ");
                    double sisiPersegi = scanner.nextDouble();
                    bangunan[jumlahBangunan] = new Persegi(sisiPersegi);
                }
                case 4 -> {
                    System.out.print("\nMasukkan jari-jari (r) dari lingkaran : ");
                    double jari = scanner.nextDouble();
                    bangunan[jumlahBangunan] = new Lingkaran(jari);
                }
                default -> {
                    System.out.println("\nPilihan tidak valid");
                    return;
                }
            }

            jumlahBangunan++; 

            System.out.print("\nApakah Anda ingin menghitung lagi? (ya/tidak) : ");
            String jawab = scanner.next();
            ulang = jawab.equalsIgnoreCase("ya");
        }

        for (int i = 0; i < jumlahBangunan; i++) {
            System.out.println("------------------------------------");
            bangunan[i].info();
            System.out.println("\nLuas bangun datar ke-" + (i + 1) + " adalah = " + bangunan[i].hitungLuas());
            System.out.println("\n");
        }
    }
}
