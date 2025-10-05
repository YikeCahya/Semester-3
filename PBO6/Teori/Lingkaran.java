class Lingkaran extends BangunDatar {
    float r;

    public Lingkaran(float r) {
        this.r = r;
    }

    @Override
    float luas() {
        return (float) (Math.PI * r * r);
    }
    float keliling() {
        return (float) (2 * Math.PI * r);
    }

    void infoL() {
        System.out.println("Lingkaran dengan jari-jari: " + r);
        super.info();
    }
}
