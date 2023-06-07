package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException, CapacidadInsuficienteException {
        String filePath = "C:\\Users\\Usuario\\IdeaProjects\\Java_UTN\\Java_UTN\\Repaso\\G6UyHYt7 (2).json";
        String json = readFile(filePath);

        ArrayList<Aeropuerto> aeropuertos = jsonToArrayList(json, Aeropuerto.class);


        ///  System.out.println(aeropuertos);

        System.out.println();

        System.out.println(aeropuertos.get(1).getCapacidad());

        int capacidadMinima = 40;

        try {
            ArrayList<Aeropuerto> aeropuertosFiltrados = filtrarPorCapacidad(aeropuertos, capacidadMinima);
            if (aeropuertosFiltrados.isEmpty()) {
                throw new CapacidadInsuficienteException(capacidadMinima);
            }

            System.out.println("Aeropuertos filtrados:");
            for (Aeropuerto aeropuerto : aeropuertosFiltrados) {
                System.out.println(aeropuerto);
            }
        } catch (CapacidadInsuficienteException e) {
            System.out.println("Excepción: Capacidad insuficiente en el aeropuerto. Capacidad: " + e.getCapacidadAeropuerto());
        }

        ListaGenerica<String> listaTags = new ListaGenerica<>();

        for (Aeropuerto aeropuerto : aeropuertos) {
            List<String> etiquetas = aeropuerto.getEtiquetas();
            for (String etiqueta : etiquetas) {
                listaTags.agregar(etiqueta);
            }
        }

        // Recuperar tags de la lista generica
        System.out.println("Tags en la ListaGenerica:");
        for (int i = 0; i < listaTags.size(); i++) {
            String tag = listaTags.recuperar(i);
            System.out.println(tag);
        }





    }



    public static <T> ArrayList<T> jsonToArrayList(String json, Class<T> clazz) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(ArrayList.class, clazz));
    }

    private static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static ArrayList<Aeropuerto> filtrarPorCapacidad(ArrayList<Aeropuerto> aeropuertos, int capacidadMinima) {
        ArrayList<Aeropuerto> aeropuertosFiltrados = new ArrayList<>();

        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCapacidad() > capacidadMinima) {
                aeropuertosFiltrados.add(aeropuerto);
            }
        }
        return aeropuertosFiltrados;
    }
}
