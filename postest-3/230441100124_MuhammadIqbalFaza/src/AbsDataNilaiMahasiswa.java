abstract class AbsDataNilaiMahasiswa{
    String nama,nim;
    double nilaiTugas, nilaiUts, nilaiUas;
    abstract void setAbsDataNilaiMahasiswa(String nama,String nim,double nilaiTugas,double nilaiUts,double nilaiUas);

    abstract double HitungNilai();
    abstract  String GradeNilai();
    abstract void info();


}
