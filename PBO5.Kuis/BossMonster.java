public class BossMonster extends Monster {
    private int bossLevel;
    
    public BossMonster(String name, int health, int attackPower, String type, int bossLevel) {
        super(name, health, attackPower, type);
        this.bossLevel = bossLevel;
    }
    
    public int getBossLevel() {
        return bossLevel;
    }
    public void setBossLevel(int bossLevel) {
        this.bossLevel = bossLevel;
    }
    
    @Override
    public void attack(Character target) {
        int randomBonus = (int)(Math.random() * 15) + 5; 
        int baseDamage = super.getAttackPower() + randomBonus;
        int specialDamage = baseDamage * 2; // damage 2x lipat
        
        System.out.println(getName() + " (" + super.getType() + " Boss Lv." + bossLevel + ") unleashes SPECIAL ATTACK!");
        System.out.println("DEVASTATING BLOW! Damage: " + specialDamage + " (2x multiplier)");
        target.takeDamage(specialDamage);
    }
    public void normalAttack(Character target) {
        super.attack(target); // memanggil attack method dari Monster
    }
}
