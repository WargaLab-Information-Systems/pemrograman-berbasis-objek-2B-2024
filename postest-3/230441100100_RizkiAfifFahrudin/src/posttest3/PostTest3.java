package posttest3;

import java.util.Scanner;

public class PostTest3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operator[] bilangan = new Operator[4];
        
        System.out.println("Masukan angka pertama : ");
        double angka1 = input.nextDouble();
        System.out.println("Masukan angka kedua : ");
        double angka2 = input.nextDouble();
        
        bilangan[0] = new Tambah(angka1,angka2);
        bilangan[1] = new Kurang(angka1,angka2);
        bilangan[2] = new Kali(angka1,angka2);
        bilangan[3] = new Bagi(angka1,angka2);
        
        for(Operator bilangan1:bilangan){
            bilangan1.tampilkan();
            System.out.println("");
        }
    }
}
