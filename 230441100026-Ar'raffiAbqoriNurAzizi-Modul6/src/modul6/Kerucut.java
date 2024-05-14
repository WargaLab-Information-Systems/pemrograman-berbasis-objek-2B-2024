package modul6;

class Kerucut extends BangunRuang implements ukuran {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0/3) * Math.PI * (jariJari * jariJari) * tinggi;
    }

    @Override
    void info() {
        System.out.println("Kerucut:");
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
    }

    @Override
    public double getJariJari() {
        return jariJari;
    }

    @Override
    // karena Balok tidak memiliki Lebar
    public double getLebar() {
        return 0;
    }

    @Override
    public double getTinggi() {
        return tinggi;
    }
}