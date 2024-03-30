/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg1;

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
            return this.merk.equalsIgnoreCase(namaProdusen);
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
        // Membuat instansi kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);
        Mobil mobil2 = new Mobil("Honda", "Jazz", 2018);
        Mobil mobil3 = new Mobil("Suzuki", "Ertiga", 2019);

        // Menampilkan informasi setiap mobil
        mobil1.tampilkanInfo();
        System.out.println();

        mobil2.tampilkanInfo();
        System.out.println();

        mobil3.tampilkanInfo();
        System.out.println();

        // Memeriksa apakah mobil dibuat oleh produsen tertentu
        System.out.println("Apakah Avanza dibuat oleh Toyota? " + mobil1.dibuatOleh("Toyota"));
        System.out.println();

        // Memperbarui tahun produksi untuk sebuah mobil
        mobil1.perbaruiTahunProduksi(2021);
        mobil1.tampilkanInfo();
        System.out.println();

        // Mendapatkan total jumlah mobil
        System.out.println("Total jumlah mobil: " + Mobil.getTotalMobil());
    }
}

