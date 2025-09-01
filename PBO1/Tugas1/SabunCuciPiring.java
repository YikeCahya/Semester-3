public class SabunCuciPiring extends Sabun {
    private String kandungan;

    public SabunCuciPiring(String merek, String kandungan) {
        super(merek);
        this.kandungan = kandungan;
    }

    public void cuci(int jumlahPiring) {
        jumlahPemakaian += jumlahPiring;
        System.out.println("Mencuci " + jumlahPiring + " piring dengan sabun " + merek + ". Total piring dicuci: " + jumlahPemakaian);
    }

    public void setKandungan(String newValue) {
        kandungan = newValue;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Kandungan: " + kandungan);
    }
}