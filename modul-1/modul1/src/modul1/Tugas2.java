package modul1;

import java.util.Scanner;

public class Tugas2 { 
    String nim;
    String nama,prodi,alamat,fakultas;
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    
    void biodata(){
        System.out.print("Nama mahasiswa:");
        nama = input.nextLine();
        System.out.print("Nim mahasiswa:");
        nim = input.nextLine();
        System.out.print("Fakultas mahasiswa:");
        fakultas = input.nextLine();
        System.out.print("Prodi mahasiswa:");
        prodi = input.nextLine();
        System.out.print("Alamat mahasiswa:");
        alamat = input.nextLine();
    }
    void hasil(){
        System.out.println("---------------------");
        System.out.println("Nama mahasiswa: " + nama);
        System.out.println("Nim mahasiswa: " + nim);
        System.out.println("Fakultas mahasiswa: " + fakultas);
        System.out.println("Prodi mahasiswa: " + prodi);
        System.out.println("Alamat mahasiswa: " + alamat);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tugas2 mahasiswa = new Tugas2();
        
        mahasiswa.biodata();
        mahasiswa.hasil();
    }
    
}
