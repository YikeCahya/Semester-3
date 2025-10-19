//package game;

import java.util.Random;

public class Monster extends Enemy {
    private Random random = new Random();

    public Monster(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) {
        super(name, hp, ap, threatLevel, strategy);
    }

    @Override
    public void attack(Character target) {
        int baseDamage = strategy.computeDamage(this, target);
        // Randomize damage ±20%
        double multiplier = 0.8 + (random.nextDouble() * 0.4);
        int damage = (int) (baseDamage * multiplier);
        
        int oldHealth = target.getHealth();
        int actualDamage = target.onIncomingDamage(damage);
        target.takeDamage(damage);
        
        if (actualDamage < damage) {
            System.out.println("[Team B] " + getName() + " -> " + target.getName() + 
                             " (Normal " + damage + ", reduced to " + actualDamage + "): " + actualDamage + " dmg");
        } else {
            System.out.println("[Team B] " + getName() + " -> " + target.getName() + 
                             " (Normal): " + actualDamage + " dmg");
        }
        System.out.println(target.getName() + " HP: " + oldHealth + " -> " + target.getHealth());
    }
}