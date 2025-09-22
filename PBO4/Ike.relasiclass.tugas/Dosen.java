public class Dosen {
    private String nip;
    private String namaDosen;

    public Dosen(String nip, String namaDosen) {
        this.nip = nip;
        this.namaDosen = namaDosen;
    }

    public String getNip() {
        return nip;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public String info() {
        String info = "";
        info += "NIP Dosen: " + this.nip + "\n";
        info += "Nama Dosen: " + this.namaDosen + "\n";
        return info;
    }
}
