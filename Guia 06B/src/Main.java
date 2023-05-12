import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cree un programa que solicite al usuario que ingrese una cadena de texto y
        //luego cuente el número de veces que cada carácter aparece en la cadena.
        //Utilice un HashMap para almacenar los resultados y muestre el mapa al
        //usuario al final.

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
    }

}