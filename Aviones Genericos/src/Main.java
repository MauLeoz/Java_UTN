import Models.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        List<String> servicios = new ArrayList<>();
        servicios.add("Peliculas");
        servicios.add("Comida");
        servicios.add("Juegos");

        List<String> productos = new ArrayList<>();
        productos.add("Alimentos");
        productos.add("Ropa");
        productos.add("Armas");

        Comercial c1 = new Comercial("Mod1","Marca1",50000,"1600fg",25,2,servicios);
        Comercial c2 = new Comercial("Mod2","Marca1",150000,"2ff600fg",225,3,servicios);
        Comercial c3 = new Comercial("Mod3","Marca2",580000,"Nas25",255,10,servicios);
        Comercial c4 = new Comercial("Mod4","Marca1",500000,"Nas25",125,2,servicios);

        DeCarga d1 = new DeCarga("Mod1", "Marca1",50000,"1600fg",5,575000,productos);
        DeCarga d2 = new DeCarga("Mod2", "Marca2",500000,"1600fg",15,1575000,productos);
        DeCarga d3 = new DeCarga("Mod13", "Marca13",500200,"1as0fg",5,75000,productos);

        Militar m1 = new Militar("Mod1", "Marca1",50000,"1600fg",50, SistemaDeArmas.AIRE_AIRE,1000000);
        Militar m2 = new Militar("Mod1", "Marca2",50000,"1600fg",50, SistemaDeArmas.AIRE_TIERRA,1000000);
        Militar m3 = new Militar("Mod1", "Marca1",50000,"1600fg",50, SistemaDeArmas.AIRE_AIRE,1000000);

        Privado p1 = new Privado("Mod1", "Marca1",50000,"1600fg",50,true,"1215sdsdsd");
        Privado p2 = new Privado("Mod1", "Marca1",50000,"1600fg",50,false,"qwertty");
        Privado p3 = new Privado("Mod1", "Marca1",50000,"1600fg",50,true,"sfsdfsdf");

        Hangar<Comercial> hc = new Hangar<>("Comercial");
        Hangar<DeCarga>   hd = new Hangar<>("De carga");
        Hangar<Militar>   hm = new Hangar<>("Militar");
        Hangar<Privado>   hp = new Hangar<>("Privado");

        Aeropuerto<Avion> aeropuerto = new Aeropuerto<>("Astor Piazolla","MDQ212","Ruta 222",6);

        aeropuerto.agregarHangar(hc);
        aeropuerto.agregarHangar(hd);
        aeropuerto.agregarHangar(hm);
        aeropuerto.agregarHangar(hp);

        aeropuerto.agregaValidando(c1,hc);
        aeropuerto.agregaValidando(c2,hc);
        aeropuerto.agregaValidando(m2,hm);
        aeropuerto.agregaValidando(p3,hp);
        System.out.println();
        aeropuerto.recorrerHangares();

        aeropuerto.despegarAviones(hc);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();


        try (FileWriter writer = new FileWriter("C:\\Users\\Usuario\\IdeaProjects\\Java_UTN\\Java_UTN\\Aviones Genericos\\archivo.json")) {
            gson.toJson(aeropuerto, writer);
            writer.close();
            System.out.println("Archivo JSON creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo JSON: " + e.getMessage());
            e.printStackTrace();
        }


    }
}