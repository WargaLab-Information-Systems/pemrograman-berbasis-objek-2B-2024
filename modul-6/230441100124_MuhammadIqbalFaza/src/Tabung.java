public class Tabung extends BangunRuang implements JariJari,Tinggi{
    double jarijari;
    double tinggi;

    Tabung(double jarijari, double tinggi){
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
        return Math.PI * Math.pow(jarijari, 2) * tinggi;
    }

    void info(){
        System.out.println("Tabung");
        System.out.println("Jari jari = "+ getJariJari());
        System.out.println("Tinggi = "+ getTinggi());
        System.out.println("Volume Tabung = "+ hitungVolume());
    }
}
