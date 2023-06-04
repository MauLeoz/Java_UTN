import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Supermercado {
    private List<Caja> cajas;

    public Supermercado(int cantidadCajas) {
        cajas = new ArrayList<>(cantidadCajas);
        for (int i = 0; i < cantidadCajas; i++) {
            cajas.add(new Caja());
        }
    }

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
    }


    public void agregarClienteACaja(Cliente cliente) {
        Caja cajaMenosClientes = cajas.get(0);
        for (Caja caja : cajas) {
            if (caja.fila.size() < cajaMenosClientes.fila.size()) {
                cajaMenosClientes = caja;
            }
        }
        cajaMenosClientes.agregarCliente(cliente);
    }

    public void atender() throws Exception {
        for (Caja caja : cajas) {
            if (caja.hayClientes()) {
                JSONArray jsonArray = exportarClientesCaja(caja);
                System.out.println("Clientes en la caja:");
                System.out.println(jsonArray.toString());
                System.out.println("Tiempo promedio de espera en la caja: " + caja.calcularTiempoPromedio() + " segundos");

                while (caja.hayClientes()) {
                    Cliente cliente = caja.atenderCliente();
                    if (cliente.getMedioPago().equals("Tarjeta c/problemas")) {
                        int clientesTarjetaConProblemas = 0;
                        for (Cliente c : caja.fila) {
                            if (c.getMedioPago().equals("Tarjeta c/problemas")) {
                                clientesTarjetaConProblemas++;
                                if (clientesTarjetaConProblemas > 3) {
                                    throw new Exception("Excepción: Demasiados clientes con tarjeta c/problemas en la caja");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public JSONArray exportarClientesCaja(Caja caja) {
        JSONArray jsonArray = new JSONArray();
        for (Cliente cliente : caja.fila) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("medioPago", cliente.getMedioPago());
            jsonObject.put("tipoCliente", cliente.getTipoCliente());
            jsonObject.put("cantidadArticulos", cliente.getCantidadArticulos());
            jsonArray.put(jsonObject);
        }
        return jsonArray;
    }
}
