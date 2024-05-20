package modul5bangundatar;

public class Lingkaran extends BangunDatar {
    private double radius;
    private final double PI = 3.14;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    protected double hitungLuas() {
        return PI * radius * radius;
    }

    // Overloading hitungLuas() dengan satu parameter tambahan
    protected double hitungLuas(double radiusBaru) {
        this.radius = radiusBaru;
        return PI * radius * radius;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari = " + radius);
        System.out.println("Luas lingkaran: " + hitungLuas());
    }
}
