/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kampus;

/**
 *
 * @author Asus
 */
public class Mahasiswa extends Kampus{
    String nim, nama, alamat, jurusan;

    Mahasiswa(String nama, String nim, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;      
    }
    
}
