/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<BangunRuang> bangunRuangs = new ArrayList<>();

        boolean loop = true;
        while (loop) {
            System.out.println("\nPilih jenis bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.println("5. Selesai");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = input.nextDouble();
                    bangunRuangs.add(new Kubus(sisiKubus));
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = input.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = input.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = input.nextDouble();
                    bangunRuangs.add(new Balok(panjangBalok, lebarBalok, tinggiBalok));
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = input.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = input.nextDouble();
                    bangunRuangs.add(new Tabung(jariJariTabung, tinggiTabung));
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = input.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = input.nextDouble();
                    bangunRuangs.add(new Kerucut(jariJariKerucut, tinggiKerucut));
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }

        System.out.println("\nVolume bangun ruang:");
        for (BangunRuang bangunRuang : bangunRuangs) {
            System.out.println(bangunRuang.hitungVolume());
        }

        System.out.println("\nInformasi bangun ruang:");
        for (BangunRuang bangunRuang : bangunRuangs) {
            if (bangunRuang instanceof Kubus) {
                ((Kubus) bangunRuang).info();
            } else if (bangunRuang instanceof Balok) {
                ((Balok) bangunRuang).info();
            } else if (bangunRuang instanceof Tabung) {
                ((Tabung) bangunRuang).info();
            } else if (bangunRuang instanceof Kerucut) {
                ((Kerucut) bangunRuang).info();
            }
        }
    }
}