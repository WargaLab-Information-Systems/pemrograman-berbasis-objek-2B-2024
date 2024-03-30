package com.mycompany.postest1;
import java.util.Scanner;

public class Postest1 {
    static class Peserta {
        private String nama;
        private int umur;
        private String email;

        public Peserta(String nama, int umur, String email) {
            this.nama = nama;
            this.umur = umur;
            this.email = email;
        }

        public void tampilkanInfo() {
            System.out.println("\nData Peserta:");
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur + " tahun");
            System.out.println("Email: " + email);
        }

        public void daftarKursus(String kursus) {
            System.out.println(nama + " telah berhasil mendaftar kursus " + kursus);
        }

        public static void informasiKursus(String namaKursus, int harga) {
            System.out.println("\nInformasi Kursus:");
            System.out.println("Nama Kursus: " + namaKursus);
            System.out.println("Harga: Rp" + harga);
        }

        public static boolean validasiUmur(int umur) {
            return umur >= 17;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Pendaftaran Kursus Online");
        System.out.println("===============================================");

        System.out.print("Masukkan nama peserta: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan umur peserta: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membaca newline character setelah nextInt()

        System.out.print("Masukkan email peserta: ");
        String email = scanner.nextLine();

        Peserta peserta = new Peserta(nama, umur, email);
        peserta.tampilkanInfo();

        if (Peserta.validasiUmur(umur)) {
            System.out.println("\nPilihan Kursus:");
            System.out.println("1. Java Programming (Rp500.000)");
            System.out.println("2. Web Development (Rp400.000)");
            System.out.print("Pilih kursus yang akan diikuti (1/2): ");
            int pilihanKursus = scanner.nextInt();
            scanner.nextLine(); // Membaca newline character setelah nextInt()

            switch (pilihanKursus) {
                case 1:
                    peserta.daftarKursus("Java Programming");
                    Peserta.informasiKursus("Java Programming", 500000);
                    break;
                case 2:
                    peserta.daftarKursus("Web Development");
                    Peserta.informasiKursus("Web Development", 400000);
                    break;
                default:
                    System.out.println("Pilihan kursus tidak valid.");
                    break;
            }
        } else {
            System.out.println("\nMaaf, peserta harus berusia 17 tahun ke atas untuk mendaftar kursus.");
        }

        System.out.println("\nTerima kasih telah menggunakan Sistem Pendaftaran Kursus Online.");
        scanner.close();
    }
}

