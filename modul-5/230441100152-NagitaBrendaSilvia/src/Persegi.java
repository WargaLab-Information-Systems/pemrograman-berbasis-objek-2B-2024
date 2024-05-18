class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    public double getSisi() {
        return sisi;
    }
 
    public double hitungLuas() {
        return sisi * sisi;
    }
 
    public void info() {
        System.out.println("Persegi:");
        System.out.println("Sisi: " + sisi);
    }
}