/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg230441100036_tricitraambarwati_postest2;

/**
 *
 * @author ACER
 */
abstract class Event {
    protected String namaEvent;
    protected String tanggalEvent;

    public Event(String namaEvent, String tanggalEvent) {
        this.namaEvent = namaEvent;
        this.tanggalEvent = tanggalEvent;
    }

    public abstract void tampilInformasi();
}