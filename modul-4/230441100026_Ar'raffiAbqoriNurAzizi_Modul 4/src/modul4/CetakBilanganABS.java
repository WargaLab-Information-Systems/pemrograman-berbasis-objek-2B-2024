package MODUL4;

public final class CetakBilanganABS {
   public CetakBilanganABS() {
   }

   private static void cetakSemua(OperasiBilanganABS[] OB, double a, double b) {
      OB[0] = new Penjumlahan();
      OB[1] = new Pengurangan();
      OB[2] = new Perkalian();
      OB[3] = new Pembagian();
      OperasiBilanganABS[] var5 = OB;
      int var6 = OB.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         OperasiBilanganABS OB1 = var5[var7];
         OB1.set_A(a);
         OB1.set_B(b);
         OB1.set_C();
         OB1.tampil();
      }
   }

   public static void main(String[] args) {
      OperasiBilanganABS[] cetak = new OperasiBilanganABS[4];
      cetakSemua(cetak, 9.25, 1.25);
   }
}
