package modul5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inginHitungLagi = true;

        // Membuat array untuk menyimpan objek bangun datar
        BangunDatar[] bangunDatarArray = new BangunDatar[4];

        while (inginHitungLagi) {
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
                    bangunDatarArray[0] = new persegipanjang(panjang, lebar);
                    bangunDatarArray[0].info();
                    System.out.println("Luas: " + bangunDatarArray[0].hitungLuas());
                    break;
                case 2:
                    double alas, tinggi;
                    System.out.println("Masukkan alas dan tinggi segitiga:");
                    alas = scanner.nextDouble();
                    tinggi = scanner.nextDouble();
                    bangunDatarArray[1] = new segitiga(alas, tinggi);
                    bangunDatarArray[1].info();
                    System.out.println("Luas: " + bangunDatarArray[1].hitungLuas());
                    break;
                case 3:
                    double sisi;
                    System.out.println("Masukkan panjang sisi persegi:");
                    sisi = scanner.nextDouble();
                    bangunDatarArray[2] = new persegi(sisi);
                    bangunDatarArray[2].info();
                    System.out.println("Luas: " + bangunDatarArray[2].hitungLuas());
                    break;
                case 4:
                    double jari;
                    System.out.println("Masukkan jari-jari lingkaran:");
                    jari = scanner.nextDouble();
                    bangunDatarArray[3] = new lingkaran(jari);
                    bangunDatarArray[3].info();
                    System.out.println("Luas: " + bangunDatarArray[3].hitungLuas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            System.out.println("Apakah Anda ingin menghitung bangun datar lagi? (ya/tidak)");
            String jawaban = scanner.next();
            if (!jawaban.equalsIgnoreCase("ya")) {
                inginHitungLagi = false;
            }
        }

        scanner.close();
    }
}


