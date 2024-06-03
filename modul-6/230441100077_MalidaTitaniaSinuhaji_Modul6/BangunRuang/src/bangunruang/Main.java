
package bangunruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun ruang yang ingin dihitung volume:");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        BangunRuang bangun;

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi kubus: ");
                double sisiKubus = scanner.nextDouble();
                bangun = new Kubus(sisiKubus);
                break;
            case 2:
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();
                bangun = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                break;
            case 3:
                System.out.print("Masukkan jari-jari tabung: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();
                bangun = new Tabung(jariJariTabung, tinggiTabung);
                break;
            case 4:
                System.out.print("Masukkan jari-jari kerucut: ");
                double jariJariKerucut = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                double tinggiKerucut = scanner.nextDouble();
                bangun = new Kerucut(jariJariKerucut, tinggiKerucut);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        scanner.close();

        // Memanggil method hitungVolume() untuk objek yang dipilih
        System.out.println("Volume " + bangun.getClass().getSimpleName() + " adalah: " + bangun.hitungVolume());
    }
}

