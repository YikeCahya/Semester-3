public class Peminjaman {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;
    
    public void tampilDataPeminjaman() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
        System.out.println("Harga per hari: " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Total Bayar: " + hitungHargaBayar());
    }
    
    public int hitungHargaBayar() {
        return lamaSewa * harga;
    }
}
