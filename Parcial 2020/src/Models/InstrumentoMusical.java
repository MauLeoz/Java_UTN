package Models;

public class InstrumentoMusical {
    private double precio;
    private String marca;

    public InstrumentoMusical() {
    }

    public InstrumentoMusical(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void aplicarAumento(double aumento){
        double aux = getPrecio()+(getPrecio()*aumento/100);
        setPrecio(aux);
    }
}
