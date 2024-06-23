abstract class BuahAbstract {
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
        } else if (beratGram < 1000) {
            return "Sedang";
        } else {
            return "Berat";
        }
    }
}