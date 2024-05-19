public class Kerucut extends BangunRuang implements JariJari,Tinggi{
    double jarijari;
    double tinggi;

    Kerucut(double jarijari, double tinggi){
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public double getJariJari(){
        return jarijari;
    }

    public double getTinggi(){
        return tinggi;
    }

    double hitungVolume(){
        return (1.0/3.0) * Math.PI * Math.pow(jarijari, 2) * tinggi;
    }

    void info(){
        System.out.println("Kerucut");
        System.out.println("Jari-jari = "+ getJariJari());
        System.out.println("Tinggi = "+ getTinggi());
        System.out.println("Volume Kerucut = "+ hitungVolume());
    }
}
