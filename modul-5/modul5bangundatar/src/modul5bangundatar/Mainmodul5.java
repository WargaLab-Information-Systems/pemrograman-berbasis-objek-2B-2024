
package modul5bangundatar;
 
import java.util.Scanner;

public class Mainmodul5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean continueExecution = true;

        // Array untuk menyimpan objek-objek BangunDatar
        BangunDatar[] bangunDatarArray = new BangunDatar[4];

        // Mengisi array dengan objek-objek dari kelas turunan
        bangunDatarArray[0] = new PersegiPanjang(4, 5);
        bangunDatarArray[1] = new Segitiga(3, 6);
        bangunDatarArray[2] = new Persegi(7);
        bangunDatarArray[3] = new Lingkaran(4);

        do {
            System.out.println("Pilihan kelas 1 - 4 :");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Persegi");
            System.out.println("4. Lingkaran");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    executePersegiPanjang(bangunDatarArray[0]);
                    break;
                case 2:
                    executeSegitiga(bangunDatarArray[1]);
                    break;
                case 3:
                    executePersegi(bangunDatarArray[2]);
                    break;
                case 4:
                    executeLingkaran(bangunDatarArray[3]);
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid.");
            }

            System.out.print("Apakah Anda ingin melanjutkan? (iya, tidak): ");
            String continueChoice = scanner.next();
            continueExecution = continueChoice.equalsIgnoreCase("iya");

        } while (continueExecution);
    }

    private static void executePersegiPanjang(BangunDatar bangunDatar) {
        PersegiPanjang persegiPanjang = (PersegiPanjang) bangunDatar;
        System.out.println("Luas persegi panjang tersebut adalah : " + persegiPanjang.hitungLuas());
    }

    private static void executeSegitiga(BangunDatar bangunDatar) {
        Segitiga segitiga = (Segitiga) bangunDatar;
        segitiga.info();
    }

    private static void executePersegi(BangunDatar bangunDatar) {
        Persegi persegi = (Persegi) bangunDatar;
        persegi.info();
    }

    private static void executeLingkaran(BangunDatar bangunDatar) {
        Lingkaran lingkaran = (Lingkaran) bangunDatar;
        lingkaran.info();
    }
}
