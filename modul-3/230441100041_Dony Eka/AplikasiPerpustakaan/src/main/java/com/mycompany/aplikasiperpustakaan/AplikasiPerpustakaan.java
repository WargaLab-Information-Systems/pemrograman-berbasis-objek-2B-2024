package com.mycompany.aplikasiperpustakaan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class AplikasiPerpustakaan {
    private String judul, penulis, publisher, kategori;
    private int stok, tahunTerbit;

    public AplikasiPerpustakaan(String judul, String penulis, String publisher, String kategori, int stok, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.kategori = kategori;
        this.stok = stok;
        this.tahunTerbit = tahunTerbit;
    }

    public static void main(String[] args) {
        ArrayList<AplikasiPerpustakaan> listAplikasiPerpustakaan = new ArrayList<>();
        Scanner AB = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Buku : ");
        int jumlahBuku = AB.nextInt();
        AB.nextLine(); // untuk membaca karakter baru setelah nextInt

        for (int i = 0; i < jumlahBuku; i++){
            System.out.println("Buku " + (i + 1) + "");
            System.out.println("Pilih Kategori Buku :");
            System.out.println("SU = Semua Umur ");
            System.out.println("D = Dewasa ");
            System.out.println("R = Remaja ");
            System.out.println("A = Anak-anak");

            String kategori = AB.nextLine();
            if (kategori.equalsIgnoreCase("SU")) {
                kategori = "Semua Umur";
            } else if (kategori.equalsIgnoreCase("D")) {
                kategori = "Dewasa";
            } else if (kategori.equalsIgnoreCase("R")) {
                kategori = "Remaja";
            } else if (kategori.equalsIgnoreCase("A")) {
                kategori = "Anak-anak";
            } else {
                System.out.println("Kategori tidak valid, default Semua Umur.");
                kategori = "Semua Umur";
            }
            AplikasiPerpustakaan aplikasiperpustakaan = new AplikasiPerpustakaan("", "", "", kategori, 0, 0);
            aplikasiperpustakaan.Input(AB); // Pass Scanner as parameter
            listAplikasiPerpustakaan.add(aplikasiperpustakaan);
        }

        System.out.println("Daftar Buku ");
        for (int i = 0; i < listAplikasiPerpustakaan.size(); i++){
            listAplikasiPerpustakaan.get(i).Tampil(i);
            System.out.println();
        }
    }

    public void Input(Scanner AB){ // Add Scanner parameter
        System.out.println("Masukkan Judul Buku : ");
        judul = AB.nextLine();
        System.out.println("Masukkan Nama Penulis : ");
        penulis = AB.nextLine();
        System.out.println("Masukkan Perusahaan Penerbit Buku : ");
        publisher = AB.nextLine();
        System.out.println("Masukkan Stok Buku : ");
        stok = AB.nextInt();
        System.out.println("Masukkan Tahun Terbit : ");
        tahunTerbit = AB.nextInt();
        AB.nextLine(); // untuk membaca karakter baru setelah nextInt
    }

    public void Tampil (int index){
        System.out.println("Buku " + (index + 1));
        System.out.println("Judul : " + judul);
        System.out.println("Penulis :" + penulis);
        System.out.println("Penerbit :" + publisher);
        System.out.println("Kategori :" + kategori);
        System.out.println("Stok :" + stok);
        System.out.println("Tahun Terbit :" + tahunTerbit);
    }

    // Getter and setter methods
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
}
