/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumke4;

/**
// *
// * @author H
// */
//public class bilanganabstractcetak {
//    
//}
//package modul5;

final class BilanganAbsCetak {
    private static void run(BilanganAbs[] OBA, double a, double b) {
        OBA[0] = new OperasiPenjumlahan();
        OBA[1] = new OperasiPengurangan();
        OBA[2] = new OperasiPerkalian();
        OBA[3] = new OperasiPembagian();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x Nama : Nuri Hidayatuloh x");
        System.out.println("x NIM : 210441100100 x");
        System.out.println("x Kelas: PBO A x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("x Bilangan A\t: " + a + "\t x");
        System.out.println("x Bilangan B\t: " + b + "\t x");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        for (BilanganAbs operation : OBA) {
            operation.set_A(a);
            operation.set_B(b);
            operation.set_C();
            operation.tampil();
        }
    }

    public static void main(String[] args) {
        BilanganAbs[] OBA = new BilanganAbs[4];
        run(OBA, 6.5, 0.5);
    }
}
