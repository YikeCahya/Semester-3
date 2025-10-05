class Segitiga extends BangunDatar {
    float alas;
    float tinggi;

    public Segitiga(float a, float t) {
        this.alas = a;
        this.tinggi = t;
    }

    @Override
    float luas() {
        return 0.5f * alas * tinggi;
    }
    @Override
    float keliling() {
        // Asumsi segitiga sama sisi untuk perhitungan keliling
        return 3 * alas;
    }

    void infoS() {
        System.out.println("Segitiga dengan alas: " + alas + " dan tinggi: " + tinggi);
        super.info();
    }
}
