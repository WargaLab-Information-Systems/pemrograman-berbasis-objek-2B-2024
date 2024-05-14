package pkg230441100036_tricitraambarwati_postest3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk konser
        Konser[] konserArray = new Konser[1];

        // Input data konser
        System.out.print("Masukkan nama konser                : ");
        String namaKonser = scanner.nextLine();
        System.out.print("Masukkan tanggal konser (dd/mm/yyyy): ");
        String tanggalKonser = scanner.nextLine();
        System.out.print("Masukkan harga tiket                : ");
        int hargaTiket = scanner.nextInt();
        konserArray[0] = new Konser(namaKonser, tanggalKonser, hargaTiket);

        // Membuat array untuk pembeli
        Pembeli[] pembeliArray = new Pembeli[1];

        for (int i = 0; i < pembeliArray.length; i++) {
            scanner.nextLine(); // consume newline
            System.out.print("Masukkan nama pembeli               : ");
            String namaPembeli = scanner.nextLine();
            System.out.print("Masukkan jumlah tiket untuk " + namaPembeli + "   : ");
            int jumlahTiket = scanner.nextInt();
            pembeliArray[i] = new Pembeli(namaPembeli, jumlahTiket);
        }

        // Menjual tiket ke pembeli
        for (Pembeli pembeli : pembeliArray) {
            konserArray[0].jualTiket(pembeli.getJumlahTiket());
        }

        // Menampilkan informasi konser
        konserArray[0].tampilInformasi();
    }
}
