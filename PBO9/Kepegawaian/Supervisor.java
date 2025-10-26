class Supervisor extends Manager {
    public Supervisor(String nama, int gaji) {
        super(nama, gaji);
    }
    
    @Override
    public void naikkanGaji() {
        gaji += 1500000;
    }
}
