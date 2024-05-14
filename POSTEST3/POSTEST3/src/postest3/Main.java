/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data untuk Smartphone
        System.out.print("Masukkan merek smartphone: ");
        String merekSmartphone = scanner.nextLine();
        System.out.print("Masukkan model smartphone: ");
        String modelSmartphone = scanner.nextLine();
        System.out.print("Masukkan tahun produksi smartphone: ");
        int tahunProduksiSmartphone = scanner.nextInt();
        System.out.print("Masukkan harga smartphone: ");
        double hargaSmartphone = scanner.nextDouble();
        System.out.print("Masukkan kapasitas memori smartphone (GB): ");
        int kapasitasMemoriSmartphone = scanner.nextInt();
        System.out.print("Masukkan jumlah piksel kamera smartphone: ");
        int kameraPikselSmartphone = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        // Input data untuk FeaturePhone
        System.out.print("Masukkan merek featurephone: ");
        String merekFeaturephone = scanner.nextLine();
        System.out.print("Masukkan model featurephone: ");
        String modelFeaturephone = scanner.nextLine();
        System.out.print("Masukkan tahun produksi featurephone: ");
        int tahunProduksiFeaturephone = scanner.nextInt();
        System.out.print("Masukkan harga featurephone: ");
        double hargaFeaturephone = scanner.nextDouble();
        System.out.print("Apakah featurephone memiliki kamera? (true/false): ");
        boolean memilikiKameraFeaturephone = scanner.nextBoolean();
        System.out.print("Apakah featurephone memiliki radio? (true/false): ");
        boolean memilikiRadioFeaturephone = scanner.nextBoolean();
        scanner.nextLine(); // Membersihkan buffer

        // Membuat objek Smartphone dan FeaturePhone
        Smartphone smartphone = new Smartphone(merekSmartphone, modelSmartphone, tahunProduksiSmartphone, hargaSmartphone, kapasitasMemoriSmartphone, kameraPikselSmartphone);
        Featurehandphone featurephone = new Featurehandphone(merekFeaturephone, modelFeaturephone, tahunProduksiFeaturephone, hargaFeaturephone, memilikiKameraFeaturephone, memilikiRadioFeaturephone);

        // Menampilkan spesifikasi menggunakan polimorfisme
        tampilkanSpesifikasi(smartphone);
        tampilkanSpesifikasi(featurephone);

        // Memanggil metode statis cetakInfoProduksi()
        System.out.println("\nInformasi Produksi Smartphone:");
        Handphone.cetakInfoProduksi(smartphone);
        System.out.println("\nInformasi Produksi Featurephone:");
        Handphone.cetakInfoProduksi(featurephone);
    }

    // Metode untuk menampilkan spesifikasi menggunakan polimorfisme
    private static void tampilkanSpesifikasi(Displayable displayable) {
        displayable.tampilkanSpesifikasi();
    }
}
