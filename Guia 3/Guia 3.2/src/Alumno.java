public class Alumno extends Persona {
    private Integer anioIngreso;
    private double cuota;
    private String carrera;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellido, String email, String direccion, Integer anioIngreso, double cuota, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                super.toString() +
                "anioIngreso=" + anioIngreso +
                ", cuota=" + cuota +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
