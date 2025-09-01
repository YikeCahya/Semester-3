public class Jemuran {
    private String bahan;
    private int kapasitasBeban;
    private int pakaianSedangDijemur;

    public Jemuran(String bahan, int kapasitasBeban) {
        this.bahan = bahan;
        this.kapasitasBeban = kapasitasBeban;
        this.pakaianSedangDijemur = 0;
    }

    public void jemurPakaian(int jumlah) {
        if (pakaianSedangDijemur + jumlah <= kapasitasBeban) {
            pakaianSedangDijemur += jumlah;
            System.out.println(jumlah + " pakaian ditaruh di jemuran. Total sekarang: " + pakaianSedangDijemur);
        } else {
            System.out.println("Kapasitas jemuran tidak cukup!");
        }
    }

    public void ambilPakaian(int jumlah) {
        if (jumlah <= pakaianSedangDijemur) {
            pakaianSedangDijemur -= jumlah;
            System.out.println(jumlah + " pakaian diambil. Sisa: " + pakaianSedangDijemur);
        } else {
            System.out.println("Tidak ada cukup pakaian untuk diambil!");
        }
    }

    public void cetakInformasi() {
        System.out.println("Jemuran terbuat dari: " + bahan);
        System.out.println("Kapasitas beban: " + kapasitasBeban);
        System.out.println("Pakaian sedang dijemur: " + pakaianSedangDijemur);
    }
}