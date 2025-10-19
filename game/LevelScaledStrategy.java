//package game;

public class LevelScaledStrategy implements AttackStrategy {
    private int bonusPerLevel;

    public LevelScaledStrategy(int bonusPerLevel) {
        this.bonusPerLevel = bonusPerLevel;
    }

    @Override
    public int computeDamage(Character self, Character target) {
        int baseDamage = self.getAttackPower();
        
        if (self instanceof Player) {
            Player player = (Player) self;
            return baseDamage + (player.getLevel() * bonusPerLevel);
        }
        
        return baseDamage;
    }
    
    @Override
    public String toString() {
        return "LevelScaled(+" + bonusPerLevel + "/level)";
    }
}