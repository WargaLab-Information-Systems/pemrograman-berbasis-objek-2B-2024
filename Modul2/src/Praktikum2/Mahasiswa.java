package Praktikum2;
import java.util.Scanner;

// Define the Mahasiswa class that inherits from Universitas
public class Mahasiswa extends Universitas {
        // Declare any additional properties if needed

    // Define the Mahasiswa constructor that calls the Universitas constructor
    public Mahasiswa(String Nim, String Nama, String Alamat, String Prodi, String UNIV) {
        super(Nim, Nama, Alamat, Prodi, UNIV);
    }
}
