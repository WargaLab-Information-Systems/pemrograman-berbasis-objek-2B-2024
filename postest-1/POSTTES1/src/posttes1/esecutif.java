package posttes1;

// Class Eksekutif yang merupakan turunan dari KeretaApi
class Eksekutif extends KeretaApi {
    private final double hargaPerKm;

    // Constructor
    public Eksekutif(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang, double hargaPerKm) {
        super(namaKereta, jarak, tujuan, kapasitasPenumpang);
        this.hargaPerKm = hargaPerKm;
    }

    // Method override untuk menghitung biaya perjalanan
    @Override
    public double hitungBiaya(double hargaPerKm) {
        return jarak * this.hargaPerKm;
    }
}
