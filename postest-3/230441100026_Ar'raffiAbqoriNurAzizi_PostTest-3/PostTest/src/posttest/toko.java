package posttest;

public class toko extends Produk {
    private int idpelanggan, jumlahbarang;
    private char status;
    private static int nextId = 100;
    private final String namapelanggan; // digunakan untuk menyimpan nama pelanggan agar tidak dapat diubah ketika di-inisialisaisikan

    // menentukan atribute menggunakan konstruktor
    public toko(int idpelanggan, String namapelanggan, String namabarang, String hargabarang, int jumlahbarang) {
        super(namabarang, Integer.parseInt(hargabarang.replace("Rp", "")));
        this.idpelanggan = idpelanggan;
        this.namapelanggan = namapelanggan;
        this.jumlahbarang = jumlahbarang;
    }

    // Method 
    public void updateJumlahBarang(int jumlahBarang) {
        this.jumlahbarang = jumlahBarang;
    }

    public void updateIdPelanggan(int idPelanggan) {
        this.idpelanggan = idPelanggan;
    }

    public void updateNamaBarang(String namaBarang) {
        super.setNamaBarang(namaBarang);
    }

    // Getter
    public int getIdPelanggan() {
        return idpelanggan;
    }

    public String getNamaPelanggan() {
        return namapelanggan;
    }

    public int getIdBarang() {
        return super.getHargaBarang();
    }

    public String getNamaBarangFromParent() {
        return super.getNamaBarang();
    }

    public int getJumlahBarang() {
        return jumlahbarang;
    }

    // membuat method/fungsi untuk ketika inputan dilakukan
    void pembelian() {
        System.out.println("ID Pelanggan : " + idpelanggan);
        System.out.println("Nama Pelanggan : " + namapelanggan);
        System.out.println("ID Barang : " + getIdBarang());
        System.out.println("Nama Barang : " + getNamaBarangFromParent());
        System.out.println("Jumlah Barang : " + jumlahbarang);
        System.out.println("Total Harga : " + hitungHarga());
    }
    
    // method untuk menghitung total harga barang yang dibeli 
//    Override
    public int hitungHarga() {
        return super.getHargaBarang() * jumlahbarang; //return super digunakan untuk memanggil harga perbarang kemudian dikali jumlahbarang
    }
    
//    Overloading
    public int hitungHarga(double discount){
        return(int)(super.getHargaBarang() * jumlahbarang * (1-discount));
    }
}