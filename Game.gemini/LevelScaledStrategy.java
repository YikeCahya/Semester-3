//package game;

/**
 * [cite_start]Strategi serangan yang damage-nya diskalakan berdasarkan level. [cite: 32, 162]
 */
public class LevelScaledStrategy implements AttackStrategy {
    private final int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        // Hanya Player yang punya level, untuk musuh bisa dianggap 0
        if (self instanceof Player) {
            Player player = (Player) self;
            return self.getAttackPower() + (player.getLevel() * bonusPerLevel);
        }
        return self.getAttackPower();
    }
}