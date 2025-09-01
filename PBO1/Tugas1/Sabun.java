public class Sabun {
    protected String merek;
    protected int jumlahPemakaian; 

    public Sabun(String merek) {
        this.merek = merek;
        this.jumlahPemakaian = 0;
    }

    public void gunakan() {
        jumlahPemakaian++;
        System.out.println("Menggunakan sabun " + merek + ". Total pemakaian: " + jumlahPemakaian);
    }

    public void simpan() {
        System.out.println("Menyimpan sabun " + merek + " di tempat yang tepat.");
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Total pemakaian: " + jumlahPemakaian);
    }
}