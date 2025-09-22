public class Kursi {
    private String nomor;
    private Penumpang penumpang; 

    public Kursi(String nomor) {
        this.nomor = nomor;
        this.penumpang = null; //kursi awalnya kosong
    }

    //Setter Getter
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

    public Penumpang getPenumpang() {
        return penumpang;
    }
    
    //Method info
    public String info() {
        String info = "";
        info += "Nomor: " + this.nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + this.penumpang.info() + "\n";
        } else {
            info += "Penumpang: Kosong\n";
        }
        return info;
    }
}
