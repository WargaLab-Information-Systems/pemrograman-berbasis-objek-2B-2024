/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;


interface JariJari {
    double getJariJari();
}

interface Lebar {
    double getLebar();
}

interface Tinggi {
    double getTinggi();
}


abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract void info();
}


class Kubus extends BangunRuang implements Lebar {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double getLebar() {
        return sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public void info() {
        System.out.println("Kubus dengan sisi: " + sisi);
        System.out.println("Volume: " + hitungVolume());
    }
}


class Balok extends BangunRuang implements Lebar, Tinggi {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void info() {
        System.out.println("Balok dengan panjang: " + panjang + ", lebar: " + lebar + ", dan tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}


class Tabung extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Tabung dengan jari-jari: " + jariJari + " dan tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}


class Kerucut extends BangunRuang implements JariJari, Tinggi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3) * Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Kerucut dengan jari-jari: " + jariJari + " dan tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] bangunRuangArray = new BangunRuang[4]; 

        while (true) {
            System.out.println("Pilih bangun ruang yang ingin diinputkan:");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Kerucut");
            System.out.print("Pilihan (1-4): ");
            int pilihan = scanner.nextInt();

            BangunRuang bangunRuang = null;

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunRuang = new Kubus(sisiKubus);
                    break;
                case 2:
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuang = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuang = new Tabung(jariJariTabung, tinggiTabung);
                    break;
                case 4:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    bangunRuang = new Kerucut(jariJariKerucut, tinggiKerucut);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue; 
            }

            bangunRuang.info();
            System.out.println();

            System.out.print("Apakah Anda ingin menghitung lagi? (ya/tidak): ");
            String lagi = scanner.next();
            if (!lagi.equalsIgnoreCase("ya")) {
                break;
            }
        }

        scanner.close();
    }
}
