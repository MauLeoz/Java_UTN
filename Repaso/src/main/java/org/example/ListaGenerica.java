package org.example;

import java.util.ArrayList;

public class ListaGenerica<T> {
    private ArrayList<T> elementos;

    public ListaGenerica() {
        elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public void eliminar(int posicion) {
        if (posicion >= 0 && posicion < elementos.size()) {
            elementos.remove(posicion);
        } else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }

    public T recuperar(int posicion) {
        if (posicion >= 0 && posicion < elementos.size()) {
            return elementos.get(posicion);
        } else {
            throw new IndexOutOfBoundsException("Posición inválida");
        }
    }

    public int size() {
        return elementos.size();
    }
}
