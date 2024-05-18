class Lingkaran extends BangunDatar {
    private double jariJari; 
    
    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    public double getJariJari() {
        return jariJari;
    }
    
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
   
    public void info() {
        System.out.println("Lingkaran:");
        System.out.println("Jari-Jari: " + jariJari);
    }
}