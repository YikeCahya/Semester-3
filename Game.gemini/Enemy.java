//package game;

/**
 * [cite_start]Abstract class untuk semua musuh. [cite: 16, 79]
 */
public abstract class Enemy extends Character {
    [cite_start]private int threatLevel; [cite: 80]
    [cite_start]protected AttackStrategy strategy; [cite: 81]

    [cite_start]protected Enemy(String name, int hp, int ap, int threatLevel, AttackStrategy strategy) { [cite: 82]
        [cite_start]super(name, hp, ap); [cite: 85]
        [cite_start]if (threatLevel < 1 || threatLevel > 5) { [cite: 16]
            throw new IllegalArgumentException("Threat Level must be between 1 and 5.");
        }
        if (strategy == null) {
             throw new IllegalArgumentException("Strategy cannot be null.");
        }
        this.threatLevel = threatLevel;
        this.strategy = strategy;
    }

    public final int getThreatLevel() { return threatLevel; [cite_start]} [cite: 87]
    [cite_start]public final void setStrategy(AttackStrategy s) { [cite: 88]
        if (s != null) this.strategy = s;
    }
}