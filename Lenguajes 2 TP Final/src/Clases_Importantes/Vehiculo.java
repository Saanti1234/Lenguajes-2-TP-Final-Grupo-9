package Clases_Importantes;
public class Vehiculo {
private String tipo; // camioneta, automovil, motocicleta
private String marca; 
private String modelo;
private int tarifaDiaria; // Camionetas: $1000, Automoviles: $500, Motocicletas: $300
private int montoGarantia;
private int nroAsientos;
private int capacidadTanque; // capacidad del tanque de nafta

// Constructor

public Vehiculo(String tipo, String marca, String modelo, int nroAsientos, int capacidadTanque, int tarifaDiaria, int montoGarantia) {
    this.tipo = tipo;
    this.marca = marca;
    this.modelo = modelo;
    this.nroAsientos = nroAsientos;
    this.capacidadTanque = capacidadTanque;
    this.tarifaDiaria = tarifaDiaria;
    this.montoGarantia = montoGarantia;
}

// Getters y Setters

public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public int getNroAsientos() {
    return nroAsientos;
}
public void setNroAsientos(int nroAsientos) {
    this.nroAsientos = nroAsientos;
}
public int getCapacidadTanque() {
    return capacidadTanque;
}
public void setCapacidadTanque(int capacidadTanque) {
    this.capacidadTanque = capacidadTanque;
}
public int getTarifaDiaria() {
    return tarifaDiaria;
}

public void setTarifaDiaria(int tarifaDiaria) {
    this.tarifaDiaria = tarifaDiaria;
}
public int getMontoGarantia() {
    return montoGarantia;
}

public void setMontoGarantia(int montoGarantia) {
    this.montoGarantia = montoGarantia;
}

}


