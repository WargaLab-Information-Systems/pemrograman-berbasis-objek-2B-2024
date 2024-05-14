package pkg230441100036_tricitraambarwati_postest3;

class Konser extends Event {
    private int hargaTiket;
    private static int totalTiketTerjual = 0;

    public Konser(String namaKonser, String tanggalKonser, int hargaTiket) {
        super(namaKonser, tanggalKonser);
        this.hargaTiket = hargaTiket;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public static int getTotalTiketTerjual() {
        return totalTiketTerjual;
    }

    @Override
    public void jualTiket(int jumlahTiket) {
        totalTiketTerjual += jumlahTiket;
    }

    @Override
    public void tampilInformasi() {
        System.out.println("=======================================");
        System.out.println("\nNama Konser          : " + namaEvent);
        System.out.println("Tanggal Konser       : " + tanggalEvent);
//        System.out.println("Harga Tiket          : Rp" + hargaTiket);
        System.out.println("Total Tiket Terjual  : " + totalTiketTerjual);
    }
}