import org.json.JSONArray;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado(3);

        // Generar clientes de prueba
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int cantidadArticulos = random.nextInt(10) + 1;
            String[] mediosPago = {"Efectivo", "Tarjeta s/problemas", "Tarjeta c/problemas"};
            String[] tiposCliente = {"Común", "Jubilado", "Embarazada"};

            String medioPago = mediosPago[random.nextInt(mediosPago.length)];
            String tipoCliente = tiposCliente[random.nextInt(tiposCliente.length)];

            Cliente cliente = new Cliente(medioPago, tipoCliente, cantidadArticulos);
            supermercado.agregarClienteACaja(cliente);
        }

        try {
          supermercado.atender();
        } catch (Exception e) {
            e.printStackTrace();
        }







    }

}