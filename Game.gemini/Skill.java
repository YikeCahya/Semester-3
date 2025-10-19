//package game;

/**
 * [cite_start]Interface untuk skill yang dapat digunakan oleh karakter. [cite: 21, 130]
 */
public interface Skill {
    /**
     * [cite_start]Mengembalikan nama skill. [cite: 131]
     */
    String name();

    /**
     * [cite_start]Menerapkan efek skill. [cite: 132]
     * @param self Karakter yang menggunakan skill.
     * @param target Karakter target.
     */
    void apply(Character self, Character target);
}