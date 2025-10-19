//package game;

import java.util.ArrayList;
import java.util.List;

/**
 * [cite_start]Kelas utama untuk setup dan menjalankan simulasi game. [cite: 159]
 */
public class GameTest {
    [cite_start]public static void main(String[] args) { [cite: 160]
        // Setup Player
        [cite_start]Player player = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2)); [cite: 161]
        [cite_start]player.addSkill(new HealSkill(15)); [cite: 163]
        player.addSkill(new PiercingStrike(1.2));
        player.addEffect(new Shield(10, 3));
        player.addEffect(new Regen(8, 4));

        // Setup Enemies
        BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy(28));
        Monster monster = new Monster("Goblin", 80, 12, 2, new FixedStrategy(12));

        // Setup Teams
        List<Character> teamA = new ArrayList<>();
        teamA.add(player);

        List<Character> teamB = new ArrayList<>();
        teamB.add(boss);
        teamB.add(monster);

        // Print Setup Info
        System.out.println("=== SETUP ===");
        System.out.println("Team A:");
        System.out.printf("- Player(name=%s, HP=%d/%d, AP=%d, Lv=%d)%n",
                player.getName(), player.getHealth(), player.getMaxHealth(), player.getAttackPower(), player.getLevel());
        System.out.println("  Skills: " + player.getSkills().stream().map(Skill::name).collect(java.util.stream.Collectors.joining(", ")));
        System.out.println("  Effects: " + player.getActiveEffectsDescription());
        System.out.println("Team B:");
        System.out.printf("- BossMonster(name=%s, HP=%d/%d, AP=%d, Threat=%d)%n",
                boss.getName(), boss.getHealth(), boss.getMaxHealth(), boss.getAttackPower(), boss.getThreatLevel());
        System.out.printf("- Monster(name=%s, HP=%d/%d, AP=%d, Threat=%d)%n",
                monster.getName(), monster.getHealth(), monster.getMaxHealth(), monster.getAttackPower(), monster.getThreatLevel());


        // Run Battle
        Battle battle = new Battle(teamA, teamB);
        battle.run();
    }
}