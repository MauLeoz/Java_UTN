package Models;

import java.util.Random;
public class Corbeta extends Barco implements IPesca{
    private int cantJaulas;
    private static final int capJaula=10;
    private int recolectado;

    public Corbeta() {
    }

    public Corbeta(int cantJaulas, int recolectado) {
        this.cantJaulas = cantJaulas;
        this.recolectado = recolectado;
    }

    public Corbeta(String marca, String modelo, int capacidadCombustible, String patente, int cantJaulas) {
        super(marca, modelo, capacidadCombustible, (cantJaulas*capJaula), patente);
        this.cantJaulas = cantJaulas;
    }

    public int getCantJaulas() {
        return cantJaulas;
    }

    public void setCantJaulas(int cantJaulas) {
        this.cantJaulas = cantJaulas;
    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    @Override
    public String toString() {
        return "Corbeta{" +
                "cantJaulas=" + cantJaulas +
                ", recolectado=" + recolectado +
                '}';
    }

    @Override
    public void pescar() {
        Random random = new Random();
        recolectado = random.nextInt(getCapacidadCarga());
    }

    @Override
    public int getMonto() {
        return this.recolectado*11;
    }
}
