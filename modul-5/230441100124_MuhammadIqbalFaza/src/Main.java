//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BangunDatar[] bangundatar = new BangunDatar[3];
        System.out.print("Masukkan panjang persegi : ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi : ");
        double lebar = input.nextDouble();
        bangundatar[0] = new PersegiPanjang(panjang,lebar);

        System.out.print("Masukkan alas segitiga : ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga : ");
        double tinggi = input.nextDouble();
        bangundatar[1] = new Segitiga(alas,tinggi);

        System.out.print("Masukkan jari jari lingkaran : ");
        double jarijari = input.nextDouble();
        bangundatar[2] = new Lingkaran(jarijari);

        for (BangunDatar bangunDatar : bangundatar) {
            bangunDatar.tampil();
            System.out.println("");
        }
    }
}