import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("Pilih bangun datar yang ingin dihitung luasnya:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Lingkaran");
        
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                BangunDatar persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                persegiPanjang.info();
                break;
            case 2:
                System.out.print("Masukkan alas: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiSegitiga = scanner.nextDouble();
                BangunDatar segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                segitiga.info();
                break;
            case 3:
                System.out.print("Masukkan sisi: ");
                double sisiPersegi = scanner.nextDouble();
                BangunDatar persegi = new Persegi(sisiPersegi);
                persegi.info();
                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                double jariJariLingkaran = scanner.nextDouble();
                BangunDatar lingkaran = new Lingkaran(jariJariLingkaran);
                lingkaran.info();
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
    }
}
