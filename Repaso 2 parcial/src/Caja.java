import java.util.LinkedList;
import java.util.Queue;

public class Caja {
    public Queue<Cliente> fila;

    public Caja() {
        fila = new LinkedList<>();
    }

    public void agregarCliente(Cliente cliente) {
        fila.add(cliente);
    }

    public Cliente atenderCliente() {
        return fila.poll();
    }

    public boolean hayClientes() {
        return !fila.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja {").append(System.lineSeparator());

        int clienteCount = 1;
        for (Cliente cliente : fila) {
            sb.append("Cliente ").append(clienteCount).append(":").append(System.lineSeparator());
            sb.append("  Medio de Pago: ").append(cliente.getMedioPago()).append(System.lineSeparator());
            sb.append("  Tipo de Cliente: ").append(cliente.getTipoCliente()).append(System.lineSeparator());
            sb.append("  Cantidad de Artículos: ").append(cliente.getCantidadArticulos()).append(System.lineSeparator());
            clienteCount++;
        }

        sb.append("}");
        return sb.toString();
    }

    public int calcularTiempoPromedio() {
        int tiempoTotal = 0;
        int cantidadClientes = 0;

        for (Cliente cliente : fila) {
            int tiempoCliente = cliente.getCantidadArticulos() * 30;
            tiempoCliente = ajustarTiempoCliente(tiempoCliente, cliente);
            tiempoTotal += tiempoCliente;
            cantidadClientes++;
        }

        return cantidadClientes > 0 ? tiempoTotal / cantidadClientes : 0;
    }

    private int ajustarTiempoCliente(int tiempo, Cliente cliente) {
        if (cliente.getTipoCliente().equals("Común"))
            tiempo += tiempo * 0.15;
        else if (cliente.getTipoCliente().equals("Jubilado"))
            tiempo += tiempo * 0.25;
        else if (cliente.getTipoCliente().equals("Embarazada"))
            tiempo += tiempo * 0.20;

        if (cliente.getMedioPago().equals("Efectivo"))
            tiempo += tiempo * 0.10;
        else if (cliente.getMedioPago().equals("Tarjeta s/problemas"))
            tiempo += tiempo * 0.15;
        else if (cliente.getMedioPago().equals("Tarjeta c/problemas"))
            tiempo += tiempo * 0.50;

        return tiempo;
    }
}
