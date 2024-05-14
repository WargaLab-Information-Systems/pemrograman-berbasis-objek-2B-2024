package posttest;

public class KonversiListrik extends Hasil implements volt,ampere {
    private double volt;
    private double ampere;


    public KonversiListrik ( double volt, double ampere) {
        this.volt = volt;
        this.ampere = ampere;
    }

    @Override
    public double hasilnya() {
        return (ampere * volt );
    }

    @Override
    public double getampere() {
        return ampere;
    }

    @Override
    public double getvolt() {
        return volt;
}

public void inpo() {
    System.out.println("Hasil Konversi Listrik : " + hasilnya());
}

@Override
public void setampere(double ampere) {
}

@Override
public void setvolt(double volt) {
}

}