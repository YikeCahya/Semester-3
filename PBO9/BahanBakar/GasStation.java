class GasStation {
    // Metode isiBahanBakar tanpa parameter bayar
    public void isiBahanBakar(MobilMewah mw) {
        System.out.println("Mobil mewah telah diisi dengan Pertamax!");
    }
    
    public void isiBahanBakar(MobilKuno mk) {
        System.out.println("Mobil kuno telah diisi dengan Pertalite!");
    }
    
    // Overloading: Metode isiBahanBakar dengan parameter bayar
    public void isiBahanBakar(MobilMewah mw, double bayar) {
        double hargaPerLiter = 10000;
        double liter = bayar / hargaPerLiter;
        System.out.println("Mobil mewah diisi pertamax sebanyak " + liter + " liter");
    }
    
    public void isiBahanBakar(MobilKuno mk, double bayar) {
        double hargaPerLiter = 5000;
        double liter = bayar / hargaPerLiter;
        System.out.println("mobil tua diisi pertalite sebanyak " + liter + " liter");
    }
}