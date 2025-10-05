public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 2022, 4);
        Motor motor = new Motor("Honda", 2023, 150);
        //Truk truk = new Truk("Isuzu", 2021, 5000);

        mobil.info();
        mobil.jalankan();

        System.out.println("------------------------");

        motor.info();
        motor.jalankan();

        Truk truk = new Truk("Isuzu", 2021, 5000);
        System.out.println("------------------------");
        truk.info();
        truk.jalankan();
    }
}
