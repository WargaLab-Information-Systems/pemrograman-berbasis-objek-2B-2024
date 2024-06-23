
package postest2;

import java.util.Scanner;

final class cetakbilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        String lanjutkan; 

        do {
            Postest2[] OBA = new Postest2[4]; 
            System.out.println("Masukkan bilangan pertama:");
            a = scanner.nextDouble();
            System.out.println("Masukkan bilangan kedua:");
            b = scanner.nextDouble();

            System.out.println("Operasi yang tersedia:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian"); 
            System.out.println("4. Pembagian"); 

            System.out.println("Pilih operasi (1/2/3/4):");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    OBA[0] = new OperasiPenjumlahan();
                    OBA[0].set_A(a);
                    OBA[0].set_B(b);
                    OBA[0].set_C();
                    OBA[0].tampil();
                    break;
                case 2:
                    OBA[1] = new OperasiPengurangan();
                    OBA[1].set_A(a);
                    OBA[1].set_B(b);
                    OBA[1].set_C();
                    OBA[1].tampil();
                    break;
                case 3: 
                    OBA[2] = new OperasiPerkalian();
                    OBA[2].set_A(a);
                    OBA[2].set_B(b);
                    OBA[2].set_C();
                    OBA[2].tampil();
                    break;
                case 4: 
                    OBA[3] = new OperasiPembagian();
                    OBA[3].set_A(a);
                    OBA[3].set_B(b);
                    OBA[3].set_C();
                    OBA[3].tampil();
                    break;
                default:
                    System.out.println("Pilihan operasi tidak valid.");
            }

            System.out.println("Apakah Anda ingin melanjutkan? (y/n)");
            lanjutkan = scanner.next();
        } while (lanjutkan.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}

