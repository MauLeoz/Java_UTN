package Models;

public class Militar extends Avion{
    private SistemaArmas sistemaArmas;
    private int cantidadBalas;

    public Militar() {
    }

    public Militar(SistemaArmas sistemaArmas, int cantidadBalas) {
        this.sistemaArmas = sistemaArmas;
        this.cantidadBalas = cantidadBalas;
    }

    public Militar(String marca, String modelo, int capacidadCombustible, String tipoMotor, int cantidadAsientos, SistemaArmas sistemaArmas, int cantidadBalas) {
        super(marca, modelo, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.sistemaArmas = sistemaArmas;
        this.cantidadBalas = cantidadBalas;
    }

    public SistemaArmas getSistemaArmas() {
        return sistemaArmas;
    }

    public void setSistemaArmas(SistemaArmas sistemaArmas) {
        this.sistemaArmas = sistemaArmas;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "sistemaArmas=" + sistemaArmas +
                ", cantidadBalas=" + cantidadBalas +
                '}';
    }
}
