package pkg230441100036_tricitraambarwati_3;
import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menyiapkan array untuk menyimpan buku-buku perpustakaan
        BukuPerpustakaan[] daftarBuku = new BukuPerpustakaan[10];
        int jumlahBuku = 0;

        // Memasukkan data buku sebanyak beberapa kali
        char ulangi;
        do {
            System.out.println("Masukkan data buku ke-" + (jumlahBuku + 1) + ":");
            System.out.println("_________________________");
            System.out.print("Judul        : ");
            String judul = input.nextLine();
            System.out.print("Penulis      : ");
            String penulis = input.nextLine();
            System.out.print("Publisher    : ");
            String publisher = input.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = input.nextInt();
            input.nextLine(); // Membersihkan newline

            String kategori;
            boolean kategoriValid;
            do {
                System.out.print("Kategori (SU/D/R/A) : ");
                kategori = input.nextLine();

                // Memeriksa apakah kategori valid
                if (kategori.equals("SU") || kategori.equals("D") || kategori.equals("R") || kategori.equals("A")) {
                    kategoriValid = true;
                } else {
                    System.out.println("Kategori yang Anda masukkan tidak valid.");
                    kategoriValid = false;
                }
            } while (!kategoriValid);

            System.out.print("Stok         : ");
            int stok = input.nextInt();

            // Membuat objek BukuPerpustakaan dan menyimpannya ke dalam array
            daftarBuku[jumlahBuku] = new BukuPerpustakaan(judul, penulis, publisher, tahunTerbit, kategori, stok);
            jumlahBuku++;

            System.out.print("\nApakah ingin memasukkan data buku lagi? (y/n) : ");
            ulangi = input.next().charAt(0);
            input.nextLine(); // Membersihkan newline
        } while (ulangi == 'Y' || ulangi == 'y');



        // Menampilkan daftar buku yang telah dimasukkan
        System.out.println("__________________________________________________");
        System.out.println("\nDaftar Buku:");
        System.out.println("");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Buku ke-" + (i + 1));
            daftarBuku[i].displayInfo();
            System.out.println("____________________________");
            System.out.println();
        }

        input.close();
    }
}
