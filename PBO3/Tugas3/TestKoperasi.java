import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("=== SISTEM KOPERASI SIMPAN PINJAM ===");
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Pinjam Uang");
            System.out.println("2. Angsur Pinjaman");
            System.out.println("3. Lihat Status Pinjaman");
            System.out.println("0. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman: ");
                    int jumlahPinjam = input.nextInt();
                    System.out.println("\nMeminjam uang " + jumlahPinjam + "...");
                    donny.pinjam(jumlahPinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                    
                case 2:
                    if (donny.getJumlahPinjaman() > 0) {
                        double minAngsuran = donny.getJumlahPinjaman() * 0.1;
                        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                        System.out.println("Minimal angsuran (10%): " + (int)minAngsuran);
                        System.out.print("Masukkan jumlah angsuran: ");
                        int jumlahAngsur = input.nextInt();
                        System.out.println("\nMembayar angsuran " + jumlahAngsur);
                        donny.angsur(jumlahAngsur);
                        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    } else {
                        System.out.println("Tidak ada pinjaman yang harus diangsur.");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n=== STATUS PINJAMAN ===");
                    System.out.println("Nama Anggota: " + donny.getNama());
                    System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
                    System.out.println("Jumlah Pinjaman Saat Ini: " + donny.getJumlahPinjaman());
                    System.out.println("Sisa Limit: " + (donny.getLimitPinjaman() - donny.getJumlahPinjaman()));
                    break;
                    
                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem koperasi!");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while(pilihan != 0);
        
        input.close();
    }
}
