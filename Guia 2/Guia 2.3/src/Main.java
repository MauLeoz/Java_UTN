public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente cliente = new Cliente(1001,"Leoz,Mauricio", 'M');
        System.out.println(cliente);

        Cuenta cuenta = new Cuenta(1524,10000,cliente);
        System.out.println(cuenta);

        cuenta.depositar(1251);
        System.out.println(cuenta);

        cuenta.extraer(8623);
        System.out.println(cuenta);

        cuenta.extraer(3000);
        System.out.println(cuenta);

        CuentaDeudora cuenta2 = new CuentaDeudora(125,5500,cliente);
        System.out.println(cuenta2);

        cuenta2.depositar(1251);
        System.out.println(cuenta2);

        cuenta2.extraer(3000);
        System.out.println(cuenta2);

        cuenta2.extraer(5751);
        System.out.println(cuenta2);
    }
}