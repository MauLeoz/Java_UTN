public class Cilindro extends Circulo {
    private double altura;

    //sin parametros
    public Cilindro() {
        this.altura = 1.0;
    }

    //solo parametro altura
    public Cilindro(double altura) {
        this.altura = altura;
    }

    //parametro radio y altura
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    //parametro color y altura
    public Cilindro(String color, double altura) {
        super(color);
        this.altura = altura;
    }

    //con todos los parametros
    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolumen(){
        return super.calcularArea() * getAltura();
    }

    @Override
    public double calcularArea() {
        return 2*Math.PI*super.getRadio()*getAltura() + 2 * super.calcularArea();
    }

    @Override
    public String toString() {
        return "Subclase de " +
                super.toString() +
                " + altura=" + altura +
                '}';
    }
}
