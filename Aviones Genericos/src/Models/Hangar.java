package Models;

import java.util.ArrayList;
import java.util.List;

public class Hangar<T extends Avion> {
    private String nombre;
    private List<T> aviones;

    public Hangar() {
        aviones = new ArrayList<>();
    }

    public Hangar(String nombre) {
        this.nombre = nombre;
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(T avion) {
        aviones.add(avion);
    }

    public List<T> getAviones() {
        return aviones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAviones(List<T> aviones) {
        this.aviones = aviones;
    }
}
