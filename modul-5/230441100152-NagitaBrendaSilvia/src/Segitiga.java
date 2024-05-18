class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getAlas() {
        return alas;
    }
    public void info() {
        System.out.println("Segitiga:");
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
    }
    
}