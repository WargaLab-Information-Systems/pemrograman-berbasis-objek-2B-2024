/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100036_tri.citra.ambarwati_postest1;

/**
 *
 * @author ACER
 */
public class Konser {
    private String namaKonser;
    private String tanggalKonser;
    private int hargaTiket;
    private static int totalTiketTerjual = 0;

    public Konser(String namaKonser, String tanggalKonser, int hargaTiket) {
        this.namaKonser = namaKonser;
        this.tanggalKonser = tanggalKonser;
        this.hargaTiket = hargaTiket;
    }

    public String getNamaKonser() {
        return namaKonser;
    }

    public String getTanggalKonser() {
        return tanggalKonser;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public static int getTotalTiketTerjual() {
        return totalTiketTerjual;
    }

    public void jualTiket(int jumlahTiket) {
        totalTiketTerjual += jumlahTiket;
    }

    public void tampilInformasi() {
        System.out.println("Nama Konser: " + namaKonser);
        System.out.println("Tanggal Konser: " + tanggalKonser);
        System.out.println("Harga Tiket: Rp" + hargaTiket);
        System.out.println("Total Tiket Terjual: " + totalTiketTerjual);
    }
}
