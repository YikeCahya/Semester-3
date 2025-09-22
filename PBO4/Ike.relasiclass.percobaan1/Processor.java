public class Processor {
    private String merk;
    private double cache;

    //Constructor default
    public Processor() {
    }

    //Constructor dengan parameter
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }

    //Method setter dan getter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getMerk() {
        return merk;
    }
    public double getCache() {
        return cache;
    }

    //Method info
    public void info () {
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = % .2f\n", cache);
    }
}
