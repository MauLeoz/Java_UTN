package Models;

import java.util.List;

public class Comercial extends Avion implements DarManta,DarComida{
    private int cantidadAzafatas;
    private List<String> servicios;

    public Comercial() {
    }

    public Comercial(int cantidadAzafatas, List<String> servicios) {
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = servicios;
    }

    public Comercial(String modelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, int cantidadAzafatas, List<String> servicios) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas = cantidadAzafatas;
        this.servicios = servicios;
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
    public void despegar() {
        System.out.println("Soy avion comercial despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Soy avion comercial aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Soy avion comercial volando");
    }



}
