public class MainTugas1 {
    public static void main(String[] args) {
        // Jemuran
        Jemuran jemuran = new Jemuran("Aluminium", 10);
        jemuran.jemurPakaian(5);
        jemuran.ambilPakaian(2);
        jemuran.cetakInformasi();

        System.out.println();

        // Rak
        Rak rak = new Rak("Kayu", 20);
        rak.taruhBarang(8);
        rak.ambilBarang(3);
        rak.cetakInformasi();

        System.out.println();

        // Sabun Mandi
        SabunMandi sabunMandi = new SabunMandi("Purbasari", "Normal");
        sabunMandi.mandi();
        sabunMandi.simpan();
        sabunMandi.cetakInformasi();

        System.out.println();

        // Sabun Cuci Piring
        SabunCuciPiring sabunCuci = new SabunCuciPiring("Sunlight", "Lemon");
        sabunCuci.cuci(5);
        sabunCuci.simpan();
        sabunCuci.cetakInformasi();
    }
}