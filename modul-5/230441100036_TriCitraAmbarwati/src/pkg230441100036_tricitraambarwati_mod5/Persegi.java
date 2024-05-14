package pkg230441100036_tricitraambarwati_mod5;

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    void info() {
        System.out.println("\nPersegi dengan sisi = " + sisi);
    }
}