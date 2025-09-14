class Persegi {
    private int sisi; 
    
    // Constructor default
    public Persegi() {
        this.sisi = 0;
    }
    
    // Constructor dengan parameter
    public Persegi(int sisi) {
        setSisi(sisi); // menggunakan setter untuk validasi
    }
    
    // Getter method
    public int getSisi() {
        return sisi;
    }
    
    // Setter method dengan validasi
    public void setSisi(int sisi) {
        if (sisi > 0) {
            this.sisi = sisi;
        } else {
            System.out.println("Sisi harus lebih besar dari 0!");
        }
    }
    
    // Method untuk menampilkan data persegi
    public void dataPersegi() {
        System.out.println("=== DATA PERSEGI ===");
        System.out.println("Panjang sisi: " + sisi + " cm");
    }
    
    // Method untuk menghitung luas persegi
    public int luasPersegi() {
        return sisi * sisi;
    }
    
    // Method untuk menghitung keliling persegi
    public int kelilingPersegi() {
        return 4 * sisi;
    }
}