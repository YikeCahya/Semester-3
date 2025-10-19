//package game;

public class Regen implements StatusEffect {
    private int perTurn;
    private int duration;
    private int remainingTurns;

    public Regen(int perTurn, int duration) {
        if (perTurn < 0) {
            throw new IllegalArgumentException("Regen per turn tidak boleh negatif");
        }
        if (duration < 1) {
            throw new IllegalArgumentException("Duration harus minimal 1");
        }
        
        this.perTurn = perTurn;
        this.duration = duration;
        this.remainingTurns = duration;
    }

    @Override
    public void onTurnStart(Character self) {
        
    }

    @Override
    public void onTurnEnd(Character self) {
        if (remainingTurns > 0) {
            int oldHealth = self.getHealth();
            int newHealth = Math.min(oldHealth + perTurn, self.getMaxHealth());
            self.setHealth(newHealth);
            
            remainingTurns--;
            
            System.out.println("[End Effects] " + self.getName() + " Regen: +" + 
                             perTurn + " HP => " + newHealth + 
                             (remainingTurns > 0 ? " (remaining: " + remainingTurns + " turns)" : " (EXPIRES)"));
        }
    }

    @Override
    public boolean isExpired() {
        return remainingTurns <= 0;
    }

    @Override
    public String name() {
        return "Regen(+" + perTurn + " HP, " + remainingTurns + " turns)";
    }
}