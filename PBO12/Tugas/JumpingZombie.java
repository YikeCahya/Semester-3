public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }
    @Override
    public void heal() {
        if (level == 1) {
            health += health * 0.30; // Tambah 30%
        } else if (level == 2) {
            health += health * 0.40; // Tambah 40%
        } else if (level == 3) {
            health += health * 0.50; // Tambah 50%
        }
    }
    @Override
    public void destroyed() {
        health -= health * 0.01; // Kurang 1%
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" +
               super.getZombieInfo();
    }
}
