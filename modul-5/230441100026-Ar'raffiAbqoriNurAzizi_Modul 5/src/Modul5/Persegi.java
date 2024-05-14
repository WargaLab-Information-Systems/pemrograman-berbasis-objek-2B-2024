package Modul5;

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    protected double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    protected void info() {
        System.out.println("Ini adalah persegi dengan sisi " + sisi);
    }
    
//    public static persegi inputpersegi() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukkan sisi dari persegi: ");
//        double sisi = scanner.nextDouble();
//        return new persegi(sisi);
//    }
}
