/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

/**
 *
 * @author Tanji
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BangunRuang[] bangunRuangs = new BangunRuang[4]; 

        System.out.println("\nMasukkan sisi kubus: ");
        double sisiKubus = scanner.nextDouble();
        bangunRuangs[0] = new Kubus(sisiKubus);

        System.out.println("\nMasukkan panjang, lebar, dan tinggi balok: ");
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        bangunRuangs[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);

        System.out.println("\nMasukkan jari-jari dan tinggi tabung: ");
        System.out.print("Masukkan jari-jari tabung: ");
        double jariTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = scanner.nextDouble();
        bangunRuangs[2] = new Tabung(jariTabung, tinggiTabung);

        System.out.println("\nMasukkan jari-jari dan tinggi kerucut: ");
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggiKerucut = scanner.nextDouble();
        bangunRuangs[3] = new Kerucut(jariKerucut, tinggiKerucut);

        for (BangunRuang bangunRuang : bangunRuangs) {
            bangunRuang.info();
            double volume = bangunRuang.hitungVolume();
            System.out.println("Volume = " + volume);
        }

        scanner.close();
    }
}

