public class Cuadrado extends Rectangulo{

    public Cuadrado() {
    }

    public Cuadrado(String color, boolean tieneColor, int lado) {
        super(color, tieneColor, lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{} " + super.toString();
    }

    @Override
    public double calcularArea() {
        return super.calcularArea();
    }

    @Override
    public double calcularPerimetro() {
        return super.calcularPerimetro();
    }

}
