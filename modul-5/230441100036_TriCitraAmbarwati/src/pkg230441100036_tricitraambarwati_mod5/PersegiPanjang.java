package pkg230441100036_tricitraambarwati_mod5;

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    void info() {
        System.out.println("\nPersegi Panjang dengan panjang = " + panjang);
        System.out.println("Persegi Panjang dengan lebar = " + lebar);
    }
}