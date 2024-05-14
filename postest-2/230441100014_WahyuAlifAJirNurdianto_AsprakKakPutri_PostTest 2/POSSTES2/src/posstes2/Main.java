package POSSTES2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari berbagai jenis kereta api
        KeretaApi eksekutif = new KeretaEksekutif("Argo Bromo", 720, "Surabaya", 300);
        KeretaApi ekonomi = new KeretaEkonomi("Gaya Baru", 720, "Surabaya", 500);

        System.out.println("=== Informasi Kereta Eksekutif ===");
        eksekutif.tampilkanInformasiPerjalanan();
        System.out.println("Biaya Perjalanan: " + eksekutif.hitungBiaya(10000) + " IDR");

        System.out.println();

        System.out.println("=== Informasi Kereta Ekonomi ===");
        ekonomi.tampilkanInformasiPerjalanan();
        System.out.println("Biaya Perjalanan: " + ekonomi.hitungBiaya(5000) + " IDR");
    }
}
