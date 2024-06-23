package modul5bangundatar;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    protected double hitungLuas(double parameterTambahan) {
        // Implementasi hitung luas dengan parameter tambahan
        // Misalnya, Anda bisa mengabaikan parameter tambahan
        return hitungLuas();
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah segitiga dengan alas = " + alas + " dan tinggi = " + tinggi);
        System.out.println("Luas segitiga: " + hitungLuas());
    }
}
