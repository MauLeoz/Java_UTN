package Models;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
    private String nombre;
    private String codigo;
    private int capacidadOperacion;
    private List<Avion> hangar;

    public Aeropuerto() {
    }

    public Aeropuerto(String nombre, String codigo, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.capacidadOperacion = capacidadOperacion;
        this.hangar = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public void setCapacidadOperacion(int capacidadOperacion) {
        this.capacidadOperacion = capacidadOperacion;
    }

    public List<Avion> getHangar() {
        return hangar;
    }

    public void setHangar(List<Avion> hangar) {
        this.hangar = hangar;
    }

    @Override
    public String toString() {
        return "Aeropuerto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", capacidadOperacion='" + capacidadOperacion + '\'' +
                ", hangar=" + hangar +
                '}';
    }

    public void agregarAvion(Avion avion){
        if (this.hangar.size() < this.capacidadOperacion){
            this.hangar.add(avion);
        }else{
            System.out.println("El aeropuerto tiene la capacidad completa");
        }
    }
}
