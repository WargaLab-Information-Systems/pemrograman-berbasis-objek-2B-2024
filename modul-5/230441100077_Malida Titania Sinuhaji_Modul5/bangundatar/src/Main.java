import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bentuk bangun datar:");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga");
        System.out.println("3. Persegi");
        System.out.println("4. Lingkaran");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();

        double luas = 0.0;
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();
                PersegiPanjang persegiPanjang1 = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                luas = persegiPanjang1.hitungLuas();
                break;
            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alasSegitiga = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                Segitiga segitiga1 = new Segitiga(alasSegitiga, tinggiSegitiga);
                luas = segitiga1.hitungLuas();
                break;
            case 3:
                System.out.print("Masukkan sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();
                Persegi persegi1 = new Persegi(sisiPersegi);
                luas = persegi1.hitungLuas();
                break;
            case 4:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();
                Lingkaran lingkaran1 = new Lingkaran(jariJariLingkaran);
                luas = lingkaran1.hitungLuas();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        if (pilihan >= 1 && pilihan <= 4) {
            System.out.println("Luas: " + luas);
        }

        scanner.close();
    }
}
