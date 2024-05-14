/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest3;

/**
 *
 * @author THINKPAD
 */
public class barangnya extends produk implements Transaksi {
    private String kode;
    private String nama;
    private float harga;
    private int jumlahPembelian;
    
    @Override
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void setHarga(float harga) {
        this.harga = harga;
    }
    
    @Override
    public void setJumlahPembelian(int jumlahPembelian) {
        this.jumlahPembelian = jumlahPembelian;
    }
    
    @Override
    public String getKode() {
        return kode;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    
    @Override
    public float getHarga() {
        return harga;
    }
    @Override
    public int getJumlahPembelian() {
        return jumlahPembelian;
    }
  
    @Override
    public float getBayar() {
        return harga * jumlahPembelian;
    }
//    overload
    public void setKode(int kode) {
        this.kode = Integer.toString(kode);
    }
    public void setNama(String nama,String brand) {
        this.nama = nama +" "+brand;
    }
    public void setHarga(int harga) {
        this.harga = (float)harga;
    }
    public void setJumlahPembelian(String jumlahPembelian) {
        this.jumlahPembelian =Integer.parseInt (jumlahPembelian);
    }
//    interface
    public void inputDataPenjualan(){
        System.out.println("Ini data");
    }
    public void prosesPembayaran(){
        System.out.println("Ini proses bayar");
    }
    
}
