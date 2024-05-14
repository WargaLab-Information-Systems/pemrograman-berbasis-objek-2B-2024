class Buah extends BuahAbstract implements BuahInterface {
    public Buah(String nama, int beratGram) {
        super(nama, beratGram);
    }

    @Override
    public void infoTambahan() {
        System.out.println("Tambahan Informasi: Ini adalah buah " + getNama());
    }
}