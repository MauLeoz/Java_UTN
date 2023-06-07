package org.example;

public class CapacidadInsuficienteException extends Exception {
    private int capacidadAeropuerto;

    public CapacidadInsuficienteException(int capacidadAeropuerto) {
        this.capacidadAeropuerto = capacidadAeropuerto;
    }

    public int getCapacidadAeropuerto() {
        return capacidadAeropuerto;
    }
}