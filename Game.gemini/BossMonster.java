//package game;

/**
 * [cite_start]Class untuk musuh Boss yang lebih kuat. [cite: 18, 119]
 */
public class BossMonster extends Enemy {
    [cite_start]private int turnCounter = 0; [cite: 120]

    [cite_start]public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) { [cite: 121]
        [cite_start]super(name, hp, ap, threatLevel, strategy); [cite: 123]
    }

    @Override
    [cite_start]public void attack(Character target) { [cite: 125]
        turnCounter++;
        int baseDamage = strategy.computeDamage(this, target);
        String attackType = "";
        
        [cite_start]// Kondisi Rage Strike [cite: 18, 127]
        [cite_start]if (getHealth() < getMaxHealth() * 0.5 || turnCounter % 3 == 0) { [cite: 40]
            baseDamage *= 2;
            attackType = " (RAGE STRIKE)";
        }

        System.out.printf("%s attacks %s%s for %d damage!%n", getName(), target.getName(), attackType, baseDamage);
        target.takeDamage(baseDamage);
    }
}