<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class BukuTeks extends Buku {
    // Constructor
    public BukuTeks(String judul, int kodeBuku) {
        super(judul, kodeBuku);
    }

    // Implementasi abstract method untuk menampilkan informasi buku (Overriding)
    @Override
    public void tampilkanInfo() {
        System.out.println("Kode Buku : " + this.kodeBuku);
        System.out.println("Judul : " + this.judul);
        System.out.println("Tersedia : " + (this.ketersediaan ? "Ya" : "Tidak"));
    }

    // Overloaded
    public void tampilkanInfo(String addinfo) {
        System.out.println("Kode Buku : " + this.kodeBuku);
        System.out.println("Judul : " + this.judul);
        System.out.println("Tersedia : " + (this.ketersediaan ? "Ya" : "Tidak"));
        System.out.println("Info Tambahan : " + addinfo);
    }
}

=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

public class BukuTeks extends Buku {
    // Constructor
    public BukuTeks(String judul, int kodeBuku) {
        super(judul, kodeBuku);
    }

    // Implementasi abstract method untuk menampilkan informasi buku (Overriding)
    @Override
    public void tampilkanInfo() {
        System.out.println("Kode Buku : " + this.kodeBuku);
        System.out.println("Judul : " + this.judul);
        System.out.println("Tersedia : " + (this.ketersediaan ? "Ya" : "Tidak"));
    }

    // Overloaded
    public void tampilkanInfo(String addinfo) {
        System.out.println("Kode Buku : " + this.kodeBuku);
        System.out.println("Judul : " + this.judul);
        System.out.println("Tersedia : " + (this.ketersediaan ? "Ya" : "Tidak"));
        System.out.println("Info Tambahan : " + addinfo);
    }
}

>>>>>>> 3906db065b3e92a07e71977c56b9a44e229c5a0c
