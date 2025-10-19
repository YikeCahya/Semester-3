//package game;

/**
 * [cite_start]Efek yang memulihkan HP setiap akhir giliran. [cite: 28, 172]
 */
public class Regen implements StatusEffect {
    private final int healPerTurn;
    private int duration;

    public Regen(int healPerTurn, int duration) {
        this.healPerTurn = healPerTurn;
        this.duration = duration;
    }

    @Override
    public void onTurnStart(Character self) {
        // Tidak ada aksi di awal giliran
    }

    @Override
    public void onTurnEnd(Character self) {
        if (!isExpired()) {
            System.out.printf("  [EFFECT] %s's Regen restores +%d HP.%n", self.getName(), healPerTurn);
            self.heal(healPerTurn);
            duration--;
        }
    }
    
    @Override
    public boolean isExpired() {
        return duration <= 0;
    }

    @Override
    public String getDescription() {
        return String.format("Regen(+%d HP, %d turns left)", healPerTurn, duration);
    }
}