package pkg230441100036_tri.citra.ambarwati;

/**
 *
 * @author ACER
 */

public class manusia {
    //Atribut dari class
    String Nama, Alamat;
    char JenisKelamin1 ='L';
    char JenisKelamin2 ='P';
    int Umur;
    
    //method dari class
    public void berjalan() {
        //memanggil method
        System.out.println(Nama+" sedang berjalan");
    }
    
    public void berlari() {
        System.out.println(Nama+" sedang berlari");
    }
    
    public static void main(String[] args) {
        //membuat objek
        manusia m = new manusia ();
        
        //pendeklarasian objek dengan beberapa atribut
        m.Nama = "Budi";
        m.Umur = 19;
        m.Alamat = "Madiun";
        //menampilkan output
        System.out.println(m.Nama+" berjenis kelamin "+m.JenisKelamin1+ " berumur "+m.Umur+" tahun, bertempat tinggal di "+m.Alamat);
        //memanggil method
        m.berjalan();
        m.berlari();
        
        m.Nama = "Siti";
        m.Umur = 19;
        m.Alamat = "Sidoarjo";
        System.out.println("\n"+m.Nama+" berjenis kelamin "+m.JenisKelamin2+ " berumur "+m.Umur+" tahun, bertempat tinggal di "+m.Alamat);
        m.berjalan();
        m.berlari();
    }
    
}