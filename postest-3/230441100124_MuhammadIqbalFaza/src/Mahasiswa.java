public class Mahasiswa extends AbsDataNilaiMahasiswa implements NilaiTugas,NilaiUts,NilaiUas{
    protected String nama,nim;
    protected double nilaiTugas, nilaiUts, nilaiUas;

    void setAbsDataNilaiMahasiswa(String nama,String nim,double nilaiTugas,double nilaiUts,double nilaiUas){
        this.nama=nama;
        this.nim=nim;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUts=nilaiUts;
        this.nilaiUas=nilaiUas;
    }

    public double getNilaiTugas(){
        return nilaiTugas;
    }

    public double getNilaiUts(){
        return nilaiUts;
    }

    @Override
    public double getNilaiUas() {
        return nilaiUas;
    }

    double HitungNilai() {
        return (getNilaiUas()*0.4)+(getNilaiUts()*0.3)+(getNilaiTugas()*0.3);
    }

    String GradeNilai() {
        double nilaiAkhir = HitungNilai();
        if (nilaiAkhir>=80) {
            return "A";
        } else if (nilaiAkhir>=70) {
            return "B";
        }else if (nilaiAkhir>=60){
            return "C";
        }else if (nilaiAkhir>=50){
            return "D";
        }else {
            return "E";
        }
    }

    void info() {
        System.out.println("Hasil Nilai Mahasiswa = ");
        System.out.println("Nama\t= "+nama);
        System.out.println("nim\t="+nim);
        System.out.println("Nilai Tugas\t= "+getNilaiTugas());
        System.out.println("Nilai UTS\t= "+getNilaiUts());
        System.out.println("Nilai UAS\t= "+getNilaiUas());
        System.out.println("Nilai Akhir\t= "+HitungNilai());
        System.out.println("Nilai Grade\t\t= "+GradeNilai());
    }
}
