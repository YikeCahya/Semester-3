//package game;

public class BossMonster extends Enemy {
    private int turnCounter = 0;

    public BossMonster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        turnCounter++;
        
        boolean isRageStrike = false;
        String rageReason = "";
        
        // Check for Rage Strike conditions
        if (getHealth() < getMaxHealth() * 0.5) {
            isRageStrike = true;
            rageReason = "HP<50%";
        } else if (turnCounter % 3 == 0) {
            isRageStrike = true;
            rageReason = "3rd turn";
        }
        
        int baseDamage = strategy.computeDamage(this, target);
        int damage = isRageStrike ? (int) (baseDamage * 2.0) : baseDamage;
        
        int oldHealth = target.getHealth();
        int actualDamage = target.onIncomingDamage(damage);
        target.takeDamage(damage);
        
        if (isRageStrike) {
            if (actualDamage < damage) {
                System.out.println("[Team B] " + getName() + " -> " + target.getName() + 
                                 " (RAGE STRIKE x2 by " + rageReason + ": " + damage + 
                                 ", reduced to " + actualDamage + "): " + actualDamage + " dmg");
            } else {
                System.out.println("[Team B] " + getName() + " -> " + target.getName() + 
                                 " (RAGE STRIKE x2 by " + rageReason + "): " + damage + " dmg");
            }
        } else {
            System.out.println("[Team B] " + getName() + " -> " + target.getName() + 
                             " (Normal): " + actualDamage + " dmg");
        }
        System.out.println(target.getName() + " HP: " + oldHealth + " -> " + target.getHealth());
    }
}