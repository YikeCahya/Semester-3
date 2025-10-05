class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    void bersuara() {
        System.out.println("Guk!");
    }
    void menggonggong() {
        System.out.println("Guk...guuk!");
    }
}
