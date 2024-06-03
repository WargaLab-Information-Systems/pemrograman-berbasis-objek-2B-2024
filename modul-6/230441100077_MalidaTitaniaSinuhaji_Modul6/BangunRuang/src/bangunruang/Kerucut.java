
package bangunruang;

class Kerucut extends BangunRuang implements Dimensi {
    private double jariJari;
    private double tinggi;

    public Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return (1.0 / 3) * Math.PI * Math.pow(jariJari, 2) * tinggi;
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
        System.out.println("Informasi Kerucut:");
        System.out.println("Jari-Jari: " + jariJari);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}


