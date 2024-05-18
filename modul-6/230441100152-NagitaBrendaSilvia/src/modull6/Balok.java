package modull6;
    
public abstract class Balok extends BangunRuang implements Dimensi {
    private double panjang;
    private double lebar;
    private double tinggi;
    Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
 }

 protected double hitungVolume() {
    return panjang * lebar * tinggi;
 }
 
 protected void info() {
    System.out.println("Balok dengan panjang " + panjang + ", lebar " + lebar + ", dan tinggi " + tinggi);
 }

 
 }
