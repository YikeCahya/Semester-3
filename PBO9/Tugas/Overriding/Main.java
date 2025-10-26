public class Main {
    public static void main(String[] args) {
        Manusia m1 = new Dosen();
        Manusia m2 = new Mahasiswa();
        
        System.out.println("=== Dosen ===");
        m1.bernafas();
        m1.makan();  
        
        System.out.println("\n=== Mahasiswa ===");
        m2.bernafas();
        m2.makan();  
        
        System.out.println("\n=== Method Khusus ===");
        ((Dosen) m1).lembur();
        ((Mahasiswa) m2).tidur();
    }
}
