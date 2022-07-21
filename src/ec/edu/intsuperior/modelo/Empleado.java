package ec.edu.intsuperior.modelo;

public class Empleado extends Persona {
    int sueldoBruto;

    public Empleado() {
    }

    public Empleado(int sueldoBruto, String nombre, String apellido, int edad, String cedula) {
        super(nombre, apellido, edad, cedula);
        this.sueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override

    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    int calcularSalarioNeto(){
        return sueldoBruto-45;
    }
}
