//package game;

/**
 * [cite_start]Interface untuk efek status (buff/debuff) yang berlangsung beberapa giliran. [cite: 27, 135]
 */
public interface StatusEffect {
    /**
     * [cite_start]Aksi yang dieksekusi di awal giliran. [cite: 27, 137]
     * @param self Karakter yang memiliki efek ini.
     */
    void onTurnStart(Character self);

    /**
     * [cite_start]Aksi yang dieksekusi di akhir giliran. [cite: 27, 137]
     * @param self Karakter yang memiliki efek ini.
     */
    void onTurnEnd(Character self);

    /**
     * [cite_start]Memeriksa apakah efek sudah berakhir. [cite: 27, 138]
     * @return true jika sudah berakhir, false jika masih aktif.
     */
    boolean isExpired();
    
    /**
     * Mengembalikan nama efek dan statusnya.
     * @return String deskripsi efek.
     */
    String getDescription();
}