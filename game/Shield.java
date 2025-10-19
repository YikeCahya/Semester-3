//package game;

public class Shield implements StatusEffect {
    private int flatReduce;
    private int duration;
    private int remainingTurns;

    public Shield(int flatReduce, int duration) {
        if (flatReduce < 0) {
            throw new IllegalArgumentException("Shield reduction tidak boleh negatif");
        }
        if (duration < 1) {
            throw new IllegalArgumentException("Duration harus minimal 1");
        }
        
        this.flatReduce = flatReduce;
        this.duration = duration;
        this.remainingTurns = duration;
    }

    public int reduceDamage(int damage) {
        if (remainingTurns > 0) {
            return Math.max(0, damage - flatReduce);
        }
        return damage;
    }

    @Override
    public void onTurnStart(Character self) {
        if (remainingTurns > 0) {
            System.out.println("[Start Effects] " + self.getName() + 
                             ": Shield(active, -" + flatReduce + " dmg, " + 
                             remainingTurns + " turns)");
        }
    }

    @Override
    public void onTurnEnd(Character self) {
        if (remainingTurns > 0) {
            remainingTurns--;
            if (remainingTurns > 0) {
                System.out.println("[End Effects] " + self.getName() + 
                                 " Shield remaining: " + remainingTurns + " turns");
            } else {
                System.out.println("[End Effects] " + self.getName() + " Shield EXPIRES");
            }
        }
    }

    @Override
    public boolean isExpired() {
        return remainingTurns <= 0;
    }

    @Override
    public String name() {
        return "Shield(-" + flatReduce + " dmg, " + remainingTurns + " turns)";
    }
}