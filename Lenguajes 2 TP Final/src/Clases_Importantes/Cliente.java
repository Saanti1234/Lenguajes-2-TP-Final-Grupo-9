
package Clases_Importantes;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Cliente {
    private String nombre;
    private String apellido;
    private String DNI;
    private String direccion;
    private int nroTarjetaCredito; //El sistema solo acepta tarjeta de credito!
    
    // Constructor

    public Cliente(String nombre, String apellido, int DNI, String direccion, String nroTarjetaCredito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.nroTarjetaCredito = nroTarjetaCredito;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDNI() {
        return DNI;
    }
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNroTarjetaCredito() {
        return nroTarjetaCredito;
    }
    public void setNroTarjetaCredito(String nroTarjetaCredito) {
        this.nroTarjetaCredito = nroTarjetaCredito;
    }
    @Override 
    public String toString() {
        return ("Nombre: " + nombre + "\n" + "Apellido: " +  apellido + "\n" + "DNI: " + DNI + "\n" + "Direccion: " + direccion + "\n" + "Numero de tarjeta de credito: " + nroTarjetaCredito);
    }

    // Metodos

    public static Cliente clienteLogin() {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = Scanner.nextLine();

            System.out.println("Ingrese su apellido: ");
            String apellido = Scanner.nextLine();

            System.out.println("Ingrese su DNI: ");
            int DNI = Integer.parseInt(Scanner.nextLine());

            System.out.println("Ingrese su direccion: ");
            String direccion = Scanner.nextLine();

            System.out.println("Ingrese su numero de tarjeta de credito (NO ESCRIBA ESPACIOS!): ");
            int nroTarjetaCredito = Integer.parseInt(Scanner.nextLine());

            return new Cliente(nombre, apellido, DNI, direccion, nroTarjetaCredito);
        } 
        }
    } 
    

