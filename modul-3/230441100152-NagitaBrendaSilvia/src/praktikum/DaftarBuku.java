package praktikum;

import java.util.ArrayList;

class DaftarBuku {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("===================================================================");
        for (Buku buku : daftarBuku) {
            buku.displayInfo();
            System.out.println("-------------------------------------------------------------------");
        }
        System.out.println("===================================================================");
    }
}