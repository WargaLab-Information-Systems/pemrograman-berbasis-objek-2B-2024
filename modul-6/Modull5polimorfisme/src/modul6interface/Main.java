/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul6interface;

/**
 *
 * @author H
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk nilai-nilai objek
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisiKubus = scanner.nextDouble();
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJariTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = scanner.nextDouble();
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggiKerucut = scanner.nextDouble();

        // Membuat objek-objek dengan nilai yang dimasukkan pengguna
        Kubus kubus = new Kubus(sisiKubus);
        Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
        Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);

        // Memanggil method info() untuk masing-masing objek
        kubus.info();
        balok.info();
        tabung.info();
        kerucut.info();

        scanner.close();
    }
}
