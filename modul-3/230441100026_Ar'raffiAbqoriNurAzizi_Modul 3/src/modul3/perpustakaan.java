package Modul3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class perpustakaan {
    static String judul_buku, penulis, penerbit, judul, kategori ;
    static Integer tahun_terbit, stok;
    
    public static void main(String[] args) {
        List<kategori_buku> buku = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print(" Masukkan Berapa kali Inputan Data ingin disimpan : ");
        int nomor_buku = input.nextInt();
        input.nextLine(); // Membuang newline setelah nextInt()
        
        for (int i = 0; i < nomor_buku; i++) {
            System.out.println("\n|======== DATA-DATA BUKU ========|");
            System.out.print("| JUDUL BUKU : ");
            String judul = input.nextLine();
            
            System.out.print("| PENULIS BUKU : ");
            String penulis = input.nextLine();
            
            System.out.print("| PENERBIT BUKU : ");
            String penerbit = input.nextLine();
//            perpustakaan.daftar();
            String kategori = "";
            while(true){
                System.out.println("|============ DAFTAR KATEGORI ============|");
                System.out.println("|========| INPUTAN | KETERANGAN |========|");
                System.out.println("|==========|  SU  | SEMUA UMUR |==========|");
                System.out.println("|==========|   D  | DEWASA     |==========|");
                System.out.println("|==========|   R  | REMAJA     |==========|");
                System.out.println("|==========|   A  | ANAK-ANAK  |==========|");
                System.out.print("| PILIH BERDASARKAN INPUTAN DIATAS : ");
                String inputkategori = input.next();
                if (inputkategori.equalsIgnoreCase("SU")) {
                    kategori = "Semua Umur";
                    break;
                } else if (inputkategori.equalsIgnoreCase("D")) {
                    kategori = "Dewasa";
                    break;
                } else if (inputkategori.equalsIgnoreCase("R")) {
                    kategori = "Remaja";
                    break;
                } else if (inputkategori.equalsIgnoreCase("A")) {
                    kategori = "Anak-anak";
                    break;
                } else {
                    System.out.println("==> kategori tidak valid, silakan coba lagi. <==");
                }
            }
            
            System.out.print("| STOK BUKU : ");
            int stok = input.nextInt();
            System.out.print("| TAHUN DITERBITKAN :");
            int tahun_terbit = input.nextInt();
            input.nextLine(); // Membuang newline setelah nextInt()
            
            buku.add(new kategori_buku(judul, penulis, penerbit, stok, tahun_terbit, kategori));
        }

        System.out.println("\n\n|============= DATA BUKU =============|");
        for(kategori_buku buku1 : buku){
            int i = 0;
            buku1.display(i);
        }
    }
}

