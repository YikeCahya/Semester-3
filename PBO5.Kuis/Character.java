public abstract class Character {
    private String name;
    private int health;
    private int attackPower;
    
    // Constructor
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    
    // Getter methods
    public String getName() { 
        return name; 
    }
    
    public int getHealth() { 
        return health; 
    }
    
    protected int getAttackPower() { 
        return attackPower; 
    }
    
    // Setter methods
    public void setHealth(int health) { 
        this.health = health; 
    }
    
    public void setName(String name) { 
        this.name = name; 
    }
    
    public void setAttackPower(int attackPower) { 
        this.attackPower = attackPower; 
    }
    
    // Method untuk menerima damage
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
        System.out.println(name + " took " + damage + " damage! Remaining health: " + health);
    }
    
    // Abstract method untuk attack - harus diimplementasikan oleh subclass
    public abstract void attack(Character target);
}
