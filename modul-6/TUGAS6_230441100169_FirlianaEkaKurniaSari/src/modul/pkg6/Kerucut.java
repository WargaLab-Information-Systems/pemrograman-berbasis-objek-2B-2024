/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
public class Kerucut implements BangunRuang {
  private double jariJari, tinggi;

  public Kerucut(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
  }

  public double getJariJari() {
    return jariJari;
  }

  public void setJariJari(double jariJari) {
    this.jariJari = jariJari;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  @Override
  public double hitungVolume() {
  return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggi;
}

public void info() {
  System.out.println("Informasi Kerucut:");
  System.out.println("Jari-jari: " + jariJari);
  System.out.println("Tinggi: " + tinggi);
  System.out.println("Volume: " + hitungVolume());
}
}
    

