public class Manusia {

    public void nyalakanPerangkat(Elektronik perangkat) {
        if (perangkat instanceof TelevisiJadul) {
            // Casting dan panggil method spesifik 
            String input = ((TelevisiJadul) perangkat).getModelInput();
            // Cetak berdasarkan output 
            System.out.println("Nyalakan televisi jadul dengan input: " + input);
            
        } else if (perangkat instanceof TelevisiModern) {
            // Casting dan panggil method spesifik
            String input = ((TelevisiModern) perangkat).getModelInput();
            // Cetak berdasarkan output 
            System.out.println("Nyalakan televisi modern dengan input: " + input);
        }

        // Panggil method dari superclass
        System.out.println("Voltase televisi: " + perangkat.getVoltase());
    }
}
