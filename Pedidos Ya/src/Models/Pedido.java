package Models;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pedido {
    private LocalDateTime fechaHora;
    private Usuario usuario;
    private Local local;
    private List<Plato> plato;
    private Map<Plato,Integer> cantidadPlatos;
    private String metodoEntrega;
    private String metodoPago;
    private double total;

    public Pedido(Local local, List<Plato> platos, String metodoEntrega, String metodoPago) {
        this.fechaHora = LocalDateTime.now();
        this.local = local;
        this.plato = platos;
        this.cantidadPlatos = new HashMap<>();
        for (Plato plato : platos) {
            cantidadPlatos.put(plato, cantidadPlatos.getOrDefault(plato, 0) + 1);
        }
        this.metodoEntrega = metodoEntrega;
        this.metodoPago = metodoPago;
    }

    public Pedido() {
    }


}
