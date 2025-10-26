public class Segitiga {
    private int sudut;
    
    // Method overloading untuk totalSudut
    // Dengan 1 parameter
    public int totalSudut(int sudutA) {
        sudut = 180 - sudutA;
        return sudut;
    }
    
    // Dengan 2 parameter
    public int totalSudut(int sudutA, int sudutB) {
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }
    
    // Method overloading untuk keliling
    // Dengan 3 parameter int, return int
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }
    
    // Dengan 2 parameter int, return double
    public double keliling(int sisiA, int sisiB) {
        double sisiC = Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
        return sisiA + sisiB + sisiC;
    }
}
