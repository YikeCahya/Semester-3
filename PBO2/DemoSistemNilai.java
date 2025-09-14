class DemoSistemNilai {
    public static void main(String[] args) {
        try {
            System.out.println("=== SISTEM INFORMASI NILAI ===");
            System.out.println();
            
            // Membuat object menggunakan constructor dengan parameter
            Mahasiswa mhs1 = new Mahasiswa("2441720001", "Aure Pratama", "Malang", "Teknologi Informasi");
            
            Dosen dosen1 = new Dosen("198501012010011001", "Dr. Budi Santoso", "Malang", "Pemrograman");
            
            MataKuliah mk1 = new MataKuliah("TI001", "Pemrograman Berorientasi Objek", 3, "3");
            
            Nilai nilai1 = new Nilai(mhs1.getNim(), mk1.getKodeMataKuliah(), 85.0, 78.0, 88.0);
            
            // Menampilkan semua data
            mhs1.tampilBiodata();
            System.out.println();
            
            dosen1.tampilBiodata();
            System.out.println();
            
            mk1.tampilInfoMataKuliah();
            System.out.println();
            
            nilai1.tampilNilai();
            System.out.println();
            
            dosen1.inputNilai();
            
            System.out.println();
            System.out.println("=== DEMO VALIDASI SETTER ===");
            Mahasiswa mhs2 = new Mahasiswa();
            mhs2.setNim("2341720002");
            mhs2.setNama("Budi Setiawan");
            mhs2.setJurusan("Sistem Informasi");
            
            System.out.println("Mahasiswa baru:");
            mhs2.tampilBiodata();
            
            // Validasi nilai
            System.out.println();
            System.out.println("=== DEMO VALIDASI NILAI ===");
            Nilai nilai2 = new Nilai();
            nilai2.setNimMahasiswa(mhs2.getNim());
            nilai2.setKodeMataKuliah("TI002");
            nilai2.setNilaiTugas(90.0);
            nilai2.setNilaiUts(85.0);
            nilai2.setNilaiUas(95.0);
            
            nilai2.tampilNilai();
            
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}