/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Perpustakaan perpustakaan = new Perpustakaan("Judul Buku", "Penulis Buku", "Penerbit Buku", "SU", 10, 2023);
        perpustakaan.entryBuku();
        perpustakaan.viewDaftarBuku();
    }
}
    