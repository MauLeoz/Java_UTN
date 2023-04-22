package Models;

public class Bateria extends InstrumentoMusical{
    private int tambores;
    private int platillos;

    public Bateria() {
    }


    public Bateria(String marca, int tambores, int platillos) {
        super((platillos*2000+tambores*3000), marca);
        if(tambores>=3){
            this.tambores = tambores;
        }else{
            System.out.println("Cantidad de tambores no validas");
        }
        if(platillos>=1 && platillos<6) {
            this.platillos = platillos;
        }else{
            System.out.println("Cantidad de platillos no validas");
        }
    }

    public int getTambores() {
        return tambores;
    }

    public void setTambores(int tambores) {
        this.tambores = tambores;
    }

    public int getPlatillos() {
        return platillos;
    }

    public void setPlatillos(int platillos) {
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "tambores=" + tambores +
                ", platillos=" + platillos +
                "} " + super.toString();
    }
}
