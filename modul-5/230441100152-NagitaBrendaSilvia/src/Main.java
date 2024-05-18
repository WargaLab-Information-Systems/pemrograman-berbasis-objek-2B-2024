import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BangunDatar> bangunDatarList = new ArrayList<>();
        while (true) {
        System.out.println("_________________________________________");
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Lingkaran");
        System.out.println("5. Selesai");
        System.out.println("=========================================");
        System.out.print ("Masukkan pilihan: ");

    int choice = scanner.nextInt();

    if (choice == 5) {
        break;
    }

    switch (choice) {
        case 1:
            System.out.print("Masukkan panjang: ");
            double panjang = scanner.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = scanner.nextDouble();
            bangunDatarList.add(new PersegiPanjang(panjang, lebar));
            System.out.println("Luas: " + (panjang * lebar));
            break;
        case 2:
            System.out.print("Masukkan alas: ");
            double alas = scanner.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = scanner.nextDouble();
            bangunDatarList.add(new Segitiga(alas, tinggi));
            System.out.println("Luas: " + (0.5 * alas * tinggi));
            break;
        case 3:
            System.out.print("Masukkan sisi: ");
            double sisi = scanner.nextDouble();
            bangunDatarList.add(new Persegi(sisi));
            System.out.println("Luas: " + (sisi * sisi));
            break;
        case 4:
            System.out.  print("Masukkan jari-jari: ");
            double jariJari = scanner.nextDouble();
            bangunDatarList.add(new Lingkaran(jariJari));
            System.out.println("Luas: " + (Math.PI * jariJari * jariJari));
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            break;
    }
}
        scanner.close();
    }
}