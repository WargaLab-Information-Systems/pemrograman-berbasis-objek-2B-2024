package POSSTES2;

public class KeretaEkonomi extends KeretaApi {

    public KeretaEkonomi(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang) {
        super(namaKereta, jarak, tujuan, kapasitasPenumpang);
    }

    @Override
    public double hitungBiaya(double hargaPerKm) {
        return hargaPerKm * jarak;
    }
}
