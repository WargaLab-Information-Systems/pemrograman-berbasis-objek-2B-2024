/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul.pkg6;

/**
 *
 * @author ASUS
 */
public class Kubus implements BangunRuang {
  private double sisi;

  public Kubus(double sisi) {
    this.sisi = sisi;
  }

  public double getSisi() {
    return sisi;
  }

  public void setSisi(double sisi) {
    this.sisi = sisi;
  }

  @Override
  public double hitungVolume() {
    return sisi * sisi * sisi;
  }

  public void info() {
    System.out.println("Informasi Kubus:");
    System.out.println("Sisi: " + sisi);
    System.out.println("Volume: " + hitungVolume());
  }
}
    

