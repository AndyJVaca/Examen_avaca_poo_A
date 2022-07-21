package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Empresa;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Empresa e2 = new Empresa();
        Cliente c1 = new Cliente();
        Empleado e1 = new Empleado();
        
        
        e2.setNombreEmpresa("BRANDY - SERVICIO AL HOGAR");
        
        e1.setNombre("Jorge");
        e1.setApellido("Carlos");
        
        System.out.println(e2.getNombreEmpresa());
        
        System.out.println("======================");

        System.out.print("Ingrese el nombre del cliente: ");
        p1.setNombre(leer.nextLine());
        System.out.print("Ingrese el apellido del cliente: ");
        p1.setApellido(leer.nextLine());
        System.out.print("Ingrese la cédula del cliente: ");
        p1.setCedula(leer.nextLine());
        System.out.print("Edad del cliente: ");
        p1.setEdad(leer.nextInt());
        
        System.out.println("");
        
        System.out.println(e2.getNombreEmpresa());
        System.out.println("==========================");
        
        System.out.println("Nombre del Cliente: "+p1.getNombre()+" "+p1.getApellido()+"\n"
                + "identificación del Cliente: "+p1.getCedula()+"\n"
                        + "edad del Cliente: "+p1.getEdad()+"\n"
                                + "Atendido por: "+e1.getNombre()+" "+e1.getApellido());
        
    }
}
