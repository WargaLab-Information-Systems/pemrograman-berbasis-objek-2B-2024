package pkg230441100124_muhammadiqbalfaza;

import java.util.ArrayList;

public class listBuku {
    ArrayList<buku> listBuku1 = new ArrayList<>();

    public void tambahBuku(buku buku1) {
        listBuku1.add(buku1);
    }

    public void tampilkanListBuku() {
        if (listBuku1.isEmpty()) {
            System.out.println("Tidak ada buku");
        } else {
            System.out.println("Daftar Buku : ");
            for (int i = 0; i < listBuku1.size(); i++) {
                System.out.println("\nBuku ke-" + (i + 1) + ":");
                listBuku1.get(i).tampilkanBuku();
            }
        }
    }
}
