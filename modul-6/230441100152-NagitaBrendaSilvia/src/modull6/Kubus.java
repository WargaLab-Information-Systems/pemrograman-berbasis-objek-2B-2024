package modull6;

public class Kubus extends BangunRuang implements Dimensi {
    private double sisi;
    Kubus(double sisi) {
        this.sisi = sisi;
 }
 
public double hitungVolume() {
    return Math.pow(sisi, 3);
 }

public void info() {
    System.out.println("Kubus dengan sisi " + sisi);
 }

public double getJariJari() {
    return 0; 
 }
 
public double getLebar() {
    return 0; 
 }

public double getTinggi() {
    return 0; 
 }

    @Override
    public double JariJari() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double Lebar() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public double Tinggi() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
   