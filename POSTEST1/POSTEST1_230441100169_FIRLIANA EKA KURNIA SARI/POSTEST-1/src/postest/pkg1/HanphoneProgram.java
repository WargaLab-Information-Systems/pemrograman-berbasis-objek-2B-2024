/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postest.pkg1;

/**
 *
 * @author ASUS
 */
public class HanphoneProgram {
    
    public static void main(String[] args) {
        Handphone hp1 = new Handphone("Samsung", 128, 6.5);
        Handphone hp2 = new Handphone("iPhone", 256, 6.1);

        hp1.turnOn();
        hp1.takePhoto();
        hp1.playMusic();
        hp1.displayHandphoneInfo();

        System.out.println();

        hp2.turnOn();
        hp2.takePhoto();
        hp2.playMusic();
        hp2.displayHandphoneInfo();

        Handphone.displayTotalHandphoneCreated();
    }
}
    

