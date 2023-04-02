public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private int salario;
    public Empleado() {
    }
    public Empleado(String dni, String nombre, String apellido, int salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getSalario(){
        return salario;
    }

    public void setDni(String dni){
        this.dni=dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setSalario(int salario){
        this.salario=salario;
    }

    public int aumentoSalario(int porcentaje){

        return salario = (salario/100)*porcentaje + salario;
    }

    public int salarioAnual(){
        salario = (salario*12);
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                '}';
    }


}
