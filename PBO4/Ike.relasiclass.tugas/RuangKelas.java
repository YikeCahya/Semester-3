public class RuangKelas {
    private String namaRuang;
    private int kapasitas;

    public RuangKelas(String namaRuang, int kapasitas) {
        this.namaRuang = namaRuang;
        this.kapasitas = kapasitas;
    }

    public String getNamaRuang() {
        return namaRuang;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public String info() {
        String info = "";
        info += "Nama Ruang: " + this.namaRuang + "\n";
        info += "Kapasitas: " + this.kapasitas + " orang\n";
        return info;
    }
}
