package Models;

public class LanchaTransporte extends Barco{
    private int cantPersonas;

    public LanchaTransporte() {
    }

    public LanchaTransporte(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public LanchaTransporte(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente, int cantPersonas) {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente);
        this.cantPersonas = cantPersonas;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    @Override
    public String toString() {
        return "LanchaTransporte{" +
                "cantPersonas=" + cantPersonas +
                '}';
    }
}
