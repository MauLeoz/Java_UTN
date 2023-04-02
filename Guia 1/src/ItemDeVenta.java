import java.text.DecimalFormat;
public class ItemDeVenta {
    private int identificador;
    private String descripcion;
    private double cantidad;
    private double precio;

    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ItemDeVenta() {
    }
    public ItemDeVenta(int identificador,String descripcion, double cantidad, double precio){
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public double precioTotal(){
        double resultado = precio * cantidad;
        return resultado;
    }

    @Override
    public String toString() {
        return "ItemDeVenta{" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
