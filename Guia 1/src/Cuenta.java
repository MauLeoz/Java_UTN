public class Cuenta {

    private int id;
    private String nombre;
    private double balance;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cuenta() {
    }

    public Cuenta(int id, String nombre, double balance) {
        this.id = id;
        this.nombre = nombre;
        this.balance = balance;
    }
    public double credito(double deposito){
        return getBalance() + deposito;
    }

    public double debito(double extraccion){
        if (getBalance() >= extraccion){
           return getBalance() - extraccion;
        }      else {
            System.out.println("La extraccion ingresada es mayor al saldo de la cuenta");
            return getBalance();
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
