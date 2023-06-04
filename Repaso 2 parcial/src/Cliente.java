public class Cliente {
    private String medioPago;
    private String tipoCliente;
    private int cantidadArticulos;

    public Cliente() {
    }

    public Cliente(String medioPago, String tipoCliente, int cantidadArticulos) {
        this.medioPago = medioPago;
        this.tipoCliente = tipoCliente;
        this.cantidadArticulos = cantidadArticulos;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "medioPago='" + medioPago + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", cantidadArticulos=" + cantidadArticulos +
                '}';
    }


}
