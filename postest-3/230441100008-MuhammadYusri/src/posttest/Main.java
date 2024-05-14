
package posttest;

/**
 *
 * @author Muhammad Yusri
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);


        System.out.println("masukkan pilihan anda: antara 1. menghitung persegi 2. menghitung wat ");
        String pilihan = input.nextLine();
 
        // percabangan switch
        
        switch (pilihan) {
            case "1":
                System.out.print("Tandai nama bentuk sebagai 'persegi' : ");
                String namaPersegi = input.nextLine();

                System.out.print("Masukkan panjang sisi persegi: ");
                double sisiPersegi = input.nextDouble();
            
                System.out.print("\nTandai nama bentuk sebagai 'lingkaran' : ");
                input.nextLine(); 
                String namaLingkaran = input.nextLine();

                System.out.print("Masukkan jari-jari lingkaran : ");
                double jariJariLingkaran = input.nextDouble();

                Persegi persegi = new Persegi(namaPersegi, sisiPersegi);
                Lingkaran lingkaran = new Lingkaran(namaLingkaran, jariJariLingkaran);

                System.out.println("\nNama Bentuk: " + persegi.getNama());
                System.out.println("Luas Persegi: " + persegi.hitungLuas());
                System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

                System.out.println("\nNama Bentuk: " + lingkaran.getNama());
                System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
                System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

                System.out.println("\nJumlah Bentuk: " + Bentuk.getJumlahBentuk());
                input.close();
                break;

            case "2":
            
                System.out.print("Menghitung arus listrik");
                // double KonversiListrik = new KonversiListrik(volt, ampere);
                System.out.print("Masukkan nilai volt: ");
                double volt = input.nextDouble();
        
                System.out.print("Masukkan nilai ampere: ");
                double ampere = input.nextDouble();
        
                KonversiListrik konversiListrik = new KonversiListrik(volt, ampere);
                konversiListrik.inpo();
                break;     

                
    }
}
}

