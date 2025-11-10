public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }
    @Override
    public void heal() {
        if (level == 1) {
            health += health * 0.10; // Tambah 10%
        } else if (level == 2) {
            health += health * 0.30; // Tambah 30%
        } else if (level == 3) {
            health += health * 0.40; // Tambah 40%
        }
    }
    @Override
    public void destroyed() {
        health -= health * 0.02; // Kurang 2%
    }
    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" +
               super.getZombieInfo();
    }
}
