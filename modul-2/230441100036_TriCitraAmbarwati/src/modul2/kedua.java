/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class kedua {
    public static void main(String[] args) {
        String Mengulang = "Y";
        Scanner input = new Scanner(System.in);

        while (Mengulang.equalsIgnoreCase("Y")) {
            boolean validJurusan = false;
            String jurusan = "";

            System.out.println(" ");
            System.out.println(" -----Masukkan Data Mahasiswa----- ");
            System.out.print("Universitas : ");
            String universitas = input.nextLine();
            System.out.print("NIM         : ");
            String nim = input.nextLine();
            System.out.print("Nama        : ");
            String nama = input.nextLine();
            System.out.print("Alamat      : ");
            String alamat = input.nextLine();
            System.out.println(" ");

            System.out.println("=====DAFTAR JURUSAN=====");
            System.out.println("41. TEKNIK INFORMATIKA");
            System.out.println("42. TEKNIK INDUSTRI");
            System.out.println("43. TEKNIK ELEKTRO");
            System.out.println("44. SISTEM INFORMASI");
            System.out.println("48. TEKNIK MESIN");
            System.out.println("49. TEKNIK MEKATRONIKA");

            while (!validJurusan) {
                System.out.println(" ");
                System.out.print("Isi sesuai kode jurusan : ");
                jurusan = input.nextLine();

                switch (jurusan) {
                    case "41", "42", "43", "44", "48", "49" -> validJurusan = true;
                    default -> System.out.println("Kode jurusan tidak valid. Silakan coba lagi.");
                 
                }
            }

            System.out.println(" ");
            System.out.println("==========Data Mahasiswa==========");
            System.out.println("Universitas : " + universitas);
            System.out.println("NIM         : " + nim);
            System.out.println("Nama        : " + nama);
            System.out.println("Alamat      : " + alamat);
 
            switch (jurusan) {
                case "41" -> System.out.println("Jurusan :TEKNIK INFORMATIKA");
                case "42" -> System.out.println("Jurusan :TEKNIK INDUSTRI");
                case "43" -> System.out.println("Jurusan :TEKNIK ELEKTRO");
                case "44" -> System.out.println("Jurusan :SISTEM INFORMASI");
                case "48" -> System.out.println("Jurusan :TEKNIK MESIN");
                case "49" -> System.out.println("Jurusan :TEKNIK MEKATRONIKA");
            }

            System.out.println(" ");
            System.out.println("======================================");

            System.out.println("Mengulang lagi? (Y untuk Ya dan T untuk Tidak)");
            System.out.print("Masukkan pilihan : ");
            System.out.print(" ");
            Mengulang = input.nextLine();
        }

        System.out.println("===========================");
        System.out.println(" Terimakasih ");
        System.out.println("===========================");
    }
}
