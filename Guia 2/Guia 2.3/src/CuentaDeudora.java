public class CuentaDeudora {
    private int id;
    private double amount;
    private Cliente cliente;

    public CuentaDeudora(int id, double amount, Cliente cliente) {
        this.id = id;
        this.amount = amount;
        this.cliente = cliente;
    }

    public CuentaDeudora() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double monto){
        setAmount(this.getAmount()+ monto);
    }
    public void extraer(double monto){
        if (getAmount()-monto>=-2000) {
            setAmount(this.getAmount() - monto);
        }else{
            System.out.println("No haya fondos suficientes para esa operacion");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "id=" + id +
                ", amount=" + amount +
                ", cliente=" + cliente +
                '}';
    }
}
