package pkg230441100124_muhammadiqbalfaza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        listBuku ListBuku = new listBuku();
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1. Tambahkan buku ");
            System.out.println("2. Tampilkan daftar buku");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihanmu : ");

            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan berapa banyak buku yang ingin anda input: ");
                    int jumlahBuku = input.nextInt();
                    input.nextLine();
                    for (int a = 0; a < jumlahBuku; a++) {
                        System.out.println("Masukkan data buku ke " + a);
                        System.out.print("Judul\t\t\t: ");
                        String judul = input.nextLine();
                        System.out.print("Penulis\t\t\t: ");
                        String penulis = input.nextLine();
                        System.out.print("Publisher\t\t: ");
                        String publisher = input.nextLine();
                        System.out.print("Kategori\t\t: ");
                        char kategori = input.nextLine().charAt(0);
                        System.out.print("Stock\t\t\t: ");
                        String stock = input.nextLine();
                        System.out.print("Tahun Terbit\t: ");
                        String tahunTerbit = input.nextLine();

                        daftarBuku daftarBuku1 = new daftarBuku(judul, penulis, publisher, stock, tahunTerbit, kategori);
                        ListBuku.tambahBuku(daftarBuku1);
                    }
                    break;
                case 2:
                    ListBuku.tampilkanListBuku();
                    break;
                case 3:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    System.out.println("Perintah yang anda masukkan salah");
                    break;
            }
        }
    }
}
