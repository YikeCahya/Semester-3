public class SesiWaktu {
    private String waktuMulai;
    private String waktuSelesai;

    public SesiWaktu(String waktuMulai, String waktuSelesai) {
        this.waktuMulai = waktuMulai;
        this.waktuSelesai = waktuSelesai;
    }

    public String getWaktuMulai() {
        return waktuMulai;
    }

    public String getWaktuSelesai() {
        return waktuSelesai;
    }

    public String info() {
        return "Waktu: " + this.waktuMulai + " - " + this.waktuSelesai + "\n";
    }
}
