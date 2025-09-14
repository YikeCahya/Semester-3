class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;
    
    // Constructor untuk inisialisasi object
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.alamat = "";
        this.jurusan = "";
    }
    
    // Constructor dengan parameter
    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    
    // Getter methods untuk mengakses atribut private
    public String getNim() {
        return nim;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    // Setter methods untuk mengubah nilai atribut private
    public void setNim(String nim) {
        if (nim != null && !nim.trim().isEmpty()) {
            this.nim = nim;
        }
    }
    
    public void setNama(String nama) {
        if (nama != null && !nama.trim().isEmpty()) {
            this.nama = nama;
        }
    }
    
    public void setAlamat(String alamat) {
        if (alamat != null && !alamat.trim().isEmpty()) {
            this.alamat = alamat;
        }
    }
    
    public void setJurusan(String jurusan) {
        if (jurusan != null && !jurusan.trim().isEmpty()) {
            this.jurusan = jurusan;
        }
    }
    
    // Method untuk menampilkan biodata mahasiswa
    public void tampilBiodata() {
        System.out.println("=== BIODATA MAHASISWA ===");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }
}
