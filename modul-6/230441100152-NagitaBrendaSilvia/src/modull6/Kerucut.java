package modull6;
    
public class Kerucut extends BangunRuang implements Dimensi {
    private double jariJari;
    private double tinggi;
    Kerucut(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
 }
 
protected double hitungVolume() {
    return (1.0/3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
 }

protected void info() {
    System.out.println("Kerucut dengan jari-jari " + jariJari + " dan tinggi " + tinggi);
 }

public double JariJari() {
    return jariJari;
 }

public double Lebar() {
    return 0; 
 }
 
public double Tinggi() {
    return tinggi;
}
}
    