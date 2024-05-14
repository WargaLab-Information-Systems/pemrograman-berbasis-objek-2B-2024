import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BangunRuang[] bangunRuangArray = new BangunRuang[4];

        System.out.print("====KUBUS====");
        System.out.print("\nMasukkan sisi kubus: ");
        double sisiKubus = scanner.nextDouble();
        bangunRuangArray[0] = new Kubus(sisiKubus);

        System.out.println("--------------------------------------");
        System.out.println("====BALOK====");
        System.out.print("Masukkan panjang balok : ");
        double panjangBalok = scanner.nextDouble();
        System.out.print("Masukkan lebar balok   : ");
        double lebarBalok = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok  : ");
        double tinggiBalok = scanner.nextDouble();
        bangunRuangArray[1] = new Balok(panjangBalok, lebarBalok, tinggiBalok);

        System.out.println("--------------------------------------");
        System.out.println("====TABUNG====");
        System.out.print("Masukkan jari-jari tabung   : ");
        double jariTabung = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung      : ");
        double tinggiTabung = scanner.nextDouble();
        bangunRuangArray[2] = new Tabung(jariTabung, tinggiTabung);

        System.out.println("--------------------------------------");
        System.out.println("====KERUCUT====");
        System.out.print("Masukkan jari-jari kerucut  : ");
        double jariKerucut = scanner.nextDouble();
        System.out.print("Masukkan tinggi kerucut     : ");
        double tinggiKerucut = scanner.nextDouble();
        bangunRuangArray[3] = new Kerucut(jariKerucut, tinggiKerucut);

        System.out.print("\n~~~~~~~~~~~~~~~~~~~~~~~~~~H A S I L~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        for (BangunRuang bangunRuang : bangunRuangArray) {
            double volume = bangunRuang.hitungVolume();
            bangunRuang.info();
            System.out.println("Volume = " + volume);
        }

        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
    }
}