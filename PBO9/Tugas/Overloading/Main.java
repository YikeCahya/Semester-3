public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        // Test totalSudut dengan 1 parameter
        System.out.println("Sudut tersisa (1 param): " + segitiga.totalSudut(60));
        
        // Test totalSudut dengan 2 parameter
        System.out.println("Sudut tersisa (2 param): " + segitiga.totalSudut(60, 80));
        
        // Test keliling dengan 3 parameter
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
        
        // Test keliling dengan 2 parameter (Pythagoras)
        System.out.println("Keliling (2 sisi): " + segitiga.keliling(3, 4));
    }
}
