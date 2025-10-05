class Kucing extends Hewan {
    String ras;
    
    public Kucing(String nama, int umur, String ras) {
        super(nama, umur); //Memanggil konstruktor superclass (Hewan)
        this.ras = ras;
        System.out.println("Konstruktor Kucing dipanggil");
    }
}
