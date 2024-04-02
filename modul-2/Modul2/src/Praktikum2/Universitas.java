package Praktikum2;

// Universitas.java

// Import necessary packages
import java.util.Scanner;

// Define the Universitas class
public class Universitas {
    // Declare student properties
    private String NIM;
    private String NAMA;
    private String ALAMAT;
    private String PRODI;
    private String UNIVERSITAS;

    // Define the Universitas constructor
    public Universitas(String UNIV, String Nim, String Nama, String Alamat, String Prodi) {
        // Initialize student properties
        this.UNIVERSITAS = UNIV;
        this.NIM = Nim;
        this.NAMA = Nama;
        this.ALAMAT = Alamat;
        this.PRODI = Prodi;
    }

    // mendefinisikan getters and setters dari atribute Universitas
    public void setUniversitas(String UNIV) {
        this.UNIVERSITAS = UNIV;
    }
    
    public String getUNIV() {
        return UNIVERSITAS;
    }
    
    public String getNim() {
        return NIM;
    }

    public void setNim(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return NAMA;
    }

    public void setName(String NAMA) {
        this.NAMA = NAMA;
    }

    public String getAlamat() {
        return ALAMAT;
    }

    public void setAlamat(String Alamat) {
        this.ALAMAT = Alamat;
    }

    public String getMajor() {
        return PRODI;
    }

    public void setMajor(String Prodi) {
        this.PRODI = Prodi;
    }

    // Define the display method to print student information
    public void display() {
        System.out.println("==========Data Mahasiswa==========");
        System.out.println("UNIVERSITAS : " + UNIVERSITAS);
        System.out.println("NIM: " + NIM);
        System.out.println("Name: " + NAMA);
        System.out.println("Address: " + ALAMAT);
        System.out.println("Major: " + PRODI);
        System.out.println("-------------------------");
    }
}
