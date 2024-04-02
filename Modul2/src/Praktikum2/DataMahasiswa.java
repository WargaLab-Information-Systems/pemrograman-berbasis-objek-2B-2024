package Praktikum2;

// DataMahasiswa.java

// Import necessary packages
import java.util.ArrayList;
import java.util.Scanner;

// Define the DataMahasiswa class
public class DataMahasiswa {
    // Declare an ArrayList to store students
    private ArrayList<Mahasiswa> siswa = new ArrayList<>();

    // Define a static method to create a DataMahasiswa instance
    public static DataMahasiswa createInstance() {
        return new DataMahasiswa();
    }

    // Define the inputStudent method to add a student
    public void inputStudent() {
        // Implement the method using a Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Universitas : ");
        String UNIV = scanner.nextLine();
        
        System.out.print("Masukkan NIM : ");
        String Nim = scanner.nextLine();

        System.out.print("Masukkan Nama Lengkap : ");
        String Nama = scanner.nextLine();

        System.out.print("Masukkan Alamat lengkap : ");
        String Alamat = scanner.nextLine();

        int Prodi;
        String jurusan;
        while (true) {
            System.out.println("""
                             | =====DAFTAR KODE JURUSAN===== | 
                              Teknik Informatika  [41]
                              Teknik Industri     [42]
                              Teknik Elektro      [43]
                              Sistem Informasi    [44]
                              Teknik Mesin        [48]
                              Teknik Mekatronika  [49]""");
            System.out.print("Masukkan Kode Jurusan : ");
            String prodiInput = scanner.nextLine();
            Prodi = Integer.parseInt(prodiInput);

            if (Prodi == 41) {
                jurusan = "Teknik Informatika";
                break;
            } else if (Prodi == 42) {
                jurusan = "Teknik Industri";
                break;
            } else if (Prodi == 43) {
                jurusan = "Teknik Elektro";
                break;
            } else if (Prodi == 44) {
                jurusan = "Sistem Informasi";
                break;
            } else if (Prodi == 48) {
                jurusan = "Teknik Mesin";
                break;
            } else if (Prodi == 49) {
                jurusan = "Teknik Mekatronika";
                break;
            } else {
                System.out.println("Jurusan yang dimasukkan tidak valid. Silakan coba lagi.");
            }
        }

        siswa.add(new Mahasiswa(Nim, Nama, Alamat, jurusan, UNIV));
        System.out.println("Data Mahasiswa Sudah Masuk.");
    }
    

    // Define the displayStudents method to show all students
    public void displayStudents() {
        // Implement the method to loop through the ArrayList and display each student
        for (Mahasiswa student : siswa) {
            student.display();
        }
    }

    // Define the main method to create an instance of DataMahasiswa and handle user input
    public static void main(String[] args) {
        // Implement the main method to manage user input and call the appropriate methods
        DataMahasiswa dataMahasiswa = DataMahasiswa.createInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan(y/T) : ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("Y")) {
                dataMahasiswa.inputStudent();
            } else if (input.equalsIgnoreCase("T")) {
                dataMahasiswa.displayStudents();
                break;
            } else {
                System.out.println("Maaf inputan salah, coba klik (Y/T)");
            }
        }

        System.out.println("ALHAMDULILLAH!");
    }
}