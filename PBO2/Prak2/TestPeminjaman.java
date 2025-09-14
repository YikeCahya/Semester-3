public class TestPeminjaman {
    public static void main(String[] args) {
        // Membuat objek peminjaman
        Peminjaman pinjam1 = new Peminjaman();
        
        // Mengisi data peminjaman
        pinjam1.id = "P001";
        pinjam1.namaMember = "Ahmad Rizki";
        pinjam1.namaGame = "FIFA 2024";
        pinjam1.harga = 5000;
        pinjam1.lamaSewa = 3;
        
        // Menampilkan data peminjaman
        System.out.println("=== Data Peminjaman 1 ===");
        pinjam1.tampilDataPeminjaman();
        
        // Contoh peminjaman kedua
        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.id = "P002";
        pinjam2.namaMember = "Sari Wulan";
        pinjam2.namaGame = "Call of Duty";
        pinjam2.harga = 7000;
        pinjam2.lamaSewa = 2;
        
        System.out.println("\n=== Data Peminjaman 2 ===");
        pinjam2.tampilDataPeminjaman();
    }
}