import java.time.LocalDate;
public class Alquiler {
    private static int i = 1;
    private int id;
    private Film film;
    private Cliente cliente;
    private LocalDate prestamo;
    private LocalDate devolucion;

    public Alquiler() {
    }

    public Alquiler(Film film, Cliente cliente, LocalDate prestamo) {
        this.id = i++;
        this.film = film;
        this.cliente = cliente;
        this.prestamo = prestamo;
        this.devolucion = prestamo.plusDays(2);
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Alquiler.i = i;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(LocalDate prestamo) {
        this.prestamo = prestamo;
    }

    public LocalDate getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(LocalDate devolucion) {
        this.devolucion = devolucion;
    }
}
