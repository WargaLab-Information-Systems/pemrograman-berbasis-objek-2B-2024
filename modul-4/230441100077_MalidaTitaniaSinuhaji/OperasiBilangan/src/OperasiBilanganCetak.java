public class OperasiBilanganCetak {
    public static void main(String[] args){
        OperasiPenjumlahan a = new OperasiPenjumlahan() {          
            protected void set_C() {
               
            }
        } ;
        a.tampil();
        System.out.println("\n");
        OperasiPengurangan b = new OperasiPengurangan() {        
            protected void set_C() {
              
            }
        };
        b.tampil();
        System.out.println("\n");
        OperasiPerkalian c = new OperasiPerkalian() {         
            protected void set_C() {
               
            }
        };
        c.tampil();
        System.out.println("\n");
        OperasiPembagian d = new OperasiPembagian() {
            protected void set_C() {
               
            }
        };
        d.tampil();
    }
}
