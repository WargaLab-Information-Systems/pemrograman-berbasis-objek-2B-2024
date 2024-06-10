/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
public class Balok implements BangunRuang {
  private double panjang, lebar, tinggi;

  public Balok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  public double getPanjang() {
    return panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  @Override
  public double hitungVolume() {
    return panjang * lebar * tinggi;
  }

  public void info() {
    System.out.println("Informasi Balok:");
    System.out.println("Panjang: " + panjang);
    System.out.println("Lebar: " + lebar);
    System.out.println("Tinggi: " + tinggi);
    System.out.println("Volume: " + hitungVolume());
  }
}

    

