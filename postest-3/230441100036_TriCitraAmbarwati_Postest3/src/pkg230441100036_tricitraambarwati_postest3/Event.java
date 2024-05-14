package pkg230441100036_tricitraambarwati_postest3;

interface Tiket {
    void jualTiket(int jumlahTiket);
}

abstract class Event implements Tiket {
    protected String namaEvent;
    protected String tanggalEvent;

    public Event(String namaEvent, String tanggalEvent) {
        this.namaEvent = namaEvent;
        this.tanggalEvent = tanggalEvent;
    }

    public abstract void tampilInformasi();
}