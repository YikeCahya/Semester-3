class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int sks;
    private String semester;
    
    // Constructor
    public MataKuliah() {
        this.kodeMataKuliah = "";
        this.namaMataKuliah = "";
        this.sks = 0;
        this.semester = "";
    }
    
    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks, String semester) {
        this.kodeMataKuliah = kodeMataKuliah;
        this.namaMataKuliah = namaMataKuliah;
        this.sks = sks;
        this.semester = semester;
    }
    
    // Getter methods
    public String getKodeMataKuliah() { return kodeMataKuliah; }
    public String getNamaMataKuliah() { return namaMataKuliah; }
    public int getSks() { return sks; }
    public String getSemester() { return semester; }
    
    // Setter methods dengan validasi
    public void setKodeMataKuliah(String kodeMataKuliah) {
        if (kodeMataKuliah != null && !kodeMataKuliah.trim().isEmpty()) {
            this.kodeMataKuliah = kodeMataKuliah;
        }
    }
    
    public void setNamaMataKuliah(String namaMataKuliah) {
        if (namaMataKuliah != null && !namaMataKuliah.trim().isEmpty()) {
            this.namaMataKuliah = namaMataKuliah;
        }
    }
    
    public void setSks(int sks) {
        if (sks > 0 && sks <= 6) {
            this.sks = sks;
        }
    }
    
    public void setSemester(String semester) {
        if (semester != null && !semester.trim().isEmpty()) {
            this.semester = semester;
        }
    }
    
    public void tampilInfoMataKuliah() {
        System.out.println("=== INFO MATA KULIAH ===");
        System.out.println("Kode: " + kodeMataKuliah);
        System.out.println("Nama: " + namaMataKuliah);
        System.out.println("SKS: " + sks);
        System.out.println("Semester: " + semester);
    }
}
