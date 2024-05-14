package com.example;

interface Jari { //interface adalah sebuah kelas abstrak yang memiliki method-method yang belum diimplementasikan.
    void setJari(double jari); // tipe data double adalah tipe data yang digunakan untuk menyimpan data berupa bilangan desimal
    double getJari();
 }
 
 interface Lebar {
    void setLebar(double lebar);
    double getLebar();
 }
 
 interface Panjang {
    void setPanjang(double panjang);
    double getPanjang();
 }
 
 interface Tinggi {
    void setTinggi(double tinggi);
    double getTinggi();
 }