/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.object;

/**
 *
 * @author ASUS
 */
public class OBJECT {
    
    public static void main(String[] args) {
      manusia identitas1 = new manusia();
       identitas1.nama="ibnu";
       identitas1.umur=18;
       identitas1.alamat="madura";
       
        System.out.println("nama saya:" +identitas1.nama);
        System.out.println("umur saya adalah:" + identitas1.umur);
        System.out.println("almat saya:" + identitas1.alamat);
        
        manusia identitas2 =new manusia();
        identitas2.berjalan(20);
        identitas2.berlari(55);
        
         
    }
}
