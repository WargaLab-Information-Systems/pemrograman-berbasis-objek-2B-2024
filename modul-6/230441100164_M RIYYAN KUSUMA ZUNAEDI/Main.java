package belajarpbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nPilih bangun ruang yang ingin dihitung volumenya:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    BangunRuang kubus = new Kubus(sisiKubus);
                    double volumeKubus = kubus.hitungVolume();
                    kubus.info();
                    System.out.println("Volume Kubus = " + volumeKubus);
                    break;
                case 2:
                    System.out.print("\nMasukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    BangunRuang balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    double volumeBalok = balok.hitungVolume();
                    balok.info();
                    System.out.println("Volume Balok = " + volumeBalok);
                    break;
                case 3:
                    System.out.print("\nMasukkan jari-jari tabung: ");
                    double jariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    BangunRuang tabung = new Tabung(jariTabung, tinggiTabung);
                    double volumeTabung = tabung.hitungVolume();
                    tabung.info();
                    System.out.println("Volume Tabung = " + volumeTabung);
                    break;
                case 4:
                    System.out.print("\nMasukkan jari-jari kerucut: ");
                    double jariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    BangunRuang kerucut = new Kerucut(jariKerucut, tinggiKerucut);
                    double volumeKerucut = kerucut.hitungVolume();
                    kerucut.info();
                    System.out.println("Volume Kerucut = " + volumeKerucut);
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 0);
    }
}
