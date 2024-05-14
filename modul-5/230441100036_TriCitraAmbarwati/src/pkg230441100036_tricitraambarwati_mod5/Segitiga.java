package pkg230441100036_tricitraambarwati_mod5;

class Segitiga extends BangunDatar {
    double alas;
    double tinggi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    void info() {
        System.out.println("\nSegitiga dengan alas = " + alas);
        System.out.println("Segitiga dengan tinggi = " + tinggi);
    }
}
