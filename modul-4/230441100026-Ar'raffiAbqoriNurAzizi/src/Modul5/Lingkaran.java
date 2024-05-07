package Modul5;

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    protected double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari);
    }
    
    // Overloading method info() dengan parameter tambahan
    protected void info(double keliling) {
        System.out.println("Ini adalah lingkaran dengan jari-jari " + jariJari + " dan keliling " + keliling);
    }
}
