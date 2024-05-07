package modul5bangundatar;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    protected double hitungLuas() {
        return panjang * lebar;
    }

    // Overloading hitungLuas() dengan satu parameter tambahan
    protected double hitungLuas(double tinggi) {
        return panjang * tinggi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi panjang dengan panjang = " + panjang + " dan lebar = " + lebar);
    }
}
