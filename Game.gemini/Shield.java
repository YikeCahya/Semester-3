//package game;

/**
 * [cite_start]Efek yang mengurangi damage yang diterima. [cite: 28, 172]
 */
public class Shield implements StatusEffect {
    private final int flatReduce;
    private int duration;

    public Shield(int flatReduce, int duration) {
        this.flatReduce = flatReduce;
        this.duration = duration;
    }

    @Override
    public void onTurnStart(Character self) {
        // Tidak ada aksi di awal giliran
    }

    @Override
    public void onTurnEnd(Character self) {
        if (!isExpired()) {
            duration--;
        }
    }
    
    public int reduceDamage(int damage) {
        if (!isExpired()) {
            return Math.max(0, damage - flatReduce);
        }
        return damage;
    }

    @Override
    public boolean isExpired() {
        return duration <= 0;
    }
    
    @Override
    public String getDescription() {
        if (isExpired()) return "Shield(EXPIRED)";
        return String.format("Shield(-%d dmg, %d turns left)", flatReduce, duration);
    }
}