package modul6;

class Balok extends BangunRuang implements ukuran {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    void info() {
        System.out.println("Balok:");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
    }

    @Override
    // karena Balok tidak memiliki Jari-jari
    public double getJariJari() {
        return 0;
    }

    @Override
    public double getLebar() {
        return lebar;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}