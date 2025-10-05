class PersegiPanjang extends BangunDatar {
    float panjang;
    float lebar;

    public PersegiPanjang(float p, float l) {
        this.panjang = p;
        this.lebar = l;
    }

    @Override
    float luas() {
        return panjang * lebar;
    }

    float keliling() {
        return 2 * (panjang + lebar);
    }

    void infoPP() {
        System.out.println("Persegi Panjang dengan panjang: " + panjang + " dan lebar: " + lebar);
        super.info();
    }
}
