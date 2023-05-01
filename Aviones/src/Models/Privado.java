package Models;

public class Privado extends Avion implements IPrivadoComercial{
    private boolean tieneJacuzzi;
    private String claveWifi;

    public Privado() {
    }

    public Privado(boolean tieneJacuzzi, String claveWifi) {
        this.tieneJacuzzi = tieneJacuzzi;
        this.claveWifi = claveWifi;
    }

    public Privado(String marca, String modelo, int capacidadCombustible, String tipoMotor, int cantidadAsientos, boolean tieneJacuzzi, String claveWifi) {
        super(marca, modelo, capacidadCombustible, tipoMotor, cantidadAsientos);
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
    public void servirComida() {
        System.out.println("Soy Avion Privado y doy Comida");
    }

    @Override
    public void darMantas() {
        System.out.println("Soy Avion Privado y doy Mantas");
    }

    public void verMundial(){
        System.out.println("Viendo el mundial");
    }
}
