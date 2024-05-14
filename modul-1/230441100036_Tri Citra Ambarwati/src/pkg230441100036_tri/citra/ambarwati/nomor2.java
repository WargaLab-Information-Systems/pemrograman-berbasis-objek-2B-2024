package pkg230441100036_tri.citra.ambarwati;
//bawaan dari java
import java.util.Scanner;
import java.math.BigInteger;

/**
 *
 * @author ACER
 */

//membuat class berisi beberapa atribut
class Mahasiswa{
    String Nama;
    BigInteger NIM;
    String Prodi;
    String Alamat;
    double ipk;
}
public class nomor2{
    public static void main(String[] args) {
        //untuk inputan
        Scanner scanner = new Scanner(System.in);
        //membuat objek
        Mahasiswa orang1 = new Mahasiswa();
        
        //meminta pengguna memasukkan data
        System.out.print("Masukkan Nama : ");
        orang1.Nama=scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        orang1.NIM=new BigInteger(scanner.nextLine());
        System.out.print("Masukkan Prodi : ");
        orang1.Prodi=scanner.nextLine();
        System.out.print("Masukkan Alamat : ");
        orang1.Alamat=scanner.nextLine();
        System.out.print("Masukkan ipk : ");
        orang1.ipk=scanner.nextDouble();
        
        //menampilkan data mahasiswa yang sudah diinput
        System.out.println("\n-----Data Mahasiswa-----");
        System.out.println("Nama      : "+orang1.Nama);
        System.out.println("NIM       : "+orang1.NIM);
        System.out.println("Prodi     : "+orang1.Prodi);
        System.out.println("Alamat    : "+orang1.Alamat);
        System.out.println("ipk    : "+orang1.ipk);
        
    }

}