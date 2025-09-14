public class TestBarang {
    public static void main(String[] args) {
        // Membuat objek barang
        Barang barang1 = new Barang();
        
        // Mengisi data barang
        barang1.kode = "B001";
        barang1.namaBarang = "Laptop ASUS";
        barang1.hargaDasar = 10000000;
        barang1.diskon = 15.0f;
        
        // Menampilkan data barang
        System.out.println("=== Data Barang 1 ===");
        barang1.tampilData();
        
        // Contoh barang kedua
        Barang barang2 = new Barang();
        barang2.kode = "B002";
        barang2.namaBarang = "Mouse Logitech";
        barang2.hargaDasar = 250000;
        barang2.diskon = 10.0f;
        
        System.out.println("\n=== Data Barang 2 ===");
        barang2.tampilData();
        
        // Contoh barang ketiga
        Barang barang3 = new Barang();
        barang3.kode = "B003";
        barang3.namaBarang = "Keyboard Mechanical";
        barang3.hargaDasar = 500000;
        barang3.diskon = 20.0f;
        
        System.out.println("\n=== Data Barang 3 ===");
        barang3.tampilData();
    }
}
