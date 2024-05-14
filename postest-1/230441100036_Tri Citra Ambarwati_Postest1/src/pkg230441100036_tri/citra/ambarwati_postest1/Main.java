/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg230441100036_tri.citra.ambarwati_postest1;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {

        // Membuat objek konser
        Konser konser = new Konser("Konser Musik", "2024-04-15", 250000);

        // Membuat objek pembeli
        Pembeli pembeli1 = new Pembeli("Citra", 2);
        Pembeli pembeli2 = new Pembeli("Sagita", 3);

        // Menjual tiket
        konser.jualTiket(pembeli1.getJumlahTiket());
        konser.jualTiket(pembeli2.getJumlahTiket());

        // Menampilkan informasi konser
        konser.tampilInformasi();
    }
}
