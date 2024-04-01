/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
/**
 *
 * @author sonia
 */
public class UniversitasTrunojoyoMadura {

    private String Nama;
    private String Nim;
    private String Alamat;
    private String Jurusan;
//constuktor
public UniversitasTrunojoyoMadura(String Nama, String Nim, String Alamat, String Jurusan){
    this.Nama = Nama;
    this.Nim = Nim;
    this.Alamat = Alamat;
    this.Jurusan = Jurusan;
}   
    
public void setNama(String Nama){
    this.Nama=Nama;
}
public String getNama(){
    return Nama;
}
public void setNim(String Nim){
    this.Nim=Nim;
}
public String getNim(){
    return Nim;
}
public void setAlamat(String Alamat){
    this.Alamat=Alamat;
}
public String getAlamat(){
    return Alamat;
}
public void setJurusan(String Jurusan){
    this.Jurusan=Jurusan;
}
public String getJurusan(){
    return Jurusan;
}
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Membuat objek mahasiswa dengan jurusan Teknik Informatika
       Scanner scanner=new Scanner(System.in);
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura1 = new UniversitasTrunojoyoMadura("fahrizalumam", "230076", "Teknik Informatika","41");
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura2 = new UniversitasTrunojoyoMadura("ach.fauzi", "22004", "Teknik industri", "42");
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura3 = new UniversitasTrunojoyoMadura("moh.badrut tamam", "23085", "Teknik elektro", "43");
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura4 = new UniversitasTrunojoyoMadura("sonia fitriani", "23061", "Sistem Informasi", "44");
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura5 = new UniversitasTrunojoyoMadura("indra wahyuhidayat", "23069", "Teknik mesin", "45");
       UniversitasTrunojoyoMadura UniversitasTrunojoyoMadura6 = new UniversitasTrunojoyoMadura("imelia sartikaputri", "22004", "Teknik mekatronik", "46");

        String lanjut;
        do{
            
        System.out.println("\nUniversitasTrunojoyoMadura 1:");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura1.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura1.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura1.getJurusan());


        System.out.println("\nUniversitasTrunojoyoMadura2:");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura2.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura2.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura2.getJurusan());
        
        
        System.out.println("\nUniversitasTrunojoyoMadura3:");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura3.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura3.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura3.getJurusan());

        
        System.out.println("\nUniversitasTrunojoyoMadura4 :");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura4.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura4.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura4.getJurusan());
        
        
        System.out.println("\nUniversitasTrunojoyoMadura5:");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura5.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura5.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura5.getJurusan());
        
        System.out.println("\nUniversitasTrunojoyoMadura6:");
        System.out.println("Nama: " + UniversitasTrunojoyoMadura6.getNama());
        System.out.println("NIM: " + UniversitasTrunojoyoMadura6.getNim());
        System.out.println("Jurusan: " + UniversitasTrunojoyoMadura6.getJurusan());
        System.out.println("Apakah Anda ingin memasukkan data lagi? (Y) Ya; (T)Tidak");
            lanjut= scanner.nextLine();      
        }while (lanjut.equalsIgnoreCase("Y"));
               
        scanner.close();
    }
 }
