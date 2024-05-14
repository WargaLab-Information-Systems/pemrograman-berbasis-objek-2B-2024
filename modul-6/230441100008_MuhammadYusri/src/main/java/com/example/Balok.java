package com.example;

class Balok extends BangunRuang implements Panjang, Lebar, Tinggi {
    private double panjang;
    private double lebar;
    private double tinggi;
 
    public Balok(double panjang, double lebar, double tinggi) { // ini adalah constructor yang digunakan untuk menginisialisasi nilai awal dari panjang, lebar, dan tinggi
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
 
    @Override //override berarti kita menimpa method yang sudah ada di parent class
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
 
    @Override
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
 
    @Override
    public double getPanjang() {
        return panjang;
    }
 
    @Override
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
 
    @Override
    public double getLebar() {
        return lebar;
    }
 
    @Override
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
 
    @Override
    public double getTinggi() {
        return tinggi;
    }
 
    public void info() {
        System.out.println("Balok dengan panjang " + panjang + " meter, lebar " + lebar + " meter, dan tinggi " + tinggi + " meter.");
    }
 }