package posttest3;

public class Bagi extends Operator implements nilai1,nilai2 {
    double nilai1;
    double nilai2;
    
    public Bagi(double nilai1,double nilai2){
        this.nilai1=nilai1;
        this.nilai2=nilai2;
    }
    
    @Override
    public double get_nilai1(){
        return nilai1;
    }
    
    @Override
    public double get_nilai2(){
        return nilai2;
    }
    
    @Override
    double hitung(){
        return nilai1/nilai2;
    }
    @Override
    protected void tampilkan(){
        System.out.println("Hasil Pembagian " + nilai1 + (" : " +nilai2 +(" = " + hitung())) );
    }
}

    