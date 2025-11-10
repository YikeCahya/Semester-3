public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        strength -= 10; // Asumsi dikurangi 10 setiap kali dihancurkan
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength;
    }
}
