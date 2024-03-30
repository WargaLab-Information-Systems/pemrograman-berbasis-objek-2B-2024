/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Buku {
    private static int jumlahBuku = 0;
    private String judul;
    private int tahunTerbit;
    private double harga;

    public Buku(String judul, int tahunTerbit, double harga) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        Buku.jumlahBuku++;
    }

    public static int getJumlahBuku() {
        return Buku.jumlahBuku;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getInfoBuku() {
        return "Judul: " + judul + ", Tahun Terbit: " + tahunTerbit + ", Harga: Rp" + harga;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi buku:");
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        System.out.print("Harga: Rp");
        double harga = scanner.nextDouble();

        Buku buku1 = new Buku(judul, tahunTerbit, harga);

        System.out.println("\nInformasi Buku:");
        System.out.println(buku1.getInfoBuku());
        System.out.println("Total buku: " + Buku.getJumlahBuku());
    }
}
