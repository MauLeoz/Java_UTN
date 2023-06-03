package Models;

public class Privado extends Avion implements DarComida,DarManta{
    private boolean tieneJacuzzi;
    private String claveWifi;

    public Privado() {
    }

    public Privado(boolean tieneJacuzzi, String claveWifi) {
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    public Privado(String modelo, String marca, int capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean tieneJacuzzi, String claveWifi) {
        super(modelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    public void setTieneJacuzzi(boolean tieneJacuzzi) {
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    @Override
    public String toString() {
        return "Privado{" +
                "tieneJacuzzi=" + tieneJacuzzi +
                ", claveWifi='" + claveWifi + '\'' +
                '}';
    }

    @Override
    public void despegar() {
        System.out.println("Soy avion privado despegando");
    }

    @Override
    public void aterrizar() {
        System.out.println("Soy avion privado aterrizando");
    }

    @Override
    public void volar() {
        System.out.println("Soy avion privado volando");
    }


    public boolean verMundial(){
        if (isTieneJacuzzi())
        return true;
        else return  false;
    }
}
