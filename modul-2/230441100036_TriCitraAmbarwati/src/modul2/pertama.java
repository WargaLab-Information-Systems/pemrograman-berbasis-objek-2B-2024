/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author ACER
 */
public class pertama {

    static String universitas;
    static String nim;
    static String nama;
    static String alamat;
    static String jurusan;

    static String getuniversitas() {
        return universitas;
    }

    static String getnim() {
        return nim;
    }

    static String getnama() {
        return nama;
    }

    static String getalamat() {
        return alamat;
    }

    static String getjurusan() {
        return jurusan;
    }

    public static class Mahasiswa {
        public String universitas;
        public String nim;
        public String nama;
        public String alamat;
        public String jurusan;
        
        public Mahasiswa(String universitas,String nim, String nama, String alamat, String jurusan) {
            this.universitas = universitas;
            this.nim = nim;
            this.nama = nama;
            this.alamat = alamat;
            this.jurusan = jurusan;
        }
    }
}