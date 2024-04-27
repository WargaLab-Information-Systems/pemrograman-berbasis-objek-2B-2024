
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
                Boolean lanjutkan = true;
    // Membuat instance Scanner
         while (lanjutkan){
        System.out.print("Pilih operasi (1. Penjumlahan, 2. Pengurangan, 3.Perkalian, 4. pembagian ): ");
        int pilihan = scanner.nextInt(); // Menggunakan instance Scanner
        
                     if (pilihan == 5) {
                     System.out.println("Terima kasih, program akan berhenti.");
                     break;
                     }
                         // Jika pilihan                break; adalah 5, keluar dari program
        System.out.print("Masukkan nilai b: ");
        double a = scanner.nextDouble(); // Menggunakan instance Scanner

        System.out.print("Masukkan nilai c: ");
        double b = scanner.nextDouble(); // Menggunakan instance Scanner

        OperasiBilangan operasi;

        switch (pilihan) {
            case 1:
                operasi = new OperasiPenjumlahan();
                break;
            case 2:
                operasi = new OperasiPengurangan();
                break;
            case 3:
                operasi = new OperasiPerkalian();
                break;
            case 4:
                operasi = new OperasiPembagian();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        operasi.set_A(a);
        operasi.set_B(b);
        operasi.set_C();
        operasi.tampil();
        System.out.print("Ingin menginput selesai? (y): ");
            String inputLagi = scanner.next();

            if (inputLagi.equalsIgnoreCase("y")) {
                lanjutkan = false;
        
}            

 }                    
 }                    
}
