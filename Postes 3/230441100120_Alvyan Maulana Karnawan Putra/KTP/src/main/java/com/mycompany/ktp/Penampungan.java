/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ktp;

/**
 *
 * @author TOSHIBA
 */
class Penampungan extends KTP implements Biodata {

    private int nik;
    private String nama;
    private String ttl;
    private String jenisKelamin;
    private String alamat;
    private String agama;
    private String status;
    private String pekerjaan;
    private String kewarganegaraan;
    private String masaBerlaku;


    public Penampungan(int nik, String nama, String ttl, String jenisKelamin, String alamat, String agama, String status, String pekerjaan, String kewarganegaraan, String masaBerlaku) {
        this.nik = nik;
        this.nama = nama;
        this.ttl = ttl;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.agama = agama;
        this.status = status;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.masaBerlaku = masaBerlaku;
    }

    @Override
    public int getNIK() {
        return nik;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getTTL() {
        return ttl;
    }

    @Override
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    @Override
    public String getAlamat() {
        return alamat;
    }

    @Override
    public String getAgama() {
        return agama;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getPekerjaan() {
        return pekerjaan;
    }

    @Override
    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    @Override
    public String getMasaBerlaku() {
        return masaBerlaku;
    }

    @Override
    public void Info() {
        System.out.println("=== Informasi KTP ===");
        System.out.println("NIK: " + getNIK());
        System.out.println("Nama: " + getNama());
        System.out.println("TTL: " + getTTL());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Agama: " + getAgama());
        System.out.println("Status: " + getStatus());
        System.out.println("Pekerjaan: " + getPekerjaan());
        System.out.println("Kewarganegaraan: " + getKewarganegaraan());
        System.out.println("Masa Berlaku: " + getMasaBerlaku());
    }
}

