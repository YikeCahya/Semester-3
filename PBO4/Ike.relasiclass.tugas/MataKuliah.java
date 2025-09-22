public class MataKuliah {
    private String kodeMk;
    private String namaMk;
    private int sks;

    public MataKuliah(String kodeMk, String namaMk, int sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }

    public String getKodeMk() {
        return kodeMk;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public int getSks() {
        return sks;
    }

    public String info() {
        String info = "";
        info += "Kode MK: " + this.kodeMk + "\n";
        info += "Nama MK: " + this.namaMk + "\n";
        info += "SKS: " + this.sks + "\n";
        return info;
    }
}
