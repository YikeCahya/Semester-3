public class Player extends Character {
    private int level;
    private int maxHealth;
    private int healingPotions; // jumlah potion yang dimiliki
    private int manaPoints; // untuk magic healing
    private int maxMana;
    
    // Constructor
    public Player(String name, int health, int attackPower, int level) {
        super(name, health, attackPower);
        this.level = level;
        this.maxHealth = health;
        this.healingPotions = 3; // start dengan 3 potions
        this.manaPoints = 50 + (level * 10); // mana berdasarkan level
        this.maxMana = manaPoints;
    }
    
    // Getter dan setter untuk level
    public int getLevel() {
        return level;
    } 
    public void setLevel(int level) {
        this.level = level;
    }
    public int getMaxHealth() {
        return maxHealth; 
    }
    public int getHealingPotions() { 
        return healingPotions; 
    }
    public void setHealingPotions(int potions) { 
        this.healingPotions = potions; 
    }
    public int getManaPoints() { 
        return manaPoints; 
    }
    public void setManaPoints(int mana) { 
        this.manaPoints = Math.min(mana, maxMana); 
    }
    public int getMaxMana() { 
        return maxMana; 
    }
    
    @Override
    public void attack(Character target) {
        int damage = getAttackPower() + level; 
        System.out.println(getName() + " attacks with sword! Damage: " + damage);
        target.takeDamage(damage);

         // Regenerasi mana sedikit setelah attack
        restoreMana(2);
    }

    // HEALING SYSTEM - Basic Potion Healing
    public boolean useHealingPotion() {
        if (healingPotions <= 0) {
            System.out.println(getName() + " has no healing potions left!");
            return false;
        }
        
        if (getHealth() == maxHealth) {
            System.out.println(getName() + " is already at full health!");
            return false;
        }
        
        healingPotions--;
        int healAmount = 30 + (level * 3);
        int currentHealth = getHealth();
        int newHealth = Math.min(currentHealth + healAmount, maxHealth);
        setHealth(newHealth);
        
        System.out.println(getName() + " drinks a healing potion!");
        System.out.println("Restored " + (newHealth - currentHealth) + " HP! Current: " + newHealth + "/" + maxHealth);
        System.out.println("Potions remaining: " + healingPotions);
        return true;
    }
    
    // HEALING SYSTEM - Magic Healing
    public boolean magicHeal() {
        int manaCost = 15;
        
        if (manaPoints < manaCost) {
            System.out.println(getName() + " doesn't have enough mana! (" + manaPoints + "/" + manaCost + " needed)");
            return false;
        }
        
        if (getHealth() == maxHealth) {
            System.out.println(getName() + " is already at full health!");
            return false;
        }
        
        manaPoints -= manaCost;
        int healAmount = 25 + (level * 2);
        int currentHealth = getHealth();
        int newHealth = Math.min(currentHealth + healAmount, maxHealth);
        setHealth(newHealth);
        
        System.out.println(getName() + " casts HEALING SPELL!");
        System.out.println("Restored " + (newHealth - currentHealth) + " HP! Current: " + newHealth + "/" + maxHealth);
        System.out.println("Mana used: " + manaCost + " | Remaining: " + manaPoints + "/" + maxMana);
        return true;
    }
    
    // HEALING SYSTEM - Powerful Magic Healing
    public boolean powerfulHeal() {
        int manaCost = 30;
        
        if (manaPoints < manaCost) {
            System.out.println(getName() + " doesn't have enough mana for powerful heal! (" + manaPoints + "/" + manaCost + " needed)");
            return false;
        }
        
        if (getHealth() == maxHealth) {
            System.out.println(getName() + " is already at full health!");
            return false;
        }
        
        manaPoints -= manaCost;
        int healAmount = 60 + (level * 5);
        int currentHealth = getHealth();
        int newHealth = Math.min(currentHealth + healAmount, maxHealth);
        setHealth(newHealth);
        
        System.out.println(getName() + " casts GREATER HEALING!");
        System.out.println("Restored " + (newHealth - currentHealth) + " HP! Current: " + newHealth + "/" + maxHealth);
        System.out.println("Mana used: " + manaCost + " | Remaining: " + manaPoints + "/" + maxMana);
        return true;
    }
    
    // HEALING SYSTEM - Emergency Full Heal
    public boolean emergencyHeal() {
        if (healingPotions < 2) {
            System.out.println(getName() + " needs 2 potions for emergency heal! (Have: " + healingPotions + ")");
            return false;
        }
        
        healingPotions -= 2;
        int currentHealth = getHealth();
        setHealth(maxHealth);
        
        System.out.println(getName() + " uses EMERGENCY FULL HEAL!");
        System.out.println("Fully restored! Healed " + (maxHealth - currentHealth) + " HP!");
        System.out.println("Used 2 potions | Remaining: " + healingPotions);
        return true;
    }
    
    // MANA SYSTEM - Restore Mana
    public void restoreMana(int amount) {
        int currentMana = manaPoints;
        manaPoints = Math.min(manaPoints + amount, maxMana);
        
        if (manaPoints > currentMana) {
            System.out.println(getName() + " restored " + (manaPoints - currentMana) + " mana!");
        }
    }
    
    // UTILITY METHODS
    public boolean needsHealing() {
        return getHealth() < (maxHealth * 0.3); // critical if < 30%
    }
    
    public boolean needsUrgentHealing() {
        return getHealth() < (maxHealth * 0.15); // very critical if < 15%
    }
     
    private String getHealthColor(double percentage) {
        if (percentage < 0.15) return "CRITICAL";
        else if (percentage < 0.3) return "LOW";
        else if (percentage < 0.6) return "MEDIUM";
        else return "GOOD";
    }
    
    // ITEM MANAGEMENT
    public void addHealingPotions(int amount) {
        healingPotions += amount;
        System.out.println(getName() + " found " + amount + " healing potion(s)! Total: " + healingPotions);
    }
    
    public void levelUp() {
        level++;
        maxHealth += 20;
        maxMana += 10;
        setHealth(maxHealth); // full heal on level up
        manaPoints = maxMana; // full mana restore
        
        System.out.println(getName() + " LEVEL UP! New level: " + level);
        System.out.println("Max HP increased by 20! New max: " + maxHealth);
        System.out.println("Max Mana increased by 10! New max: " + maxMana);
        System.out.println("Fully healed and mana restored!");
    }
}