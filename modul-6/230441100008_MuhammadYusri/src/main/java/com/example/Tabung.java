package com.example;

class Tabung extends BangunRuang implements Jari, Tinggi { //implements adalah keyword yang digunakan untuk mewariskan method dari interface
    private double jari;
    private double tinggi;
 
    public Tabung(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
 
    @Override
    public double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
 
    @Override
    public void setJari(double jari) {
        this.jari = jari;
    }
 
    @Override
    public double getJari() {
        return jari;
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
        System.out.println("Tabung dengan jari-jari " + jari + " meter dan tinggi " + tinggi + " meter.");
    }
 }