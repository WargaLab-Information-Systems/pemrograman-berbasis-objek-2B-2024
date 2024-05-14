package modul6;

class Kubus extends BangunRuang implements ukuran {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }

    @Override
    void info() {
        System.out.println("Kubus:");
        System.out.println("Sisi: " + sisi);
    }

    @Override
    public double getJariJari() {
        return sisi / 2;
    }

    @Override
    public double getLebar() {
        return sisi;
    }

    @Override
    public double getTinggi() {
        return sisi;
    }
}