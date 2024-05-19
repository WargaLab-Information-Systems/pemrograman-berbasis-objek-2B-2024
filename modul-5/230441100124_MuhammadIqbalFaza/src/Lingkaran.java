public class Lingkaran extends BangunDatar{
    double jarijari;

    Lingkaran(double jarijari){
        this.jarijari=jarijari;
    }

    @Override
    double HitungLuas() {
        return Math.PI * Math.pow(jarijari,2);
    }

    double HitungLuas(double jarijari){
        return 2 * jarijari;
    }

    @Override
    void tampil() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari : "+jarijari);
        System.out.println("Luas : "+HitungLuas());
        System.out.println("Diameter : "+HitungLuas(jarijari));
    }
}
