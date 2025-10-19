//package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * [cite_start]Class untuk karakter yang dikendalikan pemain. [cite: 92]
 */
public class Player extends Character {
    [cite_start]private int level; [cite: 93]
    [cite_start]private AttackStrategy strategy; [cite: 94]
    [cite_start]private final List<Skill> skills = new ArrayList<>(); [cite: 95]

    [cite_start]public Player(String name, int hp, int ap, int level, AttackStrategy strategy) { [cite: 96]
        [cite_start]super(name, hp, ap); [cite: 99]
        if (level < 1) throw new IllegalArgumentException("Level must be at least 1.");
        if (strategy == null) throw new IllegalArgumentException("Strategy cannot be null.");
        this.level = level;
        this.strategy = strategy;
    }

    public int getLevel() { return level; }
    
    [cite_start]public void addSkill(Skill s) { [cite: 101]
        if (s != null) {
            skills.add(s);
        }
    }
    
    public List<Skill> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    @Override
    [cite_start]public void attack(Character target) { [cite: 103]
        // Cek jika ada skill Heal dan HP < 50%
        Optional<Skill> healSkill = skills.stream()
            .filter(s -> s instanceof HealSkill && getHealth() < getMaxHealth() * 0.5)
            .findFirst();

        if (healSkill.isPresent()) {
            healSkill.get().apply(this, null);
        }

        [cite_start]// Cek skill PiercingStrike [cite: 25]
        Optional<Skill> piercingSkill = skills.stream()
            .filter(s -> s instanceof PiercingStrike)
            .findFirst();

        int damage;
        String attackType;

        if (piercingSkill.isPresent()) {
            damage = (int) (strategy.computeDamage(this, target) * 1.2); [cite_start]// Sesuai contoh [cite: 177]
            attackType = " (using " + piercingSkill.get().name() + ")";
        } else {
            damage = strategy.computeDamage(this, target);
            attackType = "";
        }

        System.out.printf("%s attacks %s%s for %d damage!%n", getName(), target.getName(), attackType, damage);
        target.takeDamage(damage);
    }
}