public class Rak { 
    private String bahan;
    private int kapasitasMaksimum;
    private int jumlahBarang;

    public Rak(String bahan, int kapasitasMaksimum) {
        this.bahan = bahan;
        this.kapasitasMaksimum = kapasitasMaksimum;
        this.jumlahBarang = 0;
    }

    public void taruhBarang(int jumlah) {
        if (jumlahBarang + jumlah <= kapasitasMaksimum) {
            jumlahBarang += jumlah;
            System.out.println(jumlah + " barang ditaruh. Total sekarang: " + jumlahBarang);
        } else {
            System.out.println("Rak penuh! Tidak bisa menaruh barang sebanyak itu.");
        }
    }

    public void ambilBarang(int jumlah) {
        if (jumlah <= jumlahBarang) {
            jumlahBarang -= jumlah;
            System.out.println(jumlah + " barang diambil. Sisa: " + jumlahBarang);
        } else {
            System.out.println("Jumlah barang tidak cukup di rak!");
        }
    }

    public void cetakInformasi() {
        System.out.println("Rak terbuat dari: " + bahan);
        System.out.println("Kapasitas maksimum: " + kapasitasMaksimum);
        System.out.println("Jumlah barang saat ini: " + jumlahBarang);
    }
}