package manusia;

class Manusia {
    String nama;
    int umur;
    String alamat;

    public void berlari() {
        System.out.println("Objek ini " + this.nama + " berlari");
    }

    public void berjalan() {
        System.out.println("Objek ini " + this.nama + " berjalan");
    }
}

public class ManusiaApp {

    public static void main(String[] args) {
        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();

        orang1.nama = "Rehan";
        orang1.umur = 19;
        orang1.alamat = "Mojokerto";
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Alamat Objek 1 adalah " + orang1.alamat);
        System.out.println("Umur Objek 1 adalah " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");

        orang2.nama = "Wahyu";
        orang2.umur = 18;
        orang2.alamat = "Tuban";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Alamat Objek 2 adalah " + orang2.alamat);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + " Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
}
