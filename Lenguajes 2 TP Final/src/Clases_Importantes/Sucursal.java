package Clases_Importantes;

public class Sucursal {
    private String nombre; // "sucursal 1", "sucursal 2", etc
    private String provincia; // En que provincia esta la sucursal
    private String ciudad; // En que ciudad esta la sucursal
    private String direccion; // Alvear 1171

    // Constructor

    public Sucursal(String nombre, String provincia, String ciudad, String direccion) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
