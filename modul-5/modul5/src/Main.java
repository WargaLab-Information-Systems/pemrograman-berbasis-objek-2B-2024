/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunDatar[] bangunDatars = new BangunDatar[4];

        boolean lanjutkan = true;
        while (lanjutkan) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Persegi Panjang");
            System.out.println("2. Input Segitiga");
            System.out.println("3. Input Persegi");
            System.out.println("4. Input Lingkaran");
            System.out.println("5. Tampilkan Objek");
            System.out.println("6. Hapus Objek");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan (1-7): ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang dan lebar persegi panjang (dipisahkan dengan spasi): ");
                    double panjang = scanner.nextDouble();
                    double lebar = scanner.nextDouble();
                    bangunDatars[0] = new PersegiPanjang(panjang, lebar);
                    break;
                case 2:
                    System.out.print("Masukkan alas dan tinggi segitiga (dipisahkan dengan spasi): ");
                    double alas = scanner.nextDouble();
                    double tinggi = scanner.nextDouble();
                    bangunDatars[1] = new Segitiga(alas, tinggi);
                    break;
                case 3:
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = scanner.nextDouble();
                    bangunDatars[2] = new Persegi(sisi);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = scanner.nextDouble();
                    bangunDatars[3] = new Lingkaran(jariJari);
                    break;
                case 5:
                    for (BangunDatar bangunDatar : bangunDatars) {
                        if (bangunDatar != null) {
                            System.out.println("Luas: " + bangunDatar.hitungLuas());
                            bangunDatar.info();
                            System.out.println();
                        }
                    }
                    break;
                case 6:
                    System.out.print("Masukkan indeks objek yang ingin dihapus (0-3): ");
                    int indeks = scanner.nextInt();
                    if (indeks >= 0 && indeks < bangunDatars.length) {
                        bangunDatars[indeks] = null;
                        System.out.println("Objek dengan indeks " + indeks + " telah dihapus.");
                    } else {
                        System.out.println("Indeks tidak valid.");
                    }
                    break;
                case 7:
                    lanjutkan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}