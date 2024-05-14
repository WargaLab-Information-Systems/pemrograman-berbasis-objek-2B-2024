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

    @Override
    public void display(int i){
        super.display(i);
        System.out.println("| Judul Buku    : " + getJudul());
        System.out.println("| Penulis Buku  : " + getPenulis());
        System.out.println("| Publisher Buku: " + getPenerbit());
        System.out.println("| Kategori Buku : " +  kategori);
        System.out.println("| Stok Buku    : " +  getStok());
        System.out.println("| Tahun Buku    : " +  getTahunTerbit());
        System.out.println("|=====================================|\n"); 
    }
}
