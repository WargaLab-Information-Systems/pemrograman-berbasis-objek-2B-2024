package Modul5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inputan = new Scanner(System.in);
        BangunDatar[] bangunArray = new BangunDatar[4]; // Array untuk menyimpan objek-objek bangun datar
        double Nilai1, Nilai2;
        int pilihan;
        String ulang;
        
        do {
            System.out.print("""
                | =====Pilih jenis bangun datar yang ingin dihitung===== | 
                1. Menghitung Persegi Panjang  [01]
                2. Menghitung Segitiga         [02]
                3. Menghitung Persegi          [03]
                4. Menghitung Lingkaran        [04]
                5. Keluar Dari Program         [05]
                ==> Masukkan pilihan (1/2/3/4/5): """);
            pilihan = inputan.nextInt();
        
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang dari persegi panjang: ");
                    Nilai1 = inputan.nextDouble();
                    System.out.print("Masukkan lebar dari persegi panjang: ");
                    Nilai2 = inputan.nextDouble();
                    bangunArray[0] = new PersegiPanjang(Nilai1, Nilai2);
                    bangunArray[0].info();
                    System.out.println("Luas dari bangun datar tersebut adalah: " + bangunArray[0].hitungLuas());
                    break;
                case 2:
                    System.out.print("Masukkan alas dari segitiga: ");
                    Nilai1 = inputan.nextDouble();
                    System.out.print("Masukkan tinggi dari segitiga: ");
                    Nilai2 = inputan.nextDouble();
                    bangunArray[1] = new Segitiga(Nilai1, Nilai2);
                    bangunArray[1].info();
                    System.out.println("Luas dari bangun datar tersebut adalah: " + bangunArray[1].hitungLuas());
                    break;
                case 3:
                    System.out.print("Masukkan sisi dari persegi: ");
                    Nilai1 = inputan.nextDouble();
                    bangunArray[2] = new Persegi(Nilai1);
                    bangunArray[2].info();
                    System.out.println("Luas dari bangun datar tersebut adalah: " + bangunArray[2].hitungLuas());
                    break;
                case 4:
                    double keliling;
                    System.out.print("Masukkan jari-jari dari lingkaran: ");
                    Nilai1 = inputan.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(Nilai1);
                    System.out.println("Apakah Anda ingin menghitung keliling lingkaran? (iya/tidak): ");
                    String Keliling = inputan.next();

                    if (Keliling.equalsIgnoreCase("iya")) {
                        keliling = 2 * Math.PI * Nilai1;
                        lingkaran.info(keliling);
                    } else if (Keliling.equalsIgnoreCase("tidak")) {
                        lingkaran.info();
                    } else {
                        System.out.println("Masukan tidak valid. Program akan keluar.");
                        System.exit(0);
                    }
                    System.out.println("Luas dari bangun datar tersebut adalah: " + lingkaran.hitungLuas());
                    bangunArray[3] = lingkaran;
                    break;
                case 5:
                    System.out.println("Anda Keluar dari program.");
                    System.exit(0); // Keluar dari program
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            do{
                System.out.print("Apakah Anda ingin mengulangi ?(iya/tidak) : ");
                ulang = inputan.next();
                if (!ulang.equalsIgnoreCase("iya") && !ulang.equalsIgnoreCase("tidak")){
                    System.out.println("input tidak valid. Mohon ketikkan 'iya' atau 'tidak'.");
                }
            }while (!ulang.equalsIgnoreCase("iya") && !ulang.equalsIgnoreCase("tidak"));   
            
        } while (ulang.equalsIgnoreCase("iya"));
        
        System.out.println("Program telah selesai.");
        inputan.close();
    }
}
