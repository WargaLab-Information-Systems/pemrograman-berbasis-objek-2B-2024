
package postest2;


import java.util.Scanner;

final class cetakbilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        String lanjutkan; 

        do {
            Postest2 operasi = null; // Polimorfisme
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
                    System.out.println("Pilihan operasi tidak valid.");
            }

            if (operasi != null) {
                operasi.set_A(a);
                operasi.set_B(b);
                operasi.set_C();
                operasi.tampil();
            }

            System.out.println("Apakah Anda ingin melanjutkan? (y/n)");
            lanjutkan = scanner.next();
        } while (lanjutkan.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}
