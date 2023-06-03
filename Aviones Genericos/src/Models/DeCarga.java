package Models;

import java.util.List;

public class DeCarga extends Avion{
    private int capacidadKilos;
    private List<String> productos;

    public DeCarga() {
    }

    public DeCarga(int capacidadKilos, List<String> productos) {
        this.capacidadKilos = capacidadKilos;
        this.productos = productos;
    }

    public DeCarga(String modelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int capacidadKilos, List<String> productos) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.capacidadKilos = capacidadKilos;
        this.productos = productos;
    }

    public int getCapacidadKilos() {
        return capacidadKilos;
    }

    public void setCapacidadKilos(int capacidadKilos) {
        this.capacidadKilos = capacidadKilos;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "DeCarga{" +
                "capacidadKilos=" + capacidadKilos +
                ", productos=" + productos +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Soy avion de carga despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Soy avion de carga aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Soy avion de carga volando");
    }

    public void descargarContenido() {
        System.out.println("Descargando contenido del avión de carga...");

    }
}
