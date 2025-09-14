public class TestLingkaran {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran1 = new Lingkaran();
        
        // Mengisi nilai jari-jari
        lingkaran1.r = 7.0;
        
        // Menampilkan hasil perhitungan
        System.out.println("=== Lingkaran 1 ===");
        System.out.println("Jari-jari: " + lingkaran1.r);
        System.out.println("Luas: " + lingkaran1.hitungLuas());
        System.out.println("Keliling: " + lingkaran1.hitungKeliling());
        
        // Contoh lingkaran kedua
        Lingkaran lingkaran2 = new Lingkaran();
        lingkaran2.r = 10.0;
        
        System.out.println("\n=== Lingkaran 2 ===");
        System.out.println("Jari-jari: " + lingkaran2.r);
        System.out.println("Luas: " + lingkaran2.hitungLuas());
        System.out.println("Keliling: " + lingkaran2.hitungKeliling());
    }
}