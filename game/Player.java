//package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player extends Character {
    private int level;
    private AttackStrategy strategy;
    private final List<Skill> skills = new ArrayList<>();
    private Random random = new Random();

    public Player(String name, int hp, int ap, int level, AttackStrategy strategy) {
        super(name, hp, ap);
        
        if (level < 1) {
            throw new IllegalArgumentException("Level harus minimal 1");
        }
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy tidak boleh null");
        }
        
        this.level = level;
        this.strategy = strategy;
    }

    public void addSkill(Skill s) {
        if (s != null) {
            skills.add(s);
        }
    }

    public int getLevel() {
        return level;
    }

    public List<Skill> getSkills() {
        return new ArrayList<>(skills);
    }

    @Override
    public void attack(Character target) {
        // Check if need healing (HP < 40% of max)
        boolean needHealing = getHealth() < (maxHealth * 0.4);
        
        if (needHealing) {
            // Try to find HealSkill
            for (Skill skill : skills) {
                if (skill instanceof HealSkill) {
                    skill.apply(this, this); // Heal self
                    // After healing, still attack normally
                    break;
                }
            }
        }
        
        // Check for PiercingStrike skill
        List<Skill> piercingStrikes = new ArrayList<>();
        for (Skill skill : skills) {
            if (skill instanceof PiercingStrike) {
                piercingStrikes.add(skill);
            }
        }

        // Use PiercingStrike randomly if available (sekitar 40% chance)
        if (!piercingStrikes.isEmpty() && random.nextInt(100) < 40) {
            Skill piercingStrike = piercingStrikes.get(random.nextInt(piercingStrikes.size()));
            piercingStrike.apply(this, target);
        } else {
            // Normal attack using strategy
            int oldHealth = target.getHealth();
            int damage = strategy.computeDamage(this, target);
            target.takeDamage(damage);
            System.out.println("[Team A] " + getName() + " -> " + target.getName() + 
                             " (Normal Strategy): " + damage + " dmg");
            System.out.println(target.getName() + " HP: " + oldHealth + " -> " + target.getHealth());
        }
    }
    
    public AttackStrategy getStrategy() {
        return strategy;
    }
}