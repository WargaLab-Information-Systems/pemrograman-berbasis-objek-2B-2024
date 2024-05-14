package pkg230441100036_tricitraambarwati_mod5;

class Lingkaran extends BangunDatar {
    double jari;

    Lingkaran(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return Math.PI * jari * jari;
    }

    @Override
    void info() {
        System.out.println("\nLingkaran dengan jari-jari = " + jari);
    }

}