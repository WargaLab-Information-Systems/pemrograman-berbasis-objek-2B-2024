/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

public class buku1 extends buku {
    
    @Override
    void Informasi() {
        // Memanggil metode Informasi() dari superclass (buku)
        super.Informasi();
        // Menambahkan informasi tambahan khusus untuk Novel
        System.out.println("informasi khusus untuk buku1.");
    }
}
