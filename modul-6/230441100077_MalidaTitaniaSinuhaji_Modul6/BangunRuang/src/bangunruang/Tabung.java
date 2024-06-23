
package bangunruang;


class Tabung extends BangunRuang implements Dimensi {
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return Math.PI * Math.pow(jariJari, 2) * tinggi;
    }

    @Override
    public double hitungJariJari() {
        return jariJari;
    }

    @Override
    public double hitungLebar() {
        return 0;
    }

    @Override
    public double hitungTinggi() {
        return tinggi;
    }

    public void info() {
        System.out.println("Informasi Tabung:");
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}
