package posttes1;
//class esekusi
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama kereta: ");
            String namaKereta = scanner.nextLine();
            System.out.print("Masukkan jarak tempuh (km): ");
            double jarak = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline dari buffer
            System.out.print("Masukkan tujuan: ");
            String tujuan = scanner.nextLine();
            System.out.print("Masukkan kapasitas penumpang: ");
            int kapasitasPenumpang = scanner.nextInt();
            System.out.print("Masukkan harga per kilometer: ");
            double hargaPerKm = scanner.nextDouble();

            KeretaApi bisnis = new Bisnis(namaKereta, jarak, tujuan, kapasitasPenumpang, hargaPerKm);
            KeretaApi ekonomi = new Ekonomi(namaKereta, jarak, tujuan, kapasitasPenumpang, hargaPerKm);
            KeretaApi eksekutif = new Eksekutif(namaKereta, jarak, tujuan, kapasitasPenumpang, hargaPerKm);

            //  perjalanan Bisnis
            System.out.println("\nInformasi Perjalanan Kelas Bisnis:");
            bisnis.tampilkanInformasiPerjalanan();
            System.out.println("Biaya perjalanan: Rp " + bisnis.hitungBiaya(hargaPerKm));

            //  perjalanan Ekonomi
            System.out.println("\nInformasi Perjalanan Kelas Ekonomi:");
            ekonomi.tampilkanInformasiPerjalanan();
            System.out.println("Biaya perjalanan: Rp " + ekonomi.hitungBiaya(hargaPerKm));

            // perjalanan Eksekutif
            System.out.println("\nInformasi Perjalanan Kelas Eksekutif:");
            eksekutif.tampilkanInformasiPerjalanan();
            System.out.println("Biaya perjalanan: Rp " + eksekutif.hitungBiaya(hargaPerKm));
        }
        
    }
    
}
    

