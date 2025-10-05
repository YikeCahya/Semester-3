public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Mimi", 2, "Oranye");
        kucing.info();
        kucing.berjalan();
        //System.out.println(kucing,nama); //Error, 'nama' adalah private
        System.out.println(kucing.umur); //valid, 'umur' adalah protected dan bisa diakses oleh subclass

        Anjing anjing = new Anjing("Buddy", 3, "Pendek");
        anjing.info();
        anjing.getJenisBulu();
    }
}
