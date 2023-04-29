package Models;

import java.util.Objects;

public class Barco {
    private String marca;
    private String modelo;
    private int capacidadCombustible;
    private int capacidadCarga;
    private String patente;

    public Barco() {
    }

    public Barco(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.capacidadCarga = capacidadCarga;
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(int capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadCombustible=" + capacidadCombustible +
                ", capacidadCarga=" + capacidadCarga +
                ", patente='" + patente + '\'' +
                '}';
    }

   // @Override
    public boolean equals (Object obj){
        if(obj==null){
            return false;
        }else if(this==obj){
            return true;
        }else{
            Barco barquito = (Barco) obj;
            return this.patente.equals(barquito.getPatente());
        }
    }


}
