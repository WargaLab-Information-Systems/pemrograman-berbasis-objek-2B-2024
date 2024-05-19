<<<<<<< HEAD
public class Mahasiswa extends DataNilaiMahasiswa{
    protected String nama,nim;
    protected double nilaiTugas, nilaiUts, nilaiUas;

    @Override
    void setDataMahasiswa(String nama, String nim, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nama=nama;
        this.nim=nim;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUts=nilaiUts;
        this.nilaiUas=nilaiUas;
    }

    @Override
    double hitungNilai() {
        return (nilaiUas*0.4)+(nilaiUts*0.3)+(nilaiTugas*0.3);
    }

    @Override
    String GradeNilai() {
        double nilaiAkhir = hitungNilai();
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

    @Override
    void tampil() {
        System.out.println("Hasil Nilai Mahasiswa = ");
        System.out.println("Nama\t= "+nama);
        System.out.println("nim\t="+nim);
        System.out.println("Nilai Tugas\t= "+nilaiTugas);
        System.out.println("Nilai UTS\t= "+nilaiUts);
        System.out.println("Nilai UAS\t= "+nilaiUas);
        System.out.println("Nilai Akhir\t= "+hitungNilai());
        System.out.println("Nilai Grade\t\t= "+GradeNilai());
    }
}
=======
public class Mahasiswa extends DataNilaiMahasiswa{
    protected String nama,nim;
    protected double nilaiTugas, nilaiUts, nilaiUas;

    @Override
    void setDataMahasiswa(String nama, String nim, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nama=nama;
        this.nim=nim;
        this.nilaiTugas=nilaiTugas;
        this.nilaiUts=nilaiUts;
        this.nilaiUas=nilaiUas;
    }

    @Override
    double hitungNilai() {
        return (nilaiUas*0.4)+(nilaiUts*0.3)+(nilaiTugas*0.3);
    }

    @Override
    String GradeNilai() {
        double nilaiAkhir = hitungNilai();
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

    @Override
    void tampil() {
        System.out.println("Hasil Nilai Mahasiswa = ");
        System.out.println("Nama\t= "+nama);
        System.out.println("nim\t="+nim);
        System.out.println("Nilai Tugas\t= "+nilaiTugas);
        System.out.println("Nilai UTS\t= "+nilaiUts);
        System.out.println("Nilai UAS\t= "+nilaiUas);
        System.out.println("Nilai Akhir\t= "+hitungNilai());
        System.out.println("Nilai Grade\t\t= "+GradeNilai());
    }
}
>>>>>>> da9c22eeaf5b14f35022bf8463246ed65e35c2c4
