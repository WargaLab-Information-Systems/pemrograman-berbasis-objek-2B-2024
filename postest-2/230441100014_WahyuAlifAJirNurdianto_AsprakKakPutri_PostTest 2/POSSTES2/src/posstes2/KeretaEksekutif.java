package POSSTES2;

public class KeretaEksekutif extends KeretaApi {

    public KeretaEksekutif(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang) {
        super(namaKereta, jarak, tujuan, kapasitasPenumpang);
    }

    @Override
    public double hitungBiaya(double hargaPerKm) {
        double biayaLayanan = 50.0; 
        return (hargaPerKm * jarak) + biayaLayanan;
    }
}
