package modull4;

public class OperasiPembagian extends OperasiBilangan{
    protected double a,b,c;

    protected void setA(double a){
        this.a = a;
    }

    protected void setB(double b){
        this.b = b;
    }


    protected void setC() {
        this.c = a / b;
    }

    protected double getA(){
        return a;
    }

    protected double getB(){
        return b;
    }

    protected double getC(){
        return c;
    }

    protected void tampil(){
        System.out.println("Hasil dari "+getA()+ " / "+getB()+" adalah "+ c);
    }
}