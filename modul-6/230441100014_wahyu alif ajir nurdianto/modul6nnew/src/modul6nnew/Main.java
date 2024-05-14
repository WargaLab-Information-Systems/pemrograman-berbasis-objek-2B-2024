/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6nnew;

/**
 *
 * @author I MASTER ZEN
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lanjut;
        
        do {
            System.out.println("\nMasukkan sisi kubus: ");
            double sisiKubus = scanner.nextDouble();
            BangunRuang kubus = new Kubus(sisiKubus);

            System.out.println("\nMasukkan panjang, lebar, dan tinggi balok: ");
            System.out.println("Masukkan panjang balok: ");
            double panjangBalok = scanner.nextDouble();
            System.out.println("Masukkan lebar balok: ");
            double lebarBalok = scanner.nextDouble();
            System.out.println("Masukkan tinggi balok: ");
            double tinggiBalok = scanner.nextDouble();
            BangunRuang balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);

            System.out.println("\nMasukkan jari-jari dan tinggi tabung: ");
            System.out.println("Masukkan jari-jari tabung: ");
            double jariTabung = scanner.nextDouble();
            System.out.println("Masukkan tinggi tabung: ");
            double tinggiTabung = scanner.nextDouble();
            BangunRuang tabung = new Tabung(jariTabung, tinggiTabung);

            System.out.println("\nMasukkan jari-jari dan tinggi kerucut: ");
            System.out.println("Masukkan jari-jari kerucut: ");
            double jariKerucut = scanner.nextDouble();
            System.out.println("Masukkan tinggi kerucut: ");
            double tinggiKerucut = scanner.nextDouble();
            BangunRuang kerucut = new Kerucut(jariKerucut, tinggiKerucut);
            
            
            System.out.println("==========================================");
            double volumeKubus = kubus.hitungVolume();
            kubus.info();
            System.out.println("Volume Kubus = " + volumeKubus);
            
            System.out.println("===============");
            double volumeBalok = balok.hitungVolume();
            balok.info();
            System.out.println("Volume Balok = " + volumeBalok);
            
            System.out.println("===============");
            double volumeTabung = tabung.hitungVolume();
            tabung.info();
            System.out.println("Volume Tabung = " + volumeTabung);
            
            
            System.out.println("===============");
            double volumeKerucut = kerucut.hitungVolume();
            kerucut.info();
            System.out.println("Volume Kerucut = " + volumeKerucut);
            System.out.println("===========================================");

            System.out.println("\nApakah Anda ingin mengulangi (Y/N)? ");
            lanjut = scanner.next().charAt(0);
        } while (lanjut == 'Y' || lanjut == 'y');
    }
}
