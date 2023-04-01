public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Verde",true,4);
        Rectangulo rectangulo = new Rectangulo("Rojo",true,3,7);
        Cuadrado cuadrado = new Cuadrado("Azul",true,3);

        System.out.println(circulo.toString());
        System.out.println(rectangulo.toString());

        double areaCirculo=circulo.calcularArea();
        double areaRectangulo=rectangulo.calcularArea();
        double areaCuadrado=cuadrado.calcularArea();

        System.out.println(areaCirculo);
        System.out.println(areaRectangulo);
        System.out.println(areaCuadrado);

        System.out.println("Hello world!");
    }
}