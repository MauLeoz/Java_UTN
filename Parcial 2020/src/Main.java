import Models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Acustica a = new Acustica(12500,"Gibson","Caoba");
        Electrica e = new Electrica(25000,"Gibson 2 ","Les Paul");
        Bajo b = new Bajo(29000,"Patito","Modelo");
        Bateria bat = new Bateria("No se",3,4);

        List<InstrumentoMusical> listaInstrumentos = new ArrayList<InstrumentoMusical>();

        listaInstrumentos.add(a);
        listaInstrumentos.add(e);
        listaInstrumentos.add(b);
        listaInstrumentos.add(bat);


    }
}