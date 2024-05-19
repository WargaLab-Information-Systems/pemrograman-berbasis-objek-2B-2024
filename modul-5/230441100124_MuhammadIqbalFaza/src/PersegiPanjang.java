public class PersegiPanjang extends BangunDatar{
    double panjang,lebar;

    PersegiPanjang(double panjang,double lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    @Override
    double HitungLuas() {
        return panjang * lebar;
    }

    @Override
    void tampil() {
        System.out.println("Persegi panjang");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("Luas : "+HitungLuas());


    }
}
