/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg1;

/**
 *
 * @author ASUS
 */
public class Handphone {
    
    private String brand;
    private int storage;
    private double screenSize;
    private static int totalHandphoneCreated = 0;

    public Handphone(String brand, int storage, double screenSize) {
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        totalHandphoneCreated++;
    }

    public void turnOn() {
        System.out.println("Handphone " + brand + " dinyalakan.");
    }

    public void takePhoto() {
        System.out.println("Foto berhasil diambil dengan kamera handphone " + brand + ".");
    }

    public void playMusic() {
        System.out.println("Memutar musik di handphone " + brand + ".");
    }

    public static void displayTotalHandphoneCreated() {
        System.out.println("Total handphone yang telah dibuat: " + totalHandphoneCreated);
    }

    public void displayHandphoneInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Screen Size: " + screenSize + " inch");
    }
}
    

