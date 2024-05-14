import java.util.Scanner;

// Kelas BangunRuang
abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract void info();
}

// Kelas Kubus
class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public void info() {
        System.out.println("Kubus dengan sisi = " + sisi + " memiliki volume = " + hitungVolume());
    }
}

// Kelas Balok
class Balok extends BangunRuang implements JarijariLebar, Tinggi {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void info() {
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}

// Kelas Tabung
class Tabung extends BangunRuang implements JarijariLebar, Tinggi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Tabung dengan jari-jari = " + jariJari + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}

// Kelas Kerucut
class Kerucut extends BangunRuang implements JarijariLebar, Tinggi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
    }

    public void info() {
        System.out.println("Kerucut dengan jari-jari = " + jariJari + ", tinggi = " + tinggi + " memiliki volume = " + hitungVolume());
    }
}

// Interface JarijariLebar dan Tinggi
interface JarijariLebar {
    double jariJari = 0;
    double lebar = 0;
}

interface Tinggi {
    double tinggi = 0;
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] bangunRuangArray = new BangunRuang[4];

        // Input data untuk Kubus
        System.out.print("Masukkan sisi kubus: ");
        double sisiKubus = scanner.nextDouble();
        bangunRuangArray[0] = new Kubus(sisiKubus);

        // Input data untuk Balok
        System.out.print("Masukkan panjang balok: ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggiBalok = scanner.nextDouble();
        bangunRuangArray[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);

        // Input data untuk Tabung
        System.out.print("Masukkan jari-jari tabung: ");
        double jariJariTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggiTabung = scanner.nextDouble();
        bangunRuangArray[2] = new Tabung(jariJariTabung, tinggiTabung);

        // Input data untuk Kerucut
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJariKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggiKerucut = scanner.nextDouble();
        bangunRuangArray[3] = new Kerucut(jariJariKerucut, tinggiKerucut);

        // Menghitung volume dan memanggil method info()
        for (BangunRuang bangunRuang : bangunRuangArray) {
            System.out.println("Volume = " + bangunRuang.hitungVolume());
            bangunRuang.info();
        }
    }
}