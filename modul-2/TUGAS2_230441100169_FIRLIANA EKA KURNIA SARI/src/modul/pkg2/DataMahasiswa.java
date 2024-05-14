/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg2;
import java.util.ArrayList;
import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan nama universitas: ");
        Universitas.setNamaUniversitas(scanner.nextLine());

        while (true) {
            System.out.println("\nMasukkan data mahasiswa baru:");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Jurusan (41. Teknik Informatika, 42. Teknik Industri, 43. Teknik Elektro, 44. Sistem Informasi, 48. Teknik Mesin, 49. Teknik Mekatronika, 50. Jurusan Tidak Ada): ");
            int jurusan = scanner.nextInt();
            scanner.nextLine(); 

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin menambahkan data mahasiswa lagi? (Y/T) ");
            String lanjut = scanner.nextLine();
            if (!lanjut.equalsIgnoreCase("Y")) {
                break;
            }
        }

        System.out.println("\nDaftar Mahasiswa di " + Universitas.getNamaUniversitas() + ":");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("NIM: " + m.getNim());
            System.out.println("Nama: " + m.getNama());
            System.out.println("Alamat: " + m.getAlamat());
            System.out.println("Jurusan: " + m.getJurusanNama());
            System.out.println();
        }
    }
}
