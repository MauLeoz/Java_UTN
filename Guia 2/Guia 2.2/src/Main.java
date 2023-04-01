public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cliente cliente = new Cliente("Juan Perez","jperez@gmail.com",15);
        System.out.println(cliente);

        Factura factura = new Factura(128000,cliente);
        factura.imprimirMonto();
        System.out.println(factura);
        factura.aplicarDescuento();
        factura.imprimirMonto();
        System.out.println(factura);

        ItemVenta azucar = new ItemVenta("Azucar","Azucar comun",250);
        factura.agregarItemVenta(azucar);
        System.out.println(factura);

        ItemVenta leche = new ItemVenta("Leche","Leche Descremada",350);
        factura.agregarItemVenta(leche);
        System.out.println(factura);

    }
}