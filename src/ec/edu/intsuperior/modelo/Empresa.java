package ec.edu.intsuperior.modelo;

public class Empresa {
    String nombreEmpresa;
    Empleado empleado;
    Cliente cliente;

    public Empresa() {
    }

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    
    
}
