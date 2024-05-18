class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
 
    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
  
    public void info() {
        System.out.println("Persegi Panjang:");
        System.out.println("Panjang: " + getPanjang()); 
        System.out.println("Lebar: " + getLebar()); 
    }
}