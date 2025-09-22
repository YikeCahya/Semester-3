public class MainTugas5 {
    public static void main(String[] args) {
        // 1. Membuat objek MataKuliah
        MataKuliah mk1 = new MataKuliah("SI001", "Dasar Pemrograman", 3);
        MataKuliah mk2 = new MataKuliah("BD002", "Basis Data Lanjut", 4);

        // 2. Membuat objek Dosen
        Dosen d1 = new Dosen("198001012005011001", "Budi Santoso");
        Dosen d2 = new Dosen("198505052010021005", "Siti Aminah");

        // 3. Membuat objek RuangKelas
        RuangKelas r1 = new RuangKelas("Lab RPL 1", 40);
        RuangKelas r2 = new RuangKelas("Kelas Teori A", 60);

        // 4. Membuat objek Hari
        Hari h1 = new Hari("Senin");
        Hari h2 = new Hari("Rabu");

        // 5. Membuat objek SesiWaktu
        SesiWaktu sw1 = new SesiWaktu("08:00", "10:00");
        SesiWaktu sw2 = new SesiWaktu("13:00", "15:00");

        // 6. Membuat objek JadwalKuliah
        JadwalKuliah jadwal1 = new JadwalKuliah("JDL001", mk1, d1, r1, h1, sw1);
        JadwalKuliah jadwal2 = new JadwalKuliah("JDL002", mk2, d2, r2, h2, sw2);
        JadwalKuliah jadwal3 = new JadwalKuliah("JDL003", mk1, d2, r2, h2, sw1); 

        // Menampilkan informasi jadwal
        System.out.println("--- Jadwal Kuliah 1 ---");
        System.out.println(jadwal1.info());

        System.out.println("--- Jadwal Kuliah 2 ---");
        System.out.println(jadwal2.info());

        System.out.println("--- Jadwal Kuliah 3 ---");
        System.out.println(jadwal3.info());

        // Contoh mengambil data spesifik dari objek JadwalKuliah
        System.out.println("Judul Mata Kuliah Jadwal 1: " + jadwal1.getMataKuliah().getNamaMk());
        System.out.println("Nama Dosen Jadwal 2: " + jadwal2.getDosen().getNamaDosen());
    }
}