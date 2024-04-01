package Modul22;
import java.util.Scanner;

public class Data2 {
   public static void main(String[] args) {
      Scanner input;
      for(String Mengulang = "y"; Mengulang.equals("y"); Mengulang = input.nextLine()) {
         input = new Scanner(System.in);
         System.out.println("=============================");
         System.out.println("= Masukkan Data Mahasiswa =");
         System.out.println("=============================");
         System.out.print("Universitas : ");
         Data1.universitas = input.nextLine();
         System.out.print("NIM : ");
         Data1.nim = input.nextLine();
         System.out.print("Nama : ");
         Data1.nama = input.nextLine();
         System.out.print("Alamat : ");
         Data1.alamat = input.nextLine();
        System.out.print("| =====DAFTAR KODE JURUSAN===== | "
                + "\n Teknik Informatika  [41]"
                + "\n Teknik Industri     [42]"
                + "\n Teknik Elektro      [43]"
                + "\n Sistem Informasi    [44]"
                + "\n Teknik Mesin        [45]"
                + "\n Teknik Mekatronika  [46]"
                + "\n Masukkan Kode Jurusan : " );
         Data1.jurusan = input.nextLine();
         System.out.println(" ");
         System.out.println("==========Data Mahasiswa==========");
         System.out.println("Universitas : " + Data1.getuniversitas());
         System.out.println("NIM : " + Data1.getnim());
         System.out.println("Nama : " + Data1.getnama());
         System.out.println("Alamat : " + Data1.getalamat());
         switch (Data1.getjurusan()) {
            case "41":
               System.out.println("Jurusan :TEKNIK INFORMATIKA");
               break;
            case "42":
               System.out.println("Jurusan :TEKNIK INDUSTRI");
               break;
            case "43":
               System.out.println("Jurusan :TEKNIK ELEKTRO");
               break;
            case "44":
               System.out.println("Jurusan :SISTEM INFORMASI");
               break;
            case "48":
               System.out.println("Jurusan :TEKNIK MESIN");
               break;
            case "49":
               System.out.println("Jurusan :TEKNIK MEKATRONIKA");
               break;
            default:
               System.out.println("Jurusan : Tidak ada");
               System.out.println(" ");
               System.out.println("======================================");
         }

         System.out.println("Mengulang lagi? (y untuk Ya dan T untuk Tidak)");
         System.out.print("Masukkan pilihan : ");
      }

      System.out.println("===========================");
      System.out.println(" Goodbye! ");
      System.out.println("===========================");
   }
}