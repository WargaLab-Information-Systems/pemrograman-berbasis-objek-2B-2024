package modul5bangundatar;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungLuas() {
        return sisi * sisi;
    }

    // Overloading hitungLuas() dengan satu parameter tambahan
    protected double hitungLuas(double sisiBaru) {
        this.sisi = sisiBaru;
        return sisi * sisi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi dengan sisi = " + sisi);
        System.out.println("Luas persegi: " + hitungLuas());
    }
}
