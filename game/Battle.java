//package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Battle {
    private final List<Character> teamA;
    private final List<Character> teamB;

    public Battle(List<Character> teamA, List<Character> teamB) {
        this.teamA = new ArrayList<>(teamA);
        this.teamB = new ArrayList<>(teamB);
    }

    public void run() {
        printSetup();
        
        int turnNumber = 0;
        while (hasAliveMembers(teamA) && hasAliveMembers(teamB)) {
            turnNumber++;
            System.out.println("\n=== TURN " + turnNumber + " ===");
            
            // Team A attacks
            for (Character attacker : teamA) {
                if (!attacker.isAlive()) continue;
                
                Character target = selectTarget(attacker, teamB);
                if (target != null) {
                    attacker.performTurn(target);
                    
                    if (!target.isAlive()) {
                        System.out.println(target.getName() + " defeated!");
                    }
                }
                
                if (!hasAliveMembers(teamB)) break;
            }
            
            if (!hasAliveMembers(teamB)) break;
            
            // Team B attacks
            for (Character attacker : teamB) {
                if (!attacker.isAlive()) continue;
                
                Character target = selectTarget(attacker, teamA);
                if (target != null) {
                    attacker.performTurn(target);
                    
                    if (!target.isAlive()) {
                        System.out.println(target.getName() + " defeated!");
                    }
                }
                
                if (!hasAliveMembers(teamA)) break;
            }
        }
        
        printResult();
    }

    private boolean hasAliveMembers(List<Character> team) {
        for (Character c : team) {
            if (c.isAlive()) return true;
        }
        return false;
    }

    private Character selectTarget(Character attacker, List<Character> enemyTeam) {
        List<Character> aliveEnemies = new ArrayList<>();
        for (Character enemy : enemyTeam) {
            if (enemy.isAlive()) {
                aliveEnemies.add(enemy);
            }
        }
        
        if (aliveEnemies.isEmpty()) return null;
        
        if (attacker instanceof Enemy) {
            // Enemy targets Player with highest HP
            return aliveEnemies.stream()
                .max(Comparator.comparingInt(Character::getHealth))
                .orElse(null);
        } else {
            // Player targets Enemy with highest threat level, then lowest HP
            return aliveEnemies.stream()
                .max(Comparator.comparingInt((Character c) -> {
                    if (c instanceof Enemy) {
                        return ((Enemy) c).getThreatLevel();
                    }
                    return 0;
                }).thenComparingInt(c -> -c.getHealth()))
                .orElse(null);
        }
    }

    private void printSetup() {
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        for (Character c : teamA) {
            printCharacterInfo(c);
        }
        System.out.println("\nTeam B:");
        for (Character c : teamB) {
            printCharacterInfo(c);
        }
        System.out.println();
    }

    private void printCharacterInfo(Character c) {
        StringBuilder sb = new StringBuilder();
        sb.append("- ").append(c.getClass().getSimpleName());
        sb.append("(name=").append(c.getName());
        sb.append(", HP=").append(c.getHealth()).append("/").append(c.getMaxHealth());
        sb.append(", AP=").append(c.getAttackPower());
        
        if (c instanceof Player) {
            Player p = (Player) c;
            sb.append(", Lv=").append(p.getLevel());
            sb.append(", Strategy=").append(p.getStrategy().toString());
        }
        
        if (c instanceof Enemy) {
            Enemy e = (Enemy) c;
            sb.append(", Threat=").append(e.getThreatLevel());
        }
        
        sb.append(")");
        System.out.println(sb.toString());
        
        if (c instanceof Player) {
            Player p = (Player) c;
            if (!p.getSkills().isEmpty()) {
                System.out.print("  Skills: [");
                for (int i = 0; i < p.getSkills().size(); i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print(p.getSkills().get(i).name());
                }
                System.out.println("]");
            }
            
            if (!c.getEffects().isEmpty()) {
                System.out.print("  Effects: [");
                for (int i = 0; i < c.getEffects().size(); i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print(c.getEffects().get(i).name());
                }
                System.out.println("]");
            }
        }
    }

    private void printResult() {
        System.out.println("\n=== RESULT ===");
        if (hasAliveMembers(teamA)) {
            System.out.println("Team A menang!");
        } else {
            System.out.println("Team B menang!");
        }
        
        System.out.println("\nSisa HP:");
        for (Character c : teamA) {
            System.out.println("- " + c.getClass().getSimpleName() + "(" + c.getName() + 
                             "): " + c.getHealth() + "/" + c.getMaxHealth());
        }
        for (Character c : teamB) {
            System.out.println("- " + c.getClass().getSimpleName() + "(" + c.getName() + 
                             "): " + c.getHealth() + "/" + c.getMaxHealth());
        }
    }
}