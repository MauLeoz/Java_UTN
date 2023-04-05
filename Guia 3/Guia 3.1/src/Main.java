public class Main {
    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();
        System.out.println(cilindro.toString());
        System.out.println("area " + cilindro.calcularArea());
        System.out.println("Volumen " + cilindro.calcularVolumen());

        Cilindro cilindro2 = new Cilindro(2,5);
        System.out.println(cilindro2.toString());
        System.out.println("area " + cilindro2.calcularArea());
        System.out.println("Volumen " + cilindro2.calcularVolumen());




        System.out.println("Hello world!");
    }
}