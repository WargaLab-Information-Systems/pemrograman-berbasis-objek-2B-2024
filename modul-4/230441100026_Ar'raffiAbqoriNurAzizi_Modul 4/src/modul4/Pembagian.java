package MODUL4;

public class Pembagian extends OperasiBilanganABS {
   public Pembagian() {
   }

   protected void set_A(double a) {
      this.a = a;
   }

   protected void set_B(double b) {
      this.b = b;
   }

   protected void set_C() {
       if (b!=0) {
           this.c = this.a/this.b;
       } 
       else {
           System.out.println("Pembagian dengan nol tidak dapat digunakan");
       }
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
      System.out.println("\n4. Pembagian");
      System.out.println("a : b = " + this.get_C());
   }
}
