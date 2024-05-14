/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg3;

/**
 *
 * @author Lavilia
 */

import java.util.Scanner;

public class Siswa extends Orang implements Pendidikan {
    private static String namaSekolah;
    private double nilai;

    public Siswa(String nama, int umur, double nilai) {
        super(nama, umur);
        this.nilai = nilai;
    }

    public static void setNamaSekolah(String nama) {
        namaSekolah = nama;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Nilai: " + nilai);
        System.out.println("Sekolah: " + namaSekolah);
    }

    @Override
    public void belajar() {
        System.out.println(nama + " sedang belajar");
    }

    @Override
    public void ujian() {
        System.out.println(nama + " sedang ujian");
    }

    public void perbaruiNilai(double nilaiBaru) {
        this.nilai = nilaiBaru;
    }

    public void perbaruiNilai(double nilaiBaru, boolean showMessage) {
        this.nilai = nilaiBaru;
        if (showMessage) {
            System.out.println("Nilai baru telah diperbarui menjadi: " + nilaiBaru);
        }
    }

    public String cekKelulusan() {
        if (nilai >= 70) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama sekolah:");
        String namaSekolahInput = scanner.nextLine();
        setNamaSekolah(namaSekolahInput);

        System.out.println("Masukkan nama siswa:");
        String nama = scanner.nextLine();
        System.out.println("Masukkan umur siswa:");
        int umur = scanner.nextInt();
        System.out.println("Masukkan nilai siswa:");
        double nilai = scanner.nextDouble();
        Siswa siswa = new Siswa(nama, umur, nilai);

        System.out.println("\nInformasi Siswa:");
        siswa.tampilkanInfo();

        siswa.belajar();
        siswa.ujian();

        System.out.println("\nMasukkan nilai baru:");
        double nilaiBaru = scanner.nextDouble();
        siswa.perbaruiNilai(nilaiBaru, true);

        System.out.println("\nInformasi Siswa setelah perbarui nilai:");
        siswa.tampilkanInfo();

        System.out.println("\nStatus Kelulusan: " + siswa.cekKelulusan());

        scanner.close();
    }
}