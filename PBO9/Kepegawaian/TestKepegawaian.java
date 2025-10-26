public class TestKepegawaian {
    public static void main(String[] args) {
        Manager man = new Manager("Bill Gates", 5000000);
        Supervisor spv = new Supervisor("Susanto", 1000000);
        SalesManager slman = new SalesManager("Jessica", "IT", 2000000);
        
        man.naikkanGaji();
        spv.naikkanGaji();
        slman.naikkanGaji();
        
        man.cetakStatus();
        System.out.println();
        spv.cetakStatus();
        System.out.println();
        slman.cetakStatus();
    }
}
