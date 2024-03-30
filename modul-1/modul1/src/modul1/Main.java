package pkg1;

import static java.time.InstantSource.system;

/**
 *
 * @author HP
 */
class manusia {
    String nama;
    String umur;
    String alamat;
    public void berlari(){
        System.out.println("dan saya bisa" + " berlari ");
     }
    public void berjalan(){
        System.out.println("saya bisa" + " berjalan ");
     }
    public void alamat(){  
         System.out.println("alamat saya" + " jember ");
     }
}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia();
        
        orang1.nama ="Nagita Brenda Silvia";
        orang1.umur ="18tahun";
        orang1.alamat ="Jember";
        System.out.println("Nama: " + orang1.nama);
        System.out.println("umur: " + orang1.umur);
        System.out.println("alamat: " + orang1.alamat);



        orang1.berjalan();
        orang1.berlari();
        System.out.println("terimakasih");
        
        
        
   
        
        
    }
}