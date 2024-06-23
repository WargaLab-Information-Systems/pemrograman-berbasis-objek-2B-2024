/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg2;

import java.util.Scanner;
/**
 *
 * @author AMANDA AULIA
 */

public class mobil {
    static class Mobil {
        private static int totalMobil = 0;
        private String merk;
        private String model;
        private int tahunProduksi;

        // Konstruktor
        public Mobil(String merk, String model, int tahunProduksi) {
            this.merk = merk;
            this.model = model;
            this.tahunProduksi = tahunProduksi;
            totalMobil++;
        }

        // Metode untuk menampilkan informasi mobil
        public void tampilkanInfo() {
            System.out.println("Merk: " + merk);
            System.out.println("Model: " + model);
            System.out.println("Tahun Produksi: " + tahunProduksi);
        }

        
        // Metode untuk memeriksa apakah mobil dibuat oleh produsen tertentu
        public boolean dibuatOleh(String namaProdusen) {
        if (this.merk.equalsIgnoreCase(namaProdusen)) {
        return true;
        } else {
        return false;
    }
}


        // Metode untuk memperbarui tahun produksi mobil
        public void perbaruiTahunProduksi(int tahunBaru) {
            this.tahunProduksi = tahunBaru;
            System.out.println("Tahun Produksi berhasil diperbarui.");
        }

        public static int getTotalMobil() {
            return totalMobil;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat instansi kelas Mobil dengan informasi merek dan model yang telah ditentukan
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);
        Mobil mobil2 = new Mobil("Honda", "Jazz", 2018);
        Mobil mobil3 = new Mobil("Suzuki", "Ertiga", 2019);

        // Menampilkan informasi setiap mobil
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();

        System.out.println();

        // Memeriksa apakah mobil dibuat oleh produsen tertentu
        System.out.print("Masukkan merek mobil yang ingin Anda periksa: ");
        String merekPeriksa = input.nextLine();

        if (mobil1.dibuatOleh(merekPeriksa)) {
            System.out.println("Anda memilih mobil Avanza.");
            System.out.print("Masukkan tahun produksi baru untuk Avanza: ");
            int tahunProduksiBaru = input.nextInt();
            mobil1.perbaruiTahunProduksi(tahunProduksiBaru);
        } else if (mobil2.dibuatOleh(merekPeriksa)) {
            System.out.println("Anda memilih mobil Jazz.");
            System.out.print("Masukkan tahun produksi baru untuk Jazz: ");
            int tahunProduksiBaru = input.nextInt();
            mobil2.perbaruiTahunProduksi(tahunProduksiBaru);
        } else if (mobil3.dibuatOleh(merekPeriksa)) {
            System.out.println("Anda memilih mobil Ertiga.");
            System.out.print("Masukkan tahun produksi baru untuk Ertiga: ");
            int tahunProduksiBaru = input.nextInt();
            mobil3.perbaruiTahunProduksi(tahunProduksiBaru);
        } else {
            System.out.println("Merek mobil yang Anda masukkan tidak tersedia.");
            System.exit(0); // Program berhenti jika merek tidak tersedia
        }

        System.out.println("\nInformasi mobil setelah pembaruan:");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();

        // Menutup objek Scanner
        input.close();

        // Mendapatkan total jumlah mobil
        System.out.println("Total jumlah mobil: " + Mobil.getTotalMobil());
    }
}

