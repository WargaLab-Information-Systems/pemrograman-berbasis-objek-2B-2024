import java.util.Random;

// Abstract class sebagai superclass
abstract class BuahAbstract {
    // Atribut-atribut
    protected String nama;
    protected int beratGram;
    protected static int jumlahBuah;

    // Constructor
    public BuahAbstract(String nama, int beratGram) {
        this.nama = nama;
        this.beratGram = beratGram;
        jumlahBuah++;
    }

    // Abstract method untuk informasi tambahan buah
    public abstract void infoTambahan();

    // Method untuk mendapatkan nama buah
    public String getNama() {
        return nama;
    }

    // Method untuk mendapatkan berat buah dalam kilogram
    public double getBeratKg() {
        return beratGram / 1000.0;
    }

    // Method static untuk mendapatkan jumlah buah yang telah dibuat
    public static int getJumlahBuah() {
        return jumlahBuah;
    }

    // Method untuk menampilkan informasi buah
    public void infoBuah() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat Buah: " + getBeratKg() + " kg");
        infoTambahan(); // Memanggil method infoTambahan dari subclass
    }

    // Method untuk menghasilkan teks berdasarkan berat buah
    public String teksBerat() {
        if (beratGram < 500) {
            return "Ringan";
        } else if (beratGram >= 500 && beratGram < 1000) {
            return "Sedang";
        } else {
            return "Berat";
        }
    }
}

// Kelas Buah menjadi subclass dari BuahAbstract
class Buah extends BuahAbstract {

    // Constructor
    public Buah(String nama, int beratGram) {
        super(nama, beratGram);
    }

    // Implementasi abstract method infoTambahan()
    @Override
    public void infoTambahan() {
        System.out.println("Tambahan Informasi: Ini adalah buah " + nama);
    }

    // Method main untuk menguji kelas Buah
    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 250);
        Buah pisang = new Buah("Pisang", 750);
        Buah jeruk = new Buah("Jeruk", 1200);

        apel.infoBuah();
        System.out.println("Teks Berat Apel: " + apel.teksBerat());
        System.out.println();

        pisang.infoBuah();
        System.out.println("Teks Berat Pisang: " + pisang.teksBerat());
        System.out.println();

        jeruk.infoBuah();
        System.out.println("Teks Berat Jeruk: " + jeruk.teksBerat());
        System.out.println();

        System.out.println("Jumlah Buah: " + Buah.getJumlahBuah());
    }
}
