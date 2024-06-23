/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg3.amanda;

/**
 *
 * @author AMANDA AULIA
 */
public class Main {
    public static void main(String[] args) {
        // Membuat instansi kelas Mobil, MobilSedan, dan MobilSUV
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020);
        MobilSedan mobil2 = new MobilSedan("Honda", "Civic", 2018, "Sedan");
        MobilSUV mobil3 = new MobilSUV("Suzuki", "Jimny", 2019, true);

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

