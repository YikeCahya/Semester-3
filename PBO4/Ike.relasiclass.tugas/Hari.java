public class Hari {
    private String namaHari;

    public Hari(String namaHari) {
        this.namaHari = namaHari;
    }

    public String getNamaHari() {
        return namaHari;
    }

    public String info() {
        return "Hari: " + this.namaHari + "\n";
    }
}