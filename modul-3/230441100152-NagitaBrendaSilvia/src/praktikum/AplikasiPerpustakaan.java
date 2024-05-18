package praktikum;

import java.util.Scanner;

public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaftarBuku daftarBuku = new DaftarBuku();

        System.out.print("Masukkan jumlah buku yang ingin dimasukkan: ");
        int X = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < X; i++) {
            System.out.println("Masukkan data buku ke-" + (i + 1));
            System.out.print("Judul: ");
            String judul = scanner.nextLine();
            System.out.print("Penulis: ");
            String penulis = scanner.nextLine();
            System.out.print("Publisher: ");
            String publisher = scanner.nextLine();
            System.out.print("Kategori (SU/D/R/A): ");
            String kategori = scanner.nextLine();
            System.out.print("Stok: ");
            int stok = scanner.nextInt();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = scanner.nextInt();
            scanner.nextLine(); 

            Buku buku = null;
            switch (kategori.toUpperCase()) {
                case "SU" -> buku = new BukuSemuaUmur(judul, penulis, publisher, stok, tahunTerbit);
                case "D" -> buku = new BukuDewasa(judul, penulis, publisher, stok, tahunTerbit);
                case "R" -> buku = new BukuRemaja(judul, penulis, publisher, stok, tahunTerbit);
                case "A" -> buku = new BukuAnakAnak(judul, penulis, publisher, stok, tahunTerbit);
                default -> System.out.println("Kategori tidak valid!");
            }
            if (buku != null) {
                daftarBuku.tambahBuku(buku);
            }
        }

        System.out.println("\nDaftar Buku:");
        daftarBuku.tampilkanDaftarBuku();
    }
}
