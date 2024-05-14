package posttest;

public abstract class Produk {
    protected String namabarang;
    protected int hargabarang;

    public Produk(String namabarang, int hargabarang) {
        this.namabarang = namabarang;
        this.hargabarang = hargabarang;
    }

    public String getNamaBarang() {
        return namabarang;
    }

    public int getHargaBarang() {
        return hargabarang;
    }

    public abstract int hitungHarga();

    void setNamaBarang(String namaBarang) {
        this.namabarang = namaBarang;
    }
}