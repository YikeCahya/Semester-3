class Truk extends Kendaraan {
    int kapasitasBeban;

    public Truk(String merk, int tahunProduksi, int kapasitasBeban) {
        super(merk, tahunProduksi);
        this.kapasitasBeban = kapasitasBeban;
    }

    @Override
    void jalankan() {
        System.out.println("Truk " + merk + " berjalan...");
    }

    void info() {
        super.info();
        System.out.println("Kapasitas Beban: " + kapasitasBeban + " kg");
    }
}
