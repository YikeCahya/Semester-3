//package game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [cite_start]Abstract class dasar untuk semua karakter di dalam game. [cite: 1, 10, 56]
 */
public abstract class Character {
    [cite_start]private final String name; [cite: 57]
    [cite_start]protected final int maxHealth; [cite: 58]
    [cite_start]private int health; [cite: 58]
    [cite_start]private final int attackPower; [cite: 59]
    [cite_start]private final List<StatusEffect> effects = new ArrayList<>(); [cite: 60]

    [cite_start]protected Character(String name, int health, int attackPower) { [cite: 61]
        [cite_start]if (health < 0 || attackPower < 0) { [cite: 11]
            throw new IllegalArgumentException("Health and Attack Power must be non-negative.");
        }
        this.name = name;
        this.maxHealth = health;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Getters
    public final String getName() { return name; [cite_start]} [cite: 64]
    public final int getAttackPower() { return attackPower; [cite_start]} [cite: 65]
    public final int getHealth() { return health; [cite_start]} [cite: 66]
    public final int getMaxHealth() { return maxHealth; }

    // Setters
    [cite_start]protected final void setHealth(int value) { [cite: 67]
        [cite_start]this.health = Math.max(0, Math.min(value, this.maxHealth)); [cite: 43]
    }

    [cite_start]public final void takeDamage(int damage) { [cite: 72]
        int finalDamage = onIncomingDamage(damage);
        setHealth(this.health - finalDamage);
        System.out.printf("  %s takes %d damage. HP: %d -> %d%n", name, finalDamage, health + finalDamage, health);
    }
    
    public final void heal(int amount) {
        int oldHealth = this.health;
        setHealth(this.health + amount);
        System.out.printf("  %s heals for %d HP. HP: %d -> %d%n", name, amount, oldHealth, this.health);
    }

    [cite_start]protected int onIncomingDamage(int baseDamage) { [cite: 68]
        int modifiedDamage = baseDamage;
        for (StatusEffect effect : effects) {
            if (effect instanceof Shield && !effect.isExpired()) {
                modifiedDamage = ((Shield) effect).reduceDamage(modifiedDamage);
            }
        }
        return modifiedDamage;
    }

    [cite_start]public final void addEffect(StatusEffect e) { [cite: 73]
        if (e != null) {
            effects.add(e);
        }
    }

    [cite_start]public final boolean isAlive() { [cite: 13, 71]
        return this.health > 0;
    }

    [cite_start]public final void performTurn(Character target) { [cite: 14]
        if (!isAlive()) return;

        // Panggil onTurnStart
        System.out.printf("  [EFFECTS START] %s: %s%n", name, getActiveEffectsDescription());
        effects.forEach(e -> e.onTurnStart(this));

        // Serang
        attack(target);

        // Panggil onTurnEnd dan hapus yang sudah expired
        effects.forEach(e -> e.onTurnEnd(this));
        System.out.printf("  [EFFECTS END] %s: %s%n", name, getActiveEffectsDescription());
        effects.removeIf(StatusEffect::isExpired);
    }

    public String getActiveEffectsDescription() {
        if (effects.isEmpty()) return "None";
        return effects.stream()
                .map(StatusEffect::getDescription)
                .collect(Collectors.joining(", "));
    }
    
    [cite_start]public abstract void attack(Character target); [cite: 12, 76]
}