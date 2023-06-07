package Models;

import java.util.ArrayList;
import java.util.List;

public class Aeropuerto<T extends Avion> {
    private String nombre;
    private String codigoInternacional;
    private String direccion;
    private int capacidadOperacion;
    private List<Hangar<T>> hangares;

    public Aeropuerto(String nombre, String codigoInternacional, String direccion, int capacidadOperacion) {
        this.nombre = nombre;
        this.codigoInternacional = codigoInternacional;
        this.direccion = direccion;
        this.capacidadOperacion = capacidadOperacion;
        this.hangares = new ArrayList<>();
    }

    public void agregarHangar(Hangar<? extends Avion> hangar) {
        hangares.add((Hangar<T>) hangar);
    }

    public void despegarAviones(Hangar<? extends Avion> hangar) {
        List<T> aviones = (List<T>) hangar.getAviones();
        for (T avion : aviones) {
            avion.despegar();
        }
    }


    public <U extends T> void agregaValidando(U a, Hangar<U> h) {
        int totalAviones = 0;
        for (Hangar<? extends Avion> hangar : hangares) {
            totalAviones += hangar.getAviones().size();
        }
        if (totalAviones >= capacidadOperacion) {
            System.out.println("La capacidad máxima del aeropuerto ha sido alcanzada. No se puede agregar más aviones.");
        } else {
            h.agregarAvion(a);
            System.out.println("Avion agregado con éxito");
        }
    }

    public void recorrerHangares() {
        for (Hangar<T> hangar : hangares) {

            System.out.println("Hangar " + hangar.getNombre());

            List<T> aviones = hangar.getAviones();
            for (T avion : aviones) {
                System.out.println(avion);
            }

            System.out.println("-----------------------");
        }
    }
    
}