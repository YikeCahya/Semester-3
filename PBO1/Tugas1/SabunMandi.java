public class SabunMandi extends Sabun {
    private String jenisKulit;

    public SabunMandi(String merek, String jenisKulit) {
        super(merek);
        this.jenisKulit = jenisKulit;
    }

    public void mandi() {
        jumlahPemakaian++;
        System.out.println("Menggunakan sabun mandi " + merek + " untuk kulit " + jenisKulit + ". Total pemakaian: " + jumlahPemakaian);
    }

    public void setJenisKulit(String newValue) {
        jenisKulit = newValue;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jenis kulit: " + jenisKulit);
    }
}