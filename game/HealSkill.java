//package game;

public class HealSkill implements Skill {
    private int amount;

    public HealSkill(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Heal amount tidak boleh negatif");
        }
        this.amount = amount;
    }

    @Override
    public String name() {
        return "HealSkill(+" + amount + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        int oldHealth = self.getHealth();
        int newHealth = Math.min(oldHealth + amount, self.getMaxHealth());
        self.setHealth(newHealth);
        
        System.out.println("[Team A] " + self.getName() + " uses " + name() + 
                         ": " + oldHealth + " -> " + newHealth);
    }
}