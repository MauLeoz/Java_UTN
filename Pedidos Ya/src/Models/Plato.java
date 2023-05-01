package Models;

public class Plato {
    private String nombre;
    private int precio;

    public Plato() {
    }

    public Plato(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //region GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    //endregion


    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
