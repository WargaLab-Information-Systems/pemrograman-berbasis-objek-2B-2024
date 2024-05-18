package modull6;

public class Tabung extends BangunRuang implements Dimensi {
    private double jariJari;
    private double tinggi;
    Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
 }
 
    @Override
    public double hitungVolume() {
    return Math.PI * Math.pow(jariJari, 2) * tinggi;
 }
 
public void info() {
    System.out.println("Tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
 }
 
public double getJariJari() {
    return jariJari;
 }

public double getLebar() {
    return 0; // Tidak diperlukan untuk tabung
 }

public double getTinggi() {
    return tinggi;
 }

    @Override
    public double JariJari() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double Lebar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double Tinggi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

