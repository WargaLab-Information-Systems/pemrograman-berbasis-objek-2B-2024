package posttes1;

class Ekonomi extends KeretaApi {
    private final double hargaPerKm;

    // Constructor
    public Ekonomi(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang, double hargaPerKm) {
        super(namaKereta, jarak, tujuan, kapasitasPenumpang);
        this.hargaPerKm = hargaPerKm;
    }

    @Override
    public double hitungBiaya(double hargaPerKm) {
        return jarak * this.hargaPerKm;
    }
}
