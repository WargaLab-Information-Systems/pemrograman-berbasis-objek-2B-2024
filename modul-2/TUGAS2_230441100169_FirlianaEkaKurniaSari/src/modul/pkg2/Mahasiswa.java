/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa extends Universitas {
   
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;

    public Mahasiswa(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJurusan() {
        return jurusan;
    }

    public String getJurusanNama() {
        switch (jurusan) {
            case 41:
                return "Teknik Informatika";
            case 42:
                return "Teknik Industri";
            case 43:
                return "Teknik Elektro";
            case 44:
                return "Sistem Informasi";
            case 48:
                return "Teknik Mesin";
            case 49:
                return "Teknik Mekatronika";
            default:
                return "Jurusan tidak dikenal";
        }
    }
}
    

