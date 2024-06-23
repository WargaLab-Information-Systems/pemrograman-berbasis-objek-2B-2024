public class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungLuas() { //dideklarasikan dalam kelas induk BangunDatar
        return Math.PI * jariJari * jariJari;
    }
     public void info() {
        System.out.println("Lingkaran dengan jari jari" + jariJari);
    }
}
