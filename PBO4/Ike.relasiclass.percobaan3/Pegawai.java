public class Pegawai {
    private String nip;
    private String nama;

    //Constructor berparameter
    public Pegawai(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    //Setter Getter
    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
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
        info += "\nNip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
