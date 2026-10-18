package Clases_Importantes;
public class Alquiler {
    private int duracion; // Duracion del alquiler en dias
    private Cliente cliente; // Nombre del cliente
    private Vehiculo vehiculo; // Vehiculo que alquila el cliente
    private int garantia; // Monto de la garantia
    private int precio; // Valor a pagar cuando se devuelva el vehiculo
    private String huboDaño; // El vehiculo fue dañado? (No se si hacerlo de tipo boolean o string. Por ahora lo dejo como String)
    private Sucursal SucursalRetiro; // Sucursal de retiro
    private Sucursal SucursalDevolucion; // Sucursal de devolucion

    // Constructor

    public Alquiler(int duracion, Cliente cliente, Vehiculo vehiculo, String huboDaño,
            Sucursal sucursalRetiro, Sucursal sucursalDevolucion) {
        this.duracion = duracion;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.huboDaño = huboDaño;
        this.SucursalRetiro = sucursalRetiro;
        this.SucursalDevolucion = sucursalDevolucion;
    }

    // Getters y Seters

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getHuboDaño() {
        return huboDaño;
    }
    public void setHuboDaño(String huboDaño) {
        this.huboDaño = huboDaño;
    }
    public Sucursal getSucursalRetiro() {
        return SucursalRetiro;
    }
    public void setSucursalRetiro(Sucursal sucursalRetiro) {
        SucursalRetiro = sucursalRetiro;
    }
    public Sucursal getSucursalDevolucion() {
        return SucursalDevolucion;
    }
    public void setSucursalDevolucion(Sucursal sucursalDevolucion) {
        SucursalDevolucion = sucursalDevolucion;
    }

    // Metodos
    
    public int calcularPrecio() { //La formula es DIAS DE ALQUILER x TARIFA DIARIA
       int precio = duracion * vehiculo.getTarifaDiaria();
       return precio;
    }

}
