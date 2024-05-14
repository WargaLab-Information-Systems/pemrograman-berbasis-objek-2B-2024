package POSSTES2;

public abstract class KeretaApi implements Perjalanan {
    static double KECEPATAN = 60; 
    protected String namaKereta;
    protected double jarak;
    protected String tujuan;
    protected int kapasitasPenumpang;

    // Constructor
    public KeretaApi(String namaKereta, double jarak, String tujuan, int kapasitasPenumpang) {
        this.namaKereta = namaKereta;
        this.jarak = jarak;
        this.tujuan = tujuan;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungWaktuTempuh() {
        return jarak / KECEPATAN;
    }

    @Override
    public void tampilkanInformasiPerjalanan() {
        System.out.println("Nama Kereta: " + namaKereta);
        System.out.println("Jarak Tempuh: " + jarak + " km");
        System.out.println("Waktu Tempuh: " + hitungWaktuTempuh() + " jam");
        System.out.println("Tujuan: " + tujuan);
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}
