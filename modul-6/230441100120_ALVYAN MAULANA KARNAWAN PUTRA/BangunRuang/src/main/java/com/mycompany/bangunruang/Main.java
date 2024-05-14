/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bangunruang;

/**
 *
 * @author TOSHIBA
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah bangun ruang yang ingin anda gunakan : ");
        int jumlahBangunRuang = scanner.nextInt();

        
        List<BangunRuang> bangunRuangList = new ArrayList<>();

        
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Pilih jenis bangun ruang:");
            System.out.println("1. Kubus");
            System.out.println("2. Tabung");
            System.out.println("3. Kerucut");
            System.out.println("4. Balok");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = scanner.nextDouble();
                    bangunRuangList.add(new Kubus(sisiKubus));
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = scanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = scanner.nextDouble();
                    bangunRuangList.add(new Tabung(jariJariTabung, tinggiTabung));
                    break;
                case 3:
                    System.out.print("Masukkan jari-jari kerucut: ");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    double tinggiKerucut = scanner.nextDouble();
                    bangunRuangList.add(new Kerucut(jariJariKerucut, tinggiKerucut));
                    break;
                case 4:
                    System.out.print("Masukkan Panjang Balok: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan Lebar Balok: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi Balok: ");
                    double tinggiBalok = scanner.nextDouble();
                    bangunRuangList.add(new Balok(panjangBalok, lebarBalok, tinggiBalok));
                    break;
                default:
                    System.out.println("Pilihan tidak valid."); 
                    break;
            }
        }

        
        for (BangunRuang bangunRuang : bangunRuangList) {
            System.out.println("Volume: " + bangunRuang.hitungVolume());
            bangunRuang.info(); 
        }

        scanner.close();
    }
}
