package modul6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulang = null;
        
        do {
            int pilihan;
            while (true) {
                System.out.println("============ Pilih bangun ruang :==========");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Kerucut");
                System.out.println("===========================================");
                System.out.print("Masukkan pilihan Anda (1-4): ");
                
                // Validasi input
                if (scanner.hasNextInt()) {
                    pilihan = scanner.nextInt();
                    if (pilihan >= 1 && pilihan <= 4) {
                        break; // Input valid, keluar dari loop
                    } else {
                        System.out.println("Pilihan tidak valid. Masukkan angka antara 1 hingga 4.");
                    }
                } else {
                    System.out.println("Pilihan tidak valid. Masukkan angka antara 1 hingga 4.");
                    scanner.next(); // Clear buffer
                }
            }
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    Kubus kubus = new Kubus(sisiKubus);
                    kubus.info();
                    System.out.println("Volume: " + kubus.hitungVolume());
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    balok.info();
                    System.out.println("Volume: " + balok.hitungVolume());
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    tabung.info();
                    System.out.println("Volume: " + tabung.hitungVolume());
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);
                    kerucut.info();
                    System.out.println("Volume: " + kerucut.hitungVolume());
                    break;
            }
            
            do {
                System.out.println("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
                ulang = scanner.next();
                if (!ulang.equalsIgnoreCase("ya") && !ulang.equalsIgnoreCase("tidak")) {
                    System.out.println("Input tidak valid. Mohon masukkan 'ya' atau 'tidak'.");
                }
            } while (!ulang.equalsIgnoreCase("ya") && !ulang.equalsIgnoreCase("tidak"));   
            
        } while (ulang.equalsIgnoreCase("ya")); 
        
        System.out.println("Terima kasih telah menggunakan program.");
        scanner.close();
    }
}
