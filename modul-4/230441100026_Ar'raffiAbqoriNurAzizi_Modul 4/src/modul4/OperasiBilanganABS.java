package MODUL4;

public abstract class OperasiBilanganABS {
   protected double a;
   protected double b;
   protected double c;

   public OperasiBilanganABS() {
   }
   
   protected abstract void set_A(double a);

   protected abstract void set_B(double b);

   protected abstract void set_C();

   protected abstract double get_A();

   protected abstract double get_B();

   protected abstract double get_C();

   protected abstract void tampil();
}
