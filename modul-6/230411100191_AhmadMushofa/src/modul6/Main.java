package modul6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih bangun ruang yang ingin diinputkan:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.print("Pilihan (1-4): ");
            int pilihan = scanner.nextInt();

            BangunRuang bangunRuang = null;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunRuang = new Kubus(sisiKubus);
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuang = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuang = new Tabung(jariJariTabung, tinggiTabung);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    bangunRuang = new Kerucut(jariJariKerucut, tinggiKerucut);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; 
            }

            bangunRuang.info();
            System.out.println();

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String lagi = scanner.next();
            if (!lagi.equalsIgnoreCase("ya")) {
                break;
            }
        }

        scanner.close();
    }
}
