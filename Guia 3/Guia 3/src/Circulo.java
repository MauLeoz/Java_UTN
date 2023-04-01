public class Circulo {
    private double radio ;
    private String color;

    // Constructor vacio
    public Circulo() {
        this.radio = 1.0;
        this.color = "rojo";
    }

    // parámetro de radio
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "rojo";
    }

    //  parámetro de color
    public Circulo(String color) {
        this.radio = 1.0;
        this.color = color;
    }

    // Constructor con ambos parámetros
    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
