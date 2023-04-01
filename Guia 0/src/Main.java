import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //region EJERCICIO 1

        /*Programa java que realice lo siguiente: declarar una variable N de tipo int, una
        variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
        A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
        diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
        variable C.*/

       /*
        int N;
        double A;
        char C;

        N = 10;
        A = 425423;
        C = '@';


        System.out.println(N);
        System.out.println(A);
        System.out.println(C);

        System.out.println(N+A);
        System.out.println(A-N);
        System.out.println((int)C);

       */
        //endregion

        //region EJERCICIO 2

        /*Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
        variables N y M de tipo double y asigna a cada una un valor. A continuación mostrar
        por pantalla una serie de operaciones entre ellas.*/

       /*
        int x,y;
        double o,m;
        x=25;
        y=12;
        o=5421;
        m=13475;

        System.out.println("Ejercicio 2\n");

        System.out.println(x*y);
        System.out.println(m/x);
        System.out.println(o-x);

        */
        //endregion

        //region EJERCICIO 3

        /*Programa Java que declare una variable entera N, asignarle un valor. A continuación
        escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
        valor a 3, duplicar su valor.*/


        /*
        int q = 33;

        q+=77;
        q=3;
        q*=2;

        System.out.println("Ejercicio 3\n");
        System.out.println(q);

         */

        //endregion

        //region EJERCICIO 4

        /*Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
        cada una. A continuación realiza las instrucciones necesarias para que: B tome el
        valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/

        /*
        int a,b,c,d;
        a=11;
        b=4;
        c=85;
        d=3;

        int aux;

        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

         */

        //endregion

        //region EJERCICIO 5

        /*Programa Java que declare una variable A de tipo entero, asignarle un valor. A
        continuación mostrar un mensaje indicando si A es par o impar.*/

        /*
        int a = 9;

        if (a%2==0)
            System.out.println("es par");
        else
            System.out.println("es impar");

         */


        //endregion

        //region EJERCICIO 6

        /*Programa Java que declare una variable B de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.*/

        /*
        int b = 0;

        System.out.println("Ejercicio 6\n");

        if (b < 0)
            System.out.println("Es negativo");
        else if (b>0)
            System.out.println("Es positivo");
        else
            System.out.println("es cero");

         */


        //endregion

        //region EJERCICIO 7

        /*Programa Java que declare una variable C de tipo entero y asignarle un valor. A
        continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
        100.*/

        /*
        int c = -135;

        if (c < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es positivo");
        }

        if (c%2==0){
            System.out.println("es par");}
        else{
            System.out.println("es impar");}

        if (c%5==0){
            System.out.println("es multiplo de 5");}
        else{
            System.out.println("no es multiplo de 5");}

        if (c%10==0){
            System.out.println("es multiplo de 10");}
        else{
            System.out.println("no es multiplo de 10");}

        if (c < 100){
            System.out.println("Es menor que 100");
        }else{
            System.out.println("Es mayor o igual a 100");
        }

         */

        //endregion

        //region EJERCICIO 8

        /*Programa Java que lea un nombre y muestre por pantalla:
        “Buenos días, {NOMBRE}”.*/

        String name;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca su nombre: ");
        name = teclado.nextLine();
        System.out.println("¡Hola " + name + "!");

        //endregion

        /*Programa Java que lea un número entero por teclado y calcule el doble y el triple de
        ese número y lo muestre por pantalla.*/
        /*System.out.println("Ejercicio 9\n");

        int num;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;

        System.out.println("Doble es "+ doble);
        System.out.println("Triple es "+ triple);*/

        /*Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
         centígrados.*/

        /*double centigrado;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        centigrado = leer.nextDouble();
        double farenheit = (centigrado* 9/5) + 32;

        System.out.println(centigrado +" grados centigrados son "+ farenheit + " grados farenheit");*/

        /*Programa que lee por teclado el valor del radio de una circunferencia, calcula y
        muestra por pantalla la longitud y el área de la circunferencia.*/

        /*double radio;
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = leer.nextDouble();
        double longitud;
        double area;

        longitud = 2*Math.PI*radio;
        area = Math.PI*Math.pow(radio,2);*/


        /*System.out.println("La longitud de la circunferencia con radio = " + radio + " es igual a "+ longitud + ",y el area es "+ area );*/

        /*Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/

        /*double velocidad;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduzca la velocidad (km/h): ");
        velocidad = input.nextDouble();
        double metroPorSegundo = velocidad/3.6;

        System.out.println(velocidad + " KM por hora equivalen a " + metroPorSegundo + " Metros por segundo");*/




























    }
}