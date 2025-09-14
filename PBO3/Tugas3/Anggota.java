public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;
    
    // Konstruktor
    public Anggota(String noKTP, String nama, int limitPinjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; // Inisialisasi jumlah pinjaman = 0
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }
    
    // Getter untuk limit pinjaman
    public int getLimitPinjaman() {
        return limitPinjaman;
    }
    
    // Getter untuk jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }
    
    // Method untuk meminjam uang
    public void pinjam(int nominal) {
        // Cek apakah nominal pinjaman tidak melebihi batas limit
        if (jumlahPinjaman + nominal <= limitPinjaman) {
            jumlahPinjaman += nominal;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
    }
    
    // Method untuk mengangsur pinjaman
    public void angsur(int nominal) {

        if (jumlahPinjaman == 0) {
            System.out.println("Tidak ada pinjaman yang harus diangsur.");
            return;
        }
        
        // minimal angsuran 10% dari jumlah pinjaman saat ini
        double minimalAngsuran = jumlahPinjaman * 0.1;
        
        if (nominal < minimalAngsuran) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            return;
        }

        jumlahPinjaman -= nominal;
        
        if (jumlahPinjaman < 0) {
            jumlahPinjaman = 0;
        }
    }
}
