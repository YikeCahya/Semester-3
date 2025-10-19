//package game;

/**
 * [cite_start]Skill serangan yang mengabaikan sebagian damage reduction. [cite: 23]
 */
public class PiercingStrike implements Skill {
    private final double multiplier;

    public PiercingStrike(double multiplier) {
        this.multiplier = multiplier;
    }

    @Override
    public String name() {
        return String.format("PiercingStrike(x%.1f)", multiplier);
    }

    @Override
    public void apply(Character self, Character target) {
        // Logika PiercingStrike diterapkan di dalam method attack Player
        // Method apply ini bisa dikosongkan atau diisi log tambahan jika perlu
    }
}