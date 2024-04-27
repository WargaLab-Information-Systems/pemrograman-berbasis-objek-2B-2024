abstract class DataNilaiMahasiswa {
    protected String nama,nim;
    protected double nilaiTugas, nilaiUts, nilaiUas;

    abstract void setDataMahasiswa(String nama,String nim,double nilaiTugas,double nilaiUts,double nilaiUas);
    abstract double hitungNilai();
    abstract String GradeNilai();
    abstract void tampil();




}
