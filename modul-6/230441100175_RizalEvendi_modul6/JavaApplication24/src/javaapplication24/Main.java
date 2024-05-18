/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author M S I
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        BangunRuang[] bangunRuangArray = new BangunRuang[4];
        bangunRuangArray[0] = new Kubus(sisiKubus);
        bangunRuangArray[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        bangunRuangArray[2] = new Tabung(jariJariTabung, tinggiTabung);
        bangunRuangArray[3] = new Kerucut(jariJariKerucut, tinggiKerucut);

        for (BangunRuang bangunRuang : bangunRuangArray) {
            bangunRuang.info();
            System.out.println("Volume: " + bangunRuang.hitungVolume());
            System.out.println();
        }

        scanner.close();
    }
}


