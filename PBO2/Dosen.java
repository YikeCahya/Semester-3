class Dosen {
    private String nip;
    private String nama;
    private String alamat;
    private String bidangKeahlian;
    
    // Constructor
    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.alamat = "";
        this.bidangKeahlian = "";
    }
    
    public Dosen(String nip, String nama, String alamat, String bidangKeahlian) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    public String getNip() { return nip; }
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getBidangKeahlian() { return bidangKeahlian; }
    
    public void setNip(String nip) {
        if (nip != null && !nip.trim().isEmpty()) {
            this.nip = nip;
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
    
    public void setBidangKeahlian(String bidangKeahlian) {
        if (bidangKeahlian != null && !bidangKeahlian.trim().isEmpty()) {
            this.bidangKeahlian = bidangKeahlian;
        }
    }
    
    public void tampilBiodata() {
        System.out.println("=== BIODATA DOSEN ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }
    
    public void inputNilai() {
        System.out.println("Dosen " + nama + " sedang menginput nilai...");
    }
}
