public class Segitiga extends BangunDatar{
    double alas,tinggi;

    Segitiga(double alas,double tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }

    @Override
    double HitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    void tampil() {
        System.out.println("Segitiga");
        System.out.println("Alas : "+alas);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Luas : "+HitungLuas());
    }
}
