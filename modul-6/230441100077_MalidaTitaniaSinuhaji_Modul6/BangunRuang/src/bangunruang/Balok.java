
package bangunruang;

class Balok extends BangunRuang implements Dimensi {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double hitungJariJari() {
        return Math.sqrt((lebar * lebar) + (tinggi * tinggi)) / 2;
    }

    @Override
    public double hitungLebar() {
        return lebar;
    }

    @Override
    public double hitungTinggi() {
        return tinggi;
    }

    public void info() {
        System.out.println("Informasi Balok:");
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
    }
}