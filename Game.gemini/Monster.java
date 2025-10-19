//package game;

import java.util.Random;

/**
 * [cite_start]Class untuk musuh standar. [cite: 17, 109]
 */
public class Monster extends Enemy {
    private final Random random = new Random();

    [cite_start]public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) { [cite: 110]
        [cite_start]super(name, hp, ap, threatLevel, strategy); [cite: 112]
    }

    @Override
    [cite_start]public void attack(Character target) { [cite: 114]
        [cite_start]// Random damage antara 80% - 120% dari damage dasar [cite: 17]
        double multiplier = 0.8 + (1.2 - 0.8) * random.nextDouble();
        int baseDamage = strategy.computeDamage(this, target);
        int finalDamage = (int) (baseDamage * multiplier);
        
        System.out.printf("%s attacks %s for %d damage!%n", getName(), target.getName(), finalDamage);
        target.takeDamage(finalDamage);
    }
}