package Models;

public class Militar extends Avion{
    private SistemaDeArmas tipo;
    private int cantidadBalas;

    public Militar() {
    }

    public Militar(SistemaDeArmas tipo, int cantidadBalas) {
        this.tipo = tipo;
        this.cantidadBalas = cantidadBalas;
    }

    public Militar(String modelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, SistemaDeArmas tipo, int cantidadBalas) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.tipo = tipo;
        this.cantidadBalas = cantidadBalas;
    }

    public SistemaDeArmas getTipo() {
        return tipo;
    }

    public void setTipo(SistemaDeArmas tipo) {
        this.tipo = tipo;
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
                "tipo=" + tipo +
                ", cantidadBalas=" + cantidadBalas +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Soy avion militar despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Soy avion militar aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Soy avion militar volando");
    }

}
