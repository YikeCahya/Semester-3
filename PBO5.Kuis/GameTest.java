public class GameTest {
    public static void main(String[] args) {
        System.out.println("=== WELCOME TO MONSTER BATTLE GAME ===");
        
        // Membuat karakter dengan healing system
        Player p1 = new Player("IKE", 120, 25, 5);
        Monster m1 = new Monster("Goblin Warrior", 60, 12, "Goblin");
        Monster m2 = new Monster("Fire Dragon", 120, 20, "Dragon");
        BossMonster boss = new BossMonster("Shadow Lord", 200, 30, "Dark Boss", 10);
        
        System.out.println("=== ENEMIES ===");
        System.out.println(m1.getName() + " (HP: " + m1.getHealth() + ", ATK: " + m1.getAttackPower() + ")");
        System.out.println(m2.getName() + " (HP: " + m2.getHealth() + ", ATK: " + m2.getAttackPower() + ")");
        System.out.println(boss.getName() + " (HP: " + boss.getHealth() + ", ATK: " + boss.getAttackPower() + ")");
        
        System.out.println("\n=== BATTLE BEGINS! ===");
        
        // Round 1
        System.out.println("\n--- Round 1: Opening Attacks ---");
        m1.attack(p1);
        System.out.println();
        p1.attack(m1);
        
        if (p1.getManaPoints() >= 15) {
            System.out.println("\nTesting Magic Heal:");
            p1.magicHeal();
        }
        
        System.out.println("\nTesting Healing Potion:");
        p1.useHealingPotion();
        
        // Round 2: Heavy damage
        System.out.println("\n--- Round 2: Heavy Combat ---");
        m2.attack(p1);
        boss.attack(p1); // Boss special attack
        
        if (p1.needsUrgentHealing()) {
            System.out.println("\nPLAYER IS CRITICALLY INJURED!");
            
            // Try emergency heal first
            if (p1.getHealingPotions() >= 2) {
                p1.emergencyHeal();
            } else {
                // Use powerful heal if enough mana
                if (p1.getManaPoints() >= 30) {
                    p1.powerfulHeal();
                } else {
                    // Use whatever available
                    if (p1.getHealingPotions() > 0) {
                        p1.useHealingPotion();
                    }
                    if (p1.getManaPoints() >= 15) {
                        p1.magicHeal();
                    }
                }
            }
        } else if (p1.needsHealing()) {
            System.out.println("\nPlayer needs healing...");
            
            // Smart healing decision
            if (p1.getManaPoints() >= 30 && p1.getHealth() < 50) {
                p1.powerfulHeal();
            } else if (p1.getManaPoints() >= 15) {
                p1.magicHeal();
            } else if (p1.getHealingPotions() > 0) {
                p1.useHealingPotion();
            }
        }
        
        // Item discovery
        System.out.println("\n--- Item Discovery ---");
        p1.addHealingPotions(2);
        p1.restoreMana(20);
        
        // Round 3: Final showdown
        if (p1.getHealth() > 0) {
            System.out.println("\n--- Round 3: Final Showdown ---");
            
            // Player's turn
            p1.attack(boss);
            
            if (boss.getHealth() > 0) {
                boss.attack(p1);
                
                if (p1.getHealth() > 0 && p1.needsHealing()) {
                    System.out.println("\n--- Last Stand Healing ---");
                    
                    if (p1.getManaPoints() >= 30) {
                        p1.powerfulHeal();
                    } else if (p1.getHealingPotions() > 0) {
                        p1.useHealingPotion();
                    }
                }
            }
        }
        
        // Level up demonstration
        if (p1.getHealth() > 0) {
            System.out.println("\n--- Victory Rewards ---");
            p1.levelUp();
        }
        
        // Final status
        System.out.println("\n=== FINAL BATTLE RESULTS ===");
        System.out.println("\n" + m1.getName() + " Health: " + m1.getHealth());
        System.out.println(boss.getName() + " Health: " + boss.getHealth());
        
        if (p1.getHealth() > 0) {
            System.out.println("\n" + p1.getName() + " VICTORIOUS!");
            System.out.println("Survived through strategic healing!");
        } else {
            System.out.println("\n" + p1.getName() + " has fallen in battle...");
        }
        
        // Healing system summary
        System.out.println("\n=== ADVANCED HEALING FEATURES USED ===");
        System.out.println("Healing Potions - Quick 30+ HP recovery");
        System.out.println("Magic Heal (15 mana) - 25+ HP recovery");
        System.out.println("Powerful Heal (30 mana) - 60+ HP recovery"); 
        System.out.println("Emergency Heal (2 potions) - Full HP restore");
        System.out.println("Mana System - Powers magical healing");
        System.out.println("Detailed Status - HP/Mana bars & indicators");
        System.out.println("Level Up - Increases max HP/Mana + full restore");
    }
} 