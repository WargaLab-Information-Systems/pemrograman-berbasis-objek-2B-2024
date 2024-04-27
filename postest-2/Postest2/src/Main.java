
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
       System.out.print("Pilih operasi (1. Penjumlahan, 2. Pengurangan, 3.Perkalian, 4. pembagian 5. log out): ");
       int pilihan = scanner.nextInt(); // Menggunakan instance Scanner
       
                    if (pilihan == 5) {
                    System.out.println("Terima kasih, program akan berhenti.");
                    break;
                    }
                        // Jika pilihan                break; adalah 5, keluar dari program
       System.out.print("Masukkan nilai b: ");
       double b = scanner.nextDouble(); // Menggunakan instance Scanner

       System.out.print("Masukkan nilai c: ");
       double c = scanner.nextDouble(); // Menggunakan instance Scanner

       ClassBilangan operasi;

       switch (pilihan) {
           case 1:
               operasi = new ClassPenjumlahan();
               break;
           case 2:
               operasi = new ClassPengurangan();
               break;
           case 3:
               operasi = new ClassPerkalian();
               break;
           case 4:
               operasi = new ClassPerkalian();
               break;
           default:
               System.out.println("Pilihan tidak valid.");
               return;
       }

       operasi.set_B(b);
       operasi.set_C(c);
       operasi.set_D();
       operasi.tampil();
       System.out.print("Ingin menginput lagi? (y/n): ");
           String inputLagi = scanner.next();

           if (inputLagi.equalsIgnoreCase("y")) {
               lanjutkan = true;
       
            

}                    
}       
   }
}
