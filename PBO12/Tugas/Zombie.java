public abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public abstract void heal(); 

    public String getZombieInfo() {
        return "Health = " + this.health + "\n" +
               "Level = " + this.level;
    }
}
