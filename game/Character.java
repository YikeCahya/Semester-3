//package game;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final String name;
    protected final int maxHealth;
    private int health;
    private final int attackPower;
    private final List<StatusEffect> effects = new ArrayList<>();

    protected Character(String name, int health, int attackPower) {
        if (health < 0) {
            throw new IllegalArgumentException("Health tidak boleh negatif");
        }
        if (attackPower < 0) {
            throw new IllegalArgumentException("Attack power tidak boleh negatif");
        }
        
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }

    public final String getName() {
        return name;
    }

    public final int getAttackPower() {
        return attackPower;
    }

    public final int getHealth() {
        return health;
    }

    public final int getMaxHealth() {
        return maxHealth;
    }

    protected final void setHealth(int value) {
        if (value < 0) {
            this.health = 0;
        } else if (value > maxHealth) {
            this.health = maxHealth;
        } else {
            this.health = value;
        }
    }

    protected int onIncomingDamage(int base) {
        int finalDamage = base;
        for (StatusEffect effect : effects) {
            if (effect instanceof Shield) {
                finalDamage = ((Shield) effect).reduceDamage(finalDamage);
            }
        }
        return finalDamage;
    }

    public final boolean isAlive() {
        return health > 0;
    }

    public final void takeDamage(int dmg) {
        int finalDamage = onIncomingDamage(dmg);
        setHealth(getHealth() - Math.max(0, finalDamage));
    }

    public final void addEffect(StatusEffect e) {
        if (e != null) {
            effects.add(e);
        }
    }

    public final void performTurn(Character target) {
        if (!isAlive()) {
            return;
        }

        // Process turn start effects
        for (StatusEffect effect : new ArrayList<>(effects)) {
            if (!effect.isExpired()) {
                effect.onTurnStart(this);
            }
        }

        // Attack
        attack(target);

        // Process turn end effects and collect expired ones
        List<StatusEffect> expiredEffects = new ArrayList<>();
        for (StatusEffect effect : new ArrayList<>(effects)) {
            if (!effect.isExpired()) {
                effect.onTurnEnd(this);
            }
            if (effect.isExpired()) {
                expiredEffects.add(effect);
            }
        }

        // Remove expired effects
        effects.removeAll(expiredEffects);
    }

    public final List<StatusEffect> getEffects() {
        return new ArrayList<>(effects);
    }

    public abstract void attack(Character target);
}