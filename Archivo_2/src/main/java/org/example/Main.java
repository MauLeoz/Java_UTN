package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Persona> personas = null;

        try {
            personas = objectMapper.readValue(Paths.get("C:\\Users\\Usuario\\IdeaProjects\\Java_UTN\\Java_UTN\\Archivo_2\\generated.json").toFile(),
                    objectMapper.getTypeFactory().constructCollectionType(List.class, Persona.class)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (personas != null) {
            for (Persona persona : personas) {
                System.out.println(persona);
                System.out.println("------------------");
            }
        }

        ObjectMapper objectMapper1 = new ObjectMapper();
        objectMapper1.enable(SerializationFeature.INDENT_OUTPUT);


        String rutaArchivo = "C:\\Users\\Usuario\\IdeaProjects\\Java_UTN\\Java_UTN\\Archivo_2\\prueba.json";

        try (FileWriter fileWriter = new FileWriter(rutaArchivo)) {
            String json = objectMapper1.writeValueAsString(personas);
            // Escribe la cadena JSON en el archivo
            fileWriter.write(json);
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}