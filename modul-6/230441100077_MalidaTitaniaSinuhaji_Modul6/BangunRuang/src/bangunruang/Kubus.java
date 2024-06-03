package bangunruang;

class Kubus extends BangunRuang implements Dimensi {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
 @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    @Override
    public double hitungJariJari() {
        return sisi / 2;
    }
    
@Override
    public double hitungLebar() {
        return sisi;
    }

    @Override
    public double hitungTinggi() {
        return sisi;
    }

public void info() {
        System.out.println("Informasi Kubus:");
        System.out.println("Sisi: " + sisi);
        System.out.println("Volume: " + hitungVolume());
    }
}

    