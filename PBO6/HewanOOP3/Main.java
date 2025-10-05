public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Milo", 2);
        kucing.berjalan();
        kucing.menyusui();

        Anjing anjing = new Anjing("Buddy", 3, "Golden Retriever");
        anjing.bersuara();
        anjing.menyusui();
    }
}
