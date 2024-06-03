package datamhs;

import java.util.ArrayList;//mengimpor kelas arraylist
import java.util.Scanner; 

//parentclass
class Universitas {
    private static String namaUniversitas;  //static variabel

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

//childclass    
class Mahasiswa extends Universitas {
    private final String nim; //atribut
    private final String nama;
    private final String alamat;
    private final int jurusan;

    public Mahasiswa(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public void displayData() { //menampilkan data mahasiswa
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getJurusanName(jurusan));
        System.out.println("Universitas: " + getNamaUniversitas());
        System.out.println("----------------------");
    }

    private String getJurusanName(int code) {
        switch (code) {
            case 41:
                return "Teknik Informatika";
            case 42:
                return "Teknik Industri";
            case 43:
                return "Teknik Elektro";
            case 44:
                return "Sistem Informasi";
            case 48:
                return "Teknik Mesin";
            case 49:
                return "Teknik Mekatronika";
            default:
                return "Jurusan tidak valid";
        }
    }
}

public class Main {    //kelas utama yang memiliki metode main sebagai entry point program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        Universitas.setNamaUniversitas(namaUniversitas);

        char input;  //tipe data yang digunakan untuk menyimpan satu karakter
        do {//untuk mengulangi proses memasukkan data mahasiswa 
            System.out.println("Masukkan data mahasiswa");
            System.out.print("NIM: ");
            String nim = scanner.next();
            scanner.nextLine(); // Clear the buffer
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.println("Jurusan:");
            System.out.println(" Teknik Informatika (41)");
            System.out.println(" Teknik Industri (42)");
            System.out.println(" Teknik Elektro (43)");
            System.out.println(" Sistem Informasi (44)");
            System.out.println(" Teknik Mesin (48)");
            System.out.println(" Teknik Mekatronika (49)");
            System.out.print("Pilihan Jurusan (1-6): ");
            int jurusan = scanner.nextInt();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.print("Apakah Anda ingin memasukkan data lagi? (Y/T): ");
            input = scanner.next().charAt(0);
        } while (input == 'Y' || input == 'y');//melakukan looping ketika pengguna memilih y

        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            mahasiswa.displayData();
        }

        scanner.close();
    }
}
