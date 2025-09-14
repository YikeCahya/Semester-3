class Nilai {
    private String nimMahasiswa;
    private String kodeMataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;
    private double nilaiAkhir;
    private String nilaiHuruf;
    
    // Constructor
    public Nilai() {
        this.nimMahasiswa = "";
        this.kodeMataKuliah = "";
        this.nilaiTugas = 0.0;
        this.nilaiUts = 0.0;
        this.nilaiUas = 0.0;
        this.nilaiAkhir = 0.0;
        this.nilaiHuruf = "";
    }
    
    public Nilai(String nimMahasiswa, String kodeMataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.nimMahasiswa = nimMahasiswa;
        this.kodeMataKuliah = kodeMataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        hitungNilaiAkhir();
        konversiNilaiHuruf();
    }
    
    // Getter methods
    public String getNimMahasiswa() { return nimMahasiswa; }
    public String getKodeMataKuliah() { return kodeMataKuliah; }
    public double getNilaiTugas() { return nilaiTugas; }
    public double getNilaiUts() { return nilaiUts; }
    public double getNilaiUas() { return nilaiUas; }
    public double getNilaiAkhir() { return nilaiAkhir; }
    public String getNilaiHuruf() { return nilaiHuruf; }
    
    // Setter methods dengan validasi
    public void setNimMahasiswa(String nimMahasiswa) {
        if (nimMahasiswa != null && !nimMahasiswa.trim().isEmpty()) {
            this.nimMahasiswa = nimMahasiswa;
        }
    }
    
    public void setKodeMataKuliah(String kodeMataKuliah) {
        if (kodeMataKuliah != null && !kodeMataKuliah.trim().isEmpty()) {
            this.kodeMataKuliah = kodeMataKuliah;
        }
    }
    
    public void setNilaiTugas(double nilaiTugas) {
        if (nilaiTugas >= 0 && nilaiTugas <= 100) {
            this.nilaiTugas = nilaiTugas;
            hitungNilaiAkhir();
            konversiNilaiHuruf();
        }
    }
    
    public void setNilaiUts(double nilaiUts) {
        if (nilaiUts >= 0 && nilaiUts <= 100) {
            this.nilaiUts = nilaiUts;
            hitungNilaiAkhir();
            konversiNilaiHuruf();
        }
    }
    
    public void setNilaiUas(double nilaiUas) {
        if (nilaiUas >= 0 && nilaiUas <= 100) {
            this.nilaiUas = nilaiUas;
            hitungNilaiAkhir();
            konversiNilaiHuruf();
        }
    }
    
    // Method private untuk kalkulasi internal
    private void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUts * 0.3) + (nilaiUas * 0.4);
    }
    
    private void konversiNilaiHuruf() {
        if (nilaiAkhir >= 85) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 55) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 40) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
    }
    
    public void tampilNilai() {
        System.out.println("=== NILAI MAHASISWA ===");
        System.out.println("NIM: " + nimMahasiswa);
        System.out.println("Kode Mata Kuliah: " + kodeMataKuliah);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUts);
        System.out.println("Nilai UAS: " + nilaiUas);
        System.out.println("Nilai Akhir: " + String.format("%.2f", nilaiAkhir));
        System.out.println("Nilai Huruf: " + nilaiHuruf);
    }
}
