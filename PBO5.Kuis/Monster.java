public class Monster extends Character {
    private String type;
    
    // Constructor
    public Monster(String name, int health, int attackPower, String type) {
        super(name, health, attackPower);
        this.type = type;
    }
    
    // Getter dan setter untuk type
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    // Override method attack dengan damage acak
    @Override
    public void attack(Character target) {
        int randomBonus = (int)(Math.random() * 10) + 1; // random 1-10
        int damage = getAttackPower() + randomBonus;
        System.out.println(getName() + " (" + type + ") attacks ferociously! Damage: " + damage);
        target.takeDamage(damage);
    }
}
