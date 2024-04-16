package Modul3;

public class kategori_buku extends jenis_buku {
    private String kategori;

    public kategori_buku(String judul, String penulis, String penerbit, int stok, int tahun_terbit, String kategori) {
        super(judul, penulis, penerbit, stok, tahun_terbit);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
