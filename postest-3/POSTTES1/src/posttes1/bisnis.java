package posttes1;

// Class Bisnis yang merupakan turunan dari KeretaApi
class Bisnis extends KeretaApi {
    private final double hargaPerKm;

    // Constructor
    public Bisnis(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang, double hargaPerKm) {
        super(namaKereta, jarak, tujuan, kapasitasPenumpang);
        this.hargaPerKm = hargaPerKm;
    }

    // Method override untuk menghitung biaya perjalanan
    @Override
    public double hitungBiaya(double hargaPerKm) {
        return jarak * this.hargaPerKm;
    }
}
