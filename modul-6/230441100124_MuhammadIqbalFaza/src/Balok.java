public class Balok extends BangunRuang implements Lebar,Tinggi{
    double panjang;
    double lebar;
    double tinggi;

    Balok (double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    public double getTinggi(){
        return tinggi;
    }

    double hitungVolume(){
        return getPanjang()*getLebar()*getTinggi();
    }

    void info(){
        System.out.println("Balok");
        System.out.println("Panjang = "+ getPanjang());
        System.out.println("Lebar = "+ getLebar());
        System.out.println("Tinggi = "+ getTinggi());
        System.out.println("Volume Kubus = "+ hitungVolume());
    }
}
