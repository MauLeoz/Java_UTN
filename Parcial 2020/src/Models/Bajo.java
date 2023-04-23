package Models;

public class Bajo extends Cuerda implements SonidoAmplificado{
    private int cuerda=4;
    private String modelo;

    public Bajo() {
    }

    public Bajo(String modelo) {

        this.modelo = modelo;
    }

    public Bajo(double precio, String marca, String modelo) {
        super(precio, marca);
        this.modelo = modelo;
    }

    public int getCuerda() {
        return cuerda;
    }

    public void setCuerda(int cuerda) {
        this.cuerda = cuerda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Bajo{" +
                "cuerda=" + cuerda +
                ", modelo='" + modelo + '\'' +
                "} " + super.toString();
    }

    @Override
    public void SonidoAmplificado() {
        System.out.println(getClass().getSimpleName() + " Sonido Amplificado");
    }
}
