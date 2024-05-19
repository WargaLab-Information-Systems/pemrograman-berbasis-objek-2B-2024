import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("Masukkan nama = ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM = ");
            String nim = input.nextLine();
            System.out.print("Masukkan Nilai Tugas = ");
            double nilaiTugas = input.nextDouble();
            System.out.print("Masukkan Nilai UTS = ");
            double nilaiUts = input.nextDouble();
            System.out.print("Masukkan Nilai UAS = ");
            double nilaiUas = input.nextDouble();
            input.nextLine();

            AbsDataNilaiMahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setAbsDataNilaiMahasiswa(nama, nim, nilaiTugas, nilaiUts, nilaiUas);
            mahasiswa.info();

            System.out.print("Apakah Anda ingin memasukkan data lagi? (ya/tidak): ");
            String response = input.nextLine();
            if (response.equalsIgnoreCase("tidak")) {
                running = false;
            }
        }
    }
}