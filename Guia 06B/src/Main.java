import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Cree un programa que solicite al usuario que ingrese una cadena de texto y
        //luego cuente el número de veces que cada carácter aparece en la cadena.
        //Utilice un HashMap para almacenar los resultados y muestre el mapa al
        //usuario al final.

       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String input = scanner.nextLine();

        Map<Character,Integer> charCounts = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }

        System.out.println("Conteo de caracteres:");
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        */

        //Escriba un programa que genere una lista de números aleatorios, la ordene y
        //luego elimine los duplicados. Utilice un HashSet para almacenar los números
        //únicos y un ArrayList para la lista original.

       /*
        ArrayList<Integer> numeros = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randomNum = rand.nextInt(15); //Genera un número aleatorio entre 0 y 99
            numeros.add(randomNum);
        }

        System.out.println("Antes de ordenar:");
        System.out.println(numeros);
        System.out.println("Despues de ordenar:");
        Collections.sort(numeros, Comparator.naturalOrder());
        System.out.println(numeros);

        ArrayList<Integer> numerosSinDuplicados = (ArrayList<Integer>) numeros.stream().distinct().collect(Collectors.toList());
        System.out.println(numerosSinDuplicados);

        HashSet<Integer>  numerosUnicos= new HashSet<>();
        numerosUnicos.addAll(numerosSinDuplicados);
        System.out.println(numerosUnicos);

        */

        // Escriba un programa que solicite al usuario que ingrese una lista de nombres
        // de personas y sus edades, y luego ordene la lista por edad. Utilice un
        // TreeMap para almacenar los nombres y las edades.

     /*   int opcion = 0;
        TreeMap< Integer,String> edades = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("Ingrese un nombre.");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese  una edad.");
            Integer edad = scanner.nextInt();

            edades.put(edad,nombre);
            System.out.println("0 para seguir");
            opcion= scanner.nextInt();
            scanner.nextLine();

        }while (opcion==0);

        for (Map.Entry<Integer, String> entry : edades.entrySet()) {
            System.out.println("Edad: " + entry.getKey() + ", Nombre: " + entry.getValue());
        }
        */

       /* Escriba un programa que lea una lista de números enteros y luego calcule la
        suma y el promedio. Utilice un ArrayList para almacenar los números y una
        HashMap para calcular la frecuencia de cada número. (Averiguar cómo hacer
        una suma de elementos de una lista con streams). Stream es un flujo de
        datos que a través de métodos concatenados podemos filtrarlos, modificarlos
        y realizar distintas operaciones que devuelvan un flujo totalmente diferente.*/

       /* Scanner scanner = new Scanner(System.in);

        // Leer lista de números enteros
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("Ingrese una lista de números separados por espacios: ");
        String[] numerosString = scanner.nextLine().split(" ");
        for (String numeroString : numerosString) {
            numeros.add(Integer.parseInt(numeroString));
        }

        // Calcular suma y promedio usando streams
        int suma = numeros.stream().mapToInt(Integer::intValue).sum();
        double promedio = numeros.stream().collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        // Calcular frecuencia de los números usando HashMap
        Map<Integer, Integer> frecuenciaNumeros = new HashMap<>();
        for (int numero : numeros) {
            if (frecuenciaNumeros.containsKey(numero)) {
                frecuenciaNumeros.put(numero, frecuenciaNumeros.get(numero) + 1);
            } else {
                frecuenciaNumeros.put(numero, 1);
            }
        }

        // Imprimir frecuencia de los números
        System.out.println("Frecuencia de los números:");
        for (Map.Entry<Integer, Integer> entry : frecuenciaNumeros.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        */

        //Escriba un programa que lea una lista de números enteros y luego ordene la
        //lista en orden ascendente y descendente. Utilice un TreeSet para almacenar
        //los números y mostrarlos en orden ascendente y descendente.

        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>(); // TreeSet para mantener los números ordenados

        // Leer lista de números enteros
        System.out.print("Ingrese una lista de números separados por espacios: ");
        String[] numerosString = scanner.nextLine().split(" ");
        for (String numeroString : numerosString) {
            numeros.add(Integer.parseInt(numeroString)); // Agregar cada número al TreeSet
        }

        // Imprimir lista ordenada en orden ascendente
        System.out.println("Lista en orden ascendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Imprimir lista ordenada en orden descendente
        System.out.println("Lista en orden descendente:");
        for (int numero : numeros.descendingSet()) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

}