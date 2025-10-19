//package game;

public class PiercingStrike implements Skill {
    private double multiplier;

    public PiercingStrike(double multiplier) {
        if (multiplier < 0) {
            throw new IllegalArgumentException("Multiplier tidak boleh negatif");
        }
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return "PiercingStrike(x" + multiplier + ")";
    }

    @Override
    public void apply(Character self, Character target) {
        // Calculate base damage
        int baseDamage = self.getAttackPower();
        
        // Apply multiplier
        int totalDamage = (int) (baseDamage * multiplier);
        
        // Piercing strike bypasses 25% of damage reduction
        int oldHealth = target.getHealth();
        
        // Calculate normal reduced damage
        int normalReducedDamage = target.onIncomingDamage(totalDamage);
        
        // Calculate how much was reduced
        int reduction = totalDamage - normalReducedDamage;
        
        // Bypass 25% of the reduction
        int bypassAmount = (int) (reduction * 0.25);
        
        // Final damage is reduced damage + bypassed amount
        int finalDamage = normalReducedDamage + bypassAmount;
        
        target.setHealth(target.getHealth() - finalDamage);
        
        System.out.println("[Team A] " + self.getName() + " -> " + target.getName() + 
                         " (" + name() + "): " + finalDamage + " dmg");
        System.out.println(target.getName() + " HP: " + oldHealth + " -> " + target.getHealth());
    }
}