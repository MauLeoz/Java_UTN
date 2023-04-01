import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nombre;
    private String mail;
    private double descuento;

    public Cliente(String nombre, String mail, double descuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.mail = mail;
        this.descuento = descuento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                ", descuento=" + descuento +
                '}';
    }
}
