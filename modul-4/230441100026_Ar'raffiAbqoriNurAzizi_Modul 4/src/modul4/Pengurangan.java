package MODUL4;

public class Pengurangan extends OperasiBilanganABS {
   public Pengurangan() {
   }

   protected void set_A(double a) {
      this.a = a;
   }

   protected void set_B(double b) {
      this.b = b;
   }

   protected void set_C() {
      this.c = this.a - this.b;
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
      System.out.println("\n2. Pengurangan");
      System.out.println("a - b = " + this.get_C());
   }
}