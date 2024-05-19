package pkg230441100124_muhammadiqbalfaza;

public class buku {
    protected String judul, penulis, publisher, stock, tahunTerbit;
    protected char kategori;

    public buku(String judul, String penulis, String publisher, String stock, String tahunTerbit, char kategori) {
        this.judul = judul;
        this.penulis = penulis;
        this.publisher = publisher;
        this.stock = stock;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }

    public void tampilkanBuku() {
        System.out.println("Judul\t\t\t: " + judul);
        System.out.println("Penulis\t\t\t:" + penulis);
        System.out.println("Publisher\t\t:" + publisher);
        System.out.println("Stock\t\t\t:" + stock);
        System.out.println("Tahun Terbit\t:" + tahunTerbit);
        System.out.print("Kategori\t\t:");
        switch (kategori) {
            case 'S':
                System.out.println("Semua Umur");
                break;
            case 'D':
                System.out.println("Dewasa");
                break;
            case 'R':
                System.out.println("Remaja");
                break;
            case 'A':
                System.out.println("Anak-anak");
                break;
            default:
                System.out.println("Kategori tidak diketahui");
                break;
        }
    }
}
