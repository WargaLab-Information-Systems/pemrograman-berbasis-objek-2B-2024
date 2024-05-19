//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama = ");
        String nama = input.nextLine();
        System.out.print("Masukkan nim = ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nilai Tugas = ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS = ");
        double nilaiUts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS = ");
        Double nilaiUas = input.nextDouble();

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setDataMahasiswa(nama,nim,nilaiTugas,nilaiUts,nilaiUas);
        mahasiswa1.tampil();

    }
}