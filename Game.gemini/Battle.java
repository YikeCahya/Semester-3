//package game;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * [cite_start]Kelas yang mensimulasikan pertarungan turn-based. [cite: 35, 145]
 */
public class Battle {
    [cite_start]private final List<Character> teamA; [cite: 146]
    [cite_start]private final List<Character> teamB; [cite: 146]

    [cite_start]public Battle(List<Character> teamA, List<Character> teamB) { [cite: 147]
        this.teamA = teamA;
        this.teamB = teamB;
    }

    private boolean isTeamAlive(List<Character> team) {
        return team.stream().anyMatch(Character::isAlive);
    }

    private Character selectPlayerTarget(List<Character> enemies) {
        return enemies.stream()
                .filter(Character::isAlive)
                .min(Comparator.comparing(Enemy.class::cast, Comparator.comparingInt(Enemy::getThreatLevel).reversed())
                        .thenComparingInt(Character::getHealth))
                .orElse(null);
    }

    private Character selectEnemyTarget(List<Character> players) {
        return players.stream()
                .filter(Character::isAlive)
                .max(Comparator.comparingInt(Character::getHealth))
                .orElse(null);
    }

    [cite_start]public void run() { [cite: 151]
        int turn = 1;
        while (isTeamAlive(teamA) && isTeamAlive(teamB)) {
            System.out.printf("%n=== TURN %d ===%n", turn);

            // Giliran Tim A (Player)
            System.out.println("[Team A's Turn]");
            for (Character memberA : teamA) {
                if (memberA.isAlive() && isTeamAlive(teamB)) {
                    Character target = selectPlayerTarget(teamB.stream()
                        .map(c -> (Enemy)c)
                        .collect(Collectors.toList()));
                    if (target != null) {
                         memberA.performTurn(target);
                    }
                }
            }

            // Giliran Tim B (Musuh)
            if (isTeamAlive(teamB) && isTeamAlive(teamA)) {
                System.out.println("\n[Team B's Turn]");
                for (Character memberB : teamB) {
                    if (memberB.isAlive()) {
                        Character target = selectEnemyTarget(teamA);
                        if (target != null) {
                            memberB.performTurn(target);
                        }
                    }
                }
            }
            turn++;
        }
        
        System.out.println("\n=== BATTLE FINISHED ===");
        if (isTeamAlive(teamA)) {
            System.out.println("Team A wins!");
        } else {
            System.out.println("Team B wins!");
        }

        System.out.println("\n--- Final Stats ---");
        System.out.println("Team A:");
        teamA.forEach(c -> System.out.printf("- %s: %d/%d HP%n", c.getName(), c.getHealth(), c.getMaxHealth()));
        System.out.println("Team B:");
        teamB.forEach(c -> System.out.printf("- %s: %d/%d HP%n", c.getName(), c.getHealth(), c.getMaxHealth()));
    }
}