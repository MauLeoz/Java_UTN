import java.time.LocalDate;

public class Film {
    private int duracion;
    private int stock;
    private String clasificacion;
    private String titulo;
    private LocalDate fechaLanzamiento;
    private String genero;
    private String siglaPais;

    public Film() {
    }

    public Film(int duracion, int stock, String clasificacion, String titulo, LocalDate fechaLanzamiento, String genero, String siglaPais) {
        this.duracion = duracion;
        this.stock = stock;
        this.clasificacion = clasificacion;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.siglaPais = siglaPais;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSiglaPais() {
        return siglaPais;
    }

    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }

    @Override
    public String toString() {
        return "Film{" +
                "duracion=" + duracion +
                ", stock=" + stock +
                ", clasificacion='" + clasificacion + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", genero='" + genero + '\'' +
                ", siglaPais='" + siglaPais + '\'' +
                '}';
    }
}