package com.example;

class Kerucut extends BangunRuang implements Jari, Tinggi {
    private double jari;
    private double tinggi;
 
    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }
 
    @Override
    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jari * jari * tinggi;
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
        System.out.println("Kerucut dengan jari-jari " + jari + " meter dan tinggi " + tinggi + " meter.");
    }
 }
 