import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunRuang[] bangunRuangs = new BangunRuang[1];

        boolean running = true;

        while (running) {
            System.out.println("Pilih Bangun Ruang yang mau dihitung: ");
            System.out.println("1. Kubus ");
            System.out.println("2. Balok");
            System.out.println("3. Tabung ");
            System.out.println("4. Kerucut ");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan sisi Kubus: ");
                    double sisi = input.nextDouble();
                    bangunRuangs[0] = new Kubus(sisi);
                    break;
                case "2":
                    System.out.print("Masukkan panjang Balok: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar Balok: ");
                    double lebar = input.nextDouble();
                    System.out.print("Masukkan tinggi Balok: ");
                    double tinggi = input.nextDouble();
                    bangunRuangs[0] = new Balok(panjang, lebar, tinggi);
                    break;
                case "3":
                    System.out.print("Masukkan jari-jari Tabung: ");
                    double jariJari = input.nextDouble();
                    System.out.print("Masukkan tinggi Tabung: ");
                    double tinggiTabung = input.nextDouble();
                    bangunRuangs[0] = new Tabung(jariJari, tinggiTabung);
                    break;
                case "4":
                    System.out.print("Masukkan jari-jari Kerucut: ");
                    double jariJariKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi Kerucut: ");
                    double tinggiKerucut = input.nextDouble();
                    bangunRuangs[0] = new Kerucut(jariJariKerucut, tinggiKerucut);
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    continue;
            }

            if (bangunRuangs[0] != null) {
                bangunRuangs[0].info();
                System.out.println();
                input.nextLine();
            }
        }


    }
}