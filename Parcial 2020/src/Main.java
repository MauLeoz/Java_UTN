import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Acustica a = new Acustica(12500,"Gibson","Caoba");
        Electrica e = new Electrica(25000,"Gibson 2 ","Les Paul");
        Bajo b = new Bajo(29000,"Patito","Modelo");
        Bateria bat = new Bateria("No se",3,4);

        List<InstrumentoMusical> listaInstrumentos = new ArrayList<>();

        listaInstrumentos.add(a);
        listaInstrumentos.add(e);
        listaInstrumentos.add(b);
        listaInstrumentos.add(bat);
        System.out.println();

        for (InstrumentoMusical i: listaInstrumentos){
            System.out.println(i.toString());
        }
        System.out.println();

        b.SonidoAmplificado();
        e.SonidoAmplificado();
        System.out.println();

        System.out.println(a.getPrecio());
        a.aplicarAumento(100);
        System.out.println(a.getPrecio());
        System.out.println();

        for (InstrumentoMusical i : listaInstrumentos) {
            switch (i.getClass().getSimpleName()) {
                case "Acustica":
                    System.out.println(i.getPrecio());
                    i.aplicarAumento(10);
                    System.out.println(i.getPrecio());
                    System.out.println();
                    break;
                case "Electrica":
                    System.out.println(i.getPrecio());
                    i.aplicarAumento(5);
                    System.out.println(i.getPrecio());
                    System.out.println();
                    break;
                case "Bajo":
                    System.out.println(i.getPrecio());
                    i.aplicarAumento(20);
                    System.out.println(i.getPrecio());
                    System.out.println();
                    break;
                case "Bateria":
                    System.out.println(i.getPrecio());
                    i.aplicarAumento(15);
                    System.out.println(i.getPrecio());
                    break;
                default:
                    break;
            }
        }

    }
}