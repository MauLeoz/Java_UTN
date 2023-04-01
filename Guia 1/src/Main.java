public class Main {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        double area = r1.calcularArea();
        double perimetro = r1.calcularPerimetro();

        System.out.println(area);
        System.out.println(perimetro);

        Rectangulo r2 = new Rectangulo(4,2);
        double area2 = r2.calcularArea();
        double perimetro2 = r2.calcularPerimetro();
        System.out.println(area2);
        System.out.println("Perimetro 2 :" + perimetro2);


        Empleado empleado1 = new Empleado("23456345","Carlos","Gutierrez",25000);
        Empleado empleado2 = new Empleado("34234123","Ana","Sanchez",27500 );

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        System.out.println(empleado1.getSalario());
        empleado1.aumentoSalario(15);
        System.out.println(empleado1.getSalario());
        System.out.println(empleado1.salarioAnual());

        ItemDeVenta item = new ItemDeVenta(128,"Escritorio",12,20012.55);
        System.out.println(item.toString());

        System.out.println(item.precioTotal());


        Cuenta cuenta1 = new Cuenta(10,"Mauricio Leoz", 50000);
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.credito(125000));
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.debito(89500));
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.debito(150000));
        System.out.println(cuenta1.toString());


    }


}