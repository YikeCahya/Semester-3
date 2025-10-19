//package game;

/**
 * [cite_start]Skill untuk memulihkan HP. [cite: 22, 163]
 */
public class HealSkill implements Skill {
    private final int amount;

    public HealSkill(int amount) {
        this.amount = amount;
    }

    @Override
    public String name() {
        return "HealSkill(+" + amount + " HP)";
    }

    @Override
    public void apply(Character self, Character target) {
        System.out.printf("  [SKILL] %s uses %s!%n", self.getName(), this.name());
        self.heal(amount);
    }
}