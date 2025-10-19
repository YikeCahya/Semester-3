//package game;

/**
 * [cite_start]Interface untuk strategi serangan. [cite: 31, 140]
 * Mendefinisikan bagaimana damage dihitung.
 */
public interface AttackStrategy {
    /**
     * [cite_start]Menghitung damage yang akan diberikan. [cite: 141]
     * @param self Karakter yang menyerang.
     * @param target Karakter yang diserang.
     * @return Jumlah damage.
     */
    int computeDamage(Character self, Character target);
}