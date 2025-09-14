class TampilPersegi {
    public static void main(String[] args) {
        try {
            System.out.println("=== LATIHAN 3: CLASS PERSEGI ===");
            System.out.println();
            
            // Membuat object menggunakan constructor dengan parameter
            Persegi persegi1 = new Persegi(5);
            
            // Menampilkan data persegi
            persegi1.dataPersegi();
            
            // Menampilkan luas persegi
            System.out.println("Luas Persegi: " + persegi1.luasPersegi() + " cm^2");
            
            // Menampilkan keliling persegi
            System.out.println("Keliling Persegi: " + persegi1.kelilingPersegi() + " cm");
            
            System.out.println();
            
            // Demo menggunakan setter
            //System.out.println("=== MENGUBAH SISI MENGGUNAKAN SETTER ===");
            persegi1.setSisi(8);
            persegi1.dataPersegi();
            System.out.println("Luas Persegi: " + persegi1.luasPersegi() + " cm^2");
            System.out.println("Keliling Persegi: " + persegi1.kelilingPersegi() + " cm");
            
            // Demo validasi setter
            System.out.println();
            System.out.println("=== TEST VALIDASI ===");
            persegi1.setSisi(-3); // Akan menampilkan pesan error
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
