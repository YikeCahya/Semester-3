public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10, 5);
        Lingkaran l = new Lingkaran(7);
        Segitiga s = new Segitiga(6, 3);

        pp.infoPP();
        System.out.println("------------------------");
        l.infoL();
        System.out.println("------------------------");
        s.infoS();
    }
}
