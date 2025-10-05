class Anjing extends Mamalia {
    String ras;

    public Anjing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    void bersuara() {
        System.out.println("Guk guk!");
    }
}
