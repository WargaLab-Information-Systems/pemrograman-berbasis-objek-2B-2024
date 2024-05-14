package com.example;

class Kubus extends BangunRuang implements Jari {
    private double sisi;
 
    public Kubus(double sisi) {
        this.sisi = sisi;
    }
 
    @Override
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }
 
    @Override
    public void setJari(double jari) {
        this.sisi = jari;
    }
 
    @Override
    public double getJari() {
        return sisi;
    }
 
    public void info() { 
        System.out.println("Kubus dengan sisi " + sisi + " meter.");
    }
 }
 
 
 
 
 
 
 
