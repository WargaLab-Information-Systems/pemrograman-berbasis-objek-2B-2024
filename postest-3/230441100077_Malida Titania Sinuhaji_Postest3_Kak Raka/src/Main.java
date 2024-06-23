
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama buah: ");
        String namaBuah = scanner.nextLine();

        int beratBuah;
        while (true) {
            System.out.print("Masukkan berat buah (gram): ");
            beratBuah = scanner.nextInt();
            if (beratBuah > 0) {
                break;
            } else {
                System.out.println("Berat buah harus lebih dari 0.");
            }
        }

        Buah buah = new Buah(namaBuah, beratBuah);

        System.out.println("\n=== Info Buah ===");
        buah.infoBuah();

        System.out.println("\n=== Teks Berat Buah ===");
        System.out.println("Teks Berat: " + buah.teksBerat());

        System.out.println("\n=== Jumlah Buah ===");
        System.out.println("Jumlah Buah: " + Buah.getJumlahBuah());

        scanner.close();
    }
}