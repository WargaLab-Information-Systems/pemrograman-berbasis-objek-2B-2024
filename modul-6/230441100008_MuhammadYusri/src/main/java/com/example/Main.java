package com.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        
        // inputan Kubus
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = scanner.nextDouble();
        Kubus kubusMasuk = new Kubus(sisiKubus); // hasil inputan dimasukkan kedalam class kubus dan diproses disana
        
        // inputan Balok
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        Balok balokMasuk = new Balok(panjangBalok, lebarBalok, tinggiBalok);
        
        // inputan Tabung
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJariTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = scanner.nextDouble();
        Tabung tabungMasuk = new Tabung(jariJariTabung, tinggiTabung);
        
        // inputan Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggiKerucut = scanner.nextDouble();
        Kerucut kerucutMasuk = new Kerucut(jariJariKerucut, tinggiKerucut);
        System.out.println();
 
        // Array 
        BangunRuang[] bangunRuang1 = {kubusMasuk,balokMasuk,tabungMasuk,kerucutMasuk,};
        
        

 
        for (BangunRuang bangunRuang : bangunRuang1) {
            System.out.println("Volume: " + bangunRuang.hitungVolume());
            
        }
        //Panggil method info() untuk setiap objek dalam array
        for (BangunRuang bangunRuang : bangunRuang1) {
            if (bangunRuang instanceof Kubus) { // instanceof adalah operator untuk mengecek apakah objek merupakan instance dari suatu class
                ((Kubus) bangunRuang).info(); //info adalah method yang ada di kelas Kubus
            } else if (bangunRuang instanceof Balok) {
                ((Balok) bangunRuang).info();
            } else if (bangunRuang instanceof Tabung) {
                ((Tabung) bangunRuang).info();
            } else if (bangunRuang instanceof Kerucut) {
                ((Kerucut) bangunRuang).info();
            }
            
        }
        scanner.close();
    }
 }