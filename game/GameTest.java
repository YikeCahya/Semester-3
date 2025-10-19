//package game;

import java.util.Arrays;

public class GameTest {
    public static void main(String[] args) {
        System.out.println("=== MONSTER BATTLE GAME ===\n");
        
        // Create Player with LevelScaledStrategy
        Player player = new Player("HeroVipkas", 120, 25, 5, new LevelScaledStrategy(2));
        
        // Add skills to player
        player.addSkill(new HealSkill(15));
        player.addSkill(new PiercingStrike(1.2));
        
        // Add status effects to player
        player.addEffect(new Shield(10, 3));
        player.addEffect(new Regen(8, 4));
        
        // Create Boss Monster
        BossMonster boss = new BossMonster("Drake", 150, 28, 5, new FixedStrategy());
        
        // Create regular Monster
        Monster goblin = new Monster("Goblin", 80, 12, 2, new FixedStrategy());
        
        // Create Battle
        Battle battle = new Battle(
            Arrays.asList(player),
            Arrays.asList(boss, goblin)
        );
        
        // Run the battle
        battle.run();
        
        System.out.println("\n=== BATTLE COMPLETE ===");
    }
}
