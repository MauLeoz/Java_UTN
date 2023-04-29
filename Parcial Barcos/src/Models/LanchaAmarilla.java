package Models;


import java.util.Random;

public class LanchaAmarilla extends Barco implements IPesca{
    private static final int capPorHora = 20;
    private int recolectado;

    public LanchaAmarilla() {
    }

    public LanchaAmarilla(int recolectado) {
        this.recolectado = recolectado;
    }

    public LanchaAmarilla(String marca, String modelo, int capacidadCombustible, int capacidadCarga, String patente) {
        super(marca, modelo, capacidadCombustible, capacidadCarga, patente);

    }

    public int getRecolectado() {
        return recolectado;
    }

    public void setRecolectado(int recolectado) {
        this.recolectado = recolectado;
    }

    @Override
    public String toString() {
        return "LanchaAmarilla{" +
                "recolectado=" + recolectado +
                '}';
    }

    @Override
    public void pescar() {
        int recolectado=0;
        Random random = new Random();
        for(int i=0;i<12 && recolectado<=this.getCapacidadCarga();i++){
            recolectado+= random.nextInt(20);
        }
        if(recolectado>=this.getCapacidadCarga()){
            this.recolectado= getCapacidadCarga();
        }else{
            this.recolectado= recolectado;
        }
    }

    @Override
    public int getMonto() {
        return getRecolectado()*11;
    }
}
