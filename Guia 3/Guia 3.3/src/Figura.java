public abstract class Figura {
    private String color;
    private boolean tieneColor;

    public Figura() {
    }

    public Figura(String color, boolean tieneColor) {
        this.color = color;
        this.tieneColor = tieneColor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTieneColor() {
        return tieneColor;
    }

    public void setTieneColor(boolean tieneColor) {
        this.tieneColor = tieneColor;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", tieneColor=" + tieneColor +
                '}';
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

}
