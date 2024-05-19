public class Kubus extends BangunRuang{
    double sisi;

    Kubus(double sisi){
        this.sisi = sisi;
    }

    double getSisi(){
        return sisi;
    }

    double hitungVolume(){
        return Math.pow(getSisi(),3);
    }

    void info(){
        System.out.println("Kubus");
        System.out.println("Sisi = "+ getSisi());
        System.out.println("Volume Kubus = "+ hitungVolume());
    }
}
