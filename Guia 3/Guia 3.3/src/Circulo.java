public class Circulo extends Figura {
    private double radio;

    public Circulo() {
    }

    public Circulo(String color, boolean tieneColor, double radio) {
        super(color, tieneColor);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (Math.PI)*(Math.pow(getRadio(),2));
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*getRadio();
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                "} " + super.toString();
    }
}
