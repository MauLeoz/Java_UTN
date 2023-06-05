package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;


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

    }
}