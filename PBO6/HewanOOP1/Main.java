public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo");
        kucing.bersuara(); //Output: Meong! (karena metode di-override)
        kucing.mengeong();

        Anjing anjing = new Anjing("Buddy");
        anjing.bersuara(); //Output: Guk Guk! (karena metode di-override)
        anjing.menggonggong();
    }
}
