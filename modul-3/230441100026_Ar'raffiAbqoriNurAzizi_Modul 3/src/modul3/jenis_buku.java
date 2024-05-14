package Modul3;

public class jenis_buku {
    private String judul;
    private String penulis;
    private String penerbit;
    private int stok;
    private int tahun_terbit;

    public jenis_buku(String judul, String penulis, String penerbit, int stok, int tahun_terbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.stok = stok;
        this.tahun_terbit = tahun_terbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getTahunTerbit() {
        return tahun_terbit;
    }

    public void setTahunTerbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }
    
    public void display(int i){
        System.out.println("\n|======== IDENTITAS BUKU KE - "+ (i+1) +"========|");
    }
}
