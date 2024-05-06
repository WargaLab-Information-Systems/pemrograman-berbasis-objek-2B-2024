// Kelas Segitiga
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void info() {
        System.out.println("Segitiga dengan alas " + alas + " dan tinggi " + tinggi);
    }
}
