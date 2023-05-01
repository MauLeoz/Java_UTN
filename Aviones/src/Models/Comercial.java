package Models;

import java.util.ArrayList;
import java.util.List;

public class Comercial extends Avion implements IPrivadoComercial{
    private int cantidadAzafatas;
    private List<String> servicios;

    public Comercial() {
    }


    public Comercial(String marca, String modelo, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas) {
        super(marca, modelo, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = new ArrayList<>();
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public void setServicios(List<String> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Comercial{" +
                "cantidadAzafatas=" + cantidadAzafatas +
                ", servicios=" + servicios +
                '}';
    }


    @Override
    public void servirComida() {
        System.out.println("Soy Avion comercial y doy Comida");
    }

    @Override
    public void darMantas() {
        System.out.println("Soy Avion comercial y doy Mantas");
    }
}
