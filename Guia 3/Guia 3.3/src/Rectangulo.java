public class Rectangulo extends Figura {
    private int altura;
    private int base;

    public Rectangulo() {
    }

    public Rectangulo(String color, boolean tieneColor, int altura, int base) {
        super(color, tieneColor);
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return getBase()*getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return (2*getBase())+(2*getAltura());
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                ", base=" + base +
                "} " + super.toString();
    }
}
