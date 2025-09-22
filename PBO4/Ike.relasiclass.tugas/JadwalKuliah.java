public class JadwalKuliah {
    private String idJadwal;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private RuangKelas ruangKelas;
    private Hari hari;
    private SesiWaktu sesiWaktu;

    public JadwalKuliah(String idJadwal, MataKuliah mataKuliah, Dosen dosen, RuangKelas ruangKelas, Hari hari, SesiWaktu sesiWaktu) {
        this.idJadwal = idJadwal;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.ruangKelas = ruangKelas;
        this.hari = hari;
        this.sesiWaktu = sesiWaktu;
    }

    public String getIdJadwal() {
        return idJadwal;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public RuangKelas getRuangKelas() {
        return ruangKelas;
    }

    public Hari getHari() {
        return hari;
    }

    public SesiWaktu getSesiWaktu() {
        return sesiWaktu;
    }

    public String info() {
        String info = "";
        info += "ID Jadwal: " + this.idJadwal + "\n";
        info += "--- Informasi Mata Kuliah ---\n";
        info += this.mataKuliah.info();
        info += "--- Informasi Dosen ---\n";
        info += this.dosen.info();
        info += "--- Informasi Ruang Kelas ---\n";
        info += this.ruangKelas.info();
        info += "--- Waktu Perkuliahan ---\n";
        info += this.hari.info();
        info += this.sesiWaktu.info();
        return info;
    }
}
