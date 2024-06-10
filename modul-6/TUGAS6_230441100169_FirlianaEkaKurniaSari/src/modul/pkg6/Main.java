/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Pilih bangun ruang:");
      System.out.println("1. Kubus");
      System.out.println("2. Balok");
      System.out.println("3. Tabung");
      System.out.println("4. Kerucut");
      System.out.println("0. Keluar");

      System.out.print("Masukkan pilihan: ");
      int pilihan = scanner.nextInt();

      if (pilihan == 0) {
        break;
      }

      double sisi, panjang, lebar, tinggi, jariJari;

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan sisi kubus: ");
          sisi = scanner.nextDouble();
          hitungVolumeKubus(sisi);
          break;
        case 2:
          System.out.print("Masukkan panjang balok: ");
          panjang = scanner.nextDouble();
          System.out.print("Masukkan lebar balok: ");
          lebar = scanner.nextDouble();
          System.out.print("Masukkan tinggi balok: ");
          tinggi = scanner.nextDouble();
          hitungVolumeBalok(panjang, lebar, tinggi);
          break;
        case 3:
          System.out.print("Masukkan jari-jari tabung: ");
          jariJari = scanner.nextDouble();
          System.out.print("Masukkan tinggi tabung: ");
          tinggi = scanner.nextDouble();
          hitungVolumeTabung(jariJari, tinggi);
          break;
        case 4:
          System.out.print("Masukkan jari-jari kerucut: ");
          jariJari = scanner.nextDouble();
          System.out.print("Masukkan tinggi kerucut: ");
          tinggi = scanner.nextDouble();
          hitungVolumeKerucut(jariJari, tinggi);
          break;
        default:
          System.out.println("Pilihan tidak valid.");
      }

      System.out.println();
    }

    scanner.close();
  }

  private static void hitungVolumeKubus(double sisi) {
    double volume = sisi * sisi * sisi;
    System.out.println("Volume kubus: " + volume);
  }
 
  private static void hitungVolumeBalok(double panjang, double lebar, double tinggi) {
    double volume = panjang * lebar * tinggi;
    System.out.println("Volume balok: " + volume);
  }

  private static void hitungVolumeTabung(double jariJari, double tinggi) {
    double volume = Math.PI * jariJari * jariJari * tinggi;
    System.out.println("Volume tabung: " + volume);
  }

  private static void hitungVolumeKerucut(double jariJari, double tinggi) {
    double volume = (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    System.out.println("Volume kerucut: " + volume);
  }
}   

