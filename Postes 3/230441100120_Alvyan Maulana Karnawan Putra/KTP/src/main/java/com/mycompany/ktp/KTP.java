/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ktp;

/**
 *
 * @author TOSHIBA
 */

abstract class KTP {
    abstract void Info();
}

interface Biodata {
    int getNIK();
    String getNama();
    String getTTL(); 
    String getJenisKelamin();
    String getAlamat();
    String getAgama();
    String getStatus();
    String getPekerjaan();
    String getKewarganegaraan();
    String getMasaBerlaku(); 
}

