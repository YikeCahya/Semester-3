//package game;

/**
 * [cite_start]Strategi serangan dengan damage tetap. [cite: 32]
 */
public class FixedStrategy implements AttackStrategy {
    private final int damage;

    public FixedStrategy(int damage) {
        this.damage = damage;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        return this.damage;
    }
}