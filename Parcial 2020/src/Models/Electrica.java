package Models;

public class Electrica extends Cuerda implements SonidoAmplificado{
    private int cuerda=6;
    private String modelo;

    public Electrica() {
    }

    public Electrica( String modelo) {

        this.modelo = modelo;
    }

    public Electrica(double precio, String marca, String modelo) {
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
        return "Electrica{" +
                "cuerda=" + cuerda +
                ", modelo='" + modelo + '\'' +
                "} " + super.toString();
    }

    @Override
    public void SonidoAmplificado() {
        System.out.println(getClass().getSimpleName() + " Sonido Amplificado");
    }
}
