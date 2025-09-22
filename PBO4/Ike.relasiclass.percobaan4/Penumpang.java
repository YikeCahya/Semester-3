public class Penumpang {
    private String ktp;
    private String nama;

    //Constructor berparameter
    public Penumpang(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    //Setter Getter
    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getKtp() {
        return ktp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    //Method info
    public String info() {
        String info = " ";
        info += "\nKtp: " + this.ktp + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
