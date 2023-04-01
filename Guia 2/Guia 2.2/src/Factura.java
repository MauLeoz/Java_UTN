import java.util.UUID;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Factura {
    private UUID id;
    private double montoTotal;
    private Cliente cliente ;
    private LocalDateTime  fechaHoraActual;
    private ArrayList<ItemVenta> itemVenta;

    public Factura(double montoTotal, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.montoTotal = montoTotal;
        this.cliente = cliente;
        this.fechaHoraActual = LocalDateTime.now();
        this.itemVenta = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getFechaHoraActual() {
        return fechaHoraActual;
    }

    public void setFechaHoraActual(LocalDateTime fechaHoraActual) {
        this.fechaHoraActual = fechaHoraActual;
    }

    public void imprimirMonto(){
        System.out.println(this.getMontoTotal());
    }

    public void aplicarDescuento(){
        setMontoTotal(this.montoTotal-((this.montoTotal*this.cliente.getDescuento())/100));
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", montoTotal=" + montoTotal +
                ", cliente=" + cliente +
                ", fechaHoraActual=" + fechaHoraActual +
                ", itemVenta=" + itemVenta +
                '}';
    }

    public void agregarItemVenta(ItemVenta itemVenta) {
        this.itemVenta.add(itemVenta);
    }
}
