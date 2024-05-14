package MODUL4;

public class Penjumlahan extends OperasiBilanganABS {
   public Penjumlahan() {
   }

   protected void set_A(double a) {
      this.a = a;
   }

   protected void set_B(double b) {
      this.b = b;
   }

   protected void set_C() {
      this.c = this.a + this.b;
   }

   protected double get_A() {
      return this.a;
   }

   protected double get_B() {
      return this.b;
   }

   protected double get_C() {
      return this.c;
   }

   protected void tampil() {
      System.out.println("Perhitungan (Penjumlahan, Pengurangan,Perkalian, Pembagian)");
      System.out.println("Nilai a adalah : 9.25");
      System.out.println("Nilai b adalah : 1.25");
      System.out.println("============================================================");
      System.out.println("Operasi Bilangan : ");
      System.out.println("\n1. Penjumlahan");
      System.out.println("a + b = " + this.get_C());
   }
}
