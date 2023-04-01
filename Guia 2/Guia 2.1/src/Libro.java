public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;
    private Autor autor2;

    public Libro(String titulo, double precio, int stock, Autor autor, Autor autor2) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
        this.autor2 = autor2;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor2() {
        return autor2;
    }

    public void setAutor2(Autor autor2) {
        this.autor2 = autor2;
    }

    //“El libro, {título} de {nombre del autor}. Se vende a {precio} pesos.”

    public void imprimirMensaje(){
        System.out.println("El libro "+ this.getTitulo() + ", de " + this.autor.getApellido() +" "+ this.autor.getNombre() +" y de "+ this.autor2.getApellido() +" "+ this.autor2.getNombre() +" se vende a " + this.getPrecio() + " pesos." );
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor=" + autor +
                '}';
    }
}
