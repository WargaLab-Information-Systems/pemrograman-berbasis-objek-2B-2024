package modull4;

abstract class OperasiBilangan {
    protected double a,b,c;

    protected abstract void setA(double a);
    protected abstract void setB(double b);
    protected abstract void setC();

    protected abstract double getA();
    protected abstract double getB();
    protected abstract double getC();
    protected abstract void tampil();
}
