package Models;

import java.util.ArrayList;
import java.util.List;

public class Carga extends Avion{
    private int kilos;
    private List<String> productos;

    public Carga() {
    }

    public Carga(String marca, String modelo, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int kilos) {
        super(marca, modelo, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.kilos = kilos;
        this.productos = new ArrayList<>();
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Carga{" +
                "kilos=" + kilos +
                ", productos=" + productos +
                '}';
    }
}
