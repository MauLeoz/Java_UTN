import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //region EJERCICIO 1

        /*
        Rectangulo r2 = new Rectangulo(4,2);
        System.out.println("El rectangulo tiede una altura: "+r2.getAlto()+" y anchura de: "+r2.getAncho());

        double area = r2.calcularArea();
        double perimetro = r2.calcularPerimetro();
        System.out.println("El rectangulo tiene un area de: "+ area);
        System.out.println("El rectangulo tiene un perimetro de: "+ perimetro);

        r2.setAlto(6);
        r2.setAncho(10);
        area = r2.calcularArea();
        perimetro = r2.calcularPerimetro();
        System.out.println("El rectangulo tiene un area de: "+ area);
        System.out.println("El rectangulo tiene un perimetro de: "+ perimetro);


        Rectangulo r1 = new Rectangulo();
        area = r1.calcularArea();
        perimetro = r1.calcularPerimetro();

        System.out.println("El rectangulo tiene un area de: "+ area);
        System.out.println("El rectangulo tiene un perimetro de: "+ perimetro);

         */

        //endregion

        //region EJERCICIO 2

        /*
        Empleado empleado1 = new Empleado("23456345","Carlos","Gutierrez",25000);
        Empleado empleado2 = new Empleado("34234123","Ana","Sanchez",27500 );

        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());

        empleado1.aumentoSalario(15);
        System.out.println(empleado1.getSalario());
        System.out.println(empleado1.salarioAnual());

         */

        //endregion

        //region EJERCICIO 3

        /*
        ItemDeVenta item = new ItemDeVenta(128,"Escritorio",12,20012.56);
        System.out.println(item.toString());

        System.out.println(item.precioTotal());

         */

        //endregion

        //region EJERCICIO 4

        Cuenta cuenta1 = new Cuenta(10,"Mauricio Leoz", 15000);
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.credito(2500));
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.debito(1500));
        System.out.println(cuenta1.toString());

        cuenta1.setBalance(cuenta1.debito(30000));
        System.out.println(cuenta1.toString());

        //endregion

        //region EJERCICIO 5

        Hora horaActual = new Hora(22, 30, 45);
        horaActual.imprimirHora();
        horaActual.avanzarSegundo().imprimirHora();
        horaActual.retrocederSegundo().imprimirHora();
        horaActual.setHora(23);
        horaActual.setMinuto(59);
        horaActual.setSegundo(59);
        horaActual.imprimirHora();
        horaActual.avanzarSegundo().imprimirHora();
        horaActual.retrocederSegundo().imprimirHora();



        //endregion


    }


}