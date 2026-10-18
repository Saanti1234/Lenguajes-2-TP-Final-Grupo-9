package Logica;
import java.util.Scanner;
import Clases_Importantes.Alquiler;
import Clases_Importantes.Cliente;
import Clases_Importantes.Vehiculo;




public class Logica {
    // Metodo para calcular el precio del alquiler
    public int calcularPrecio(Alquiler alquiler, Vehiculo vehiculo) { //La formula es DIAS DE ALQUILER x TARIFA DIARIA
       int precio = alquiler.getDuracion() * vehiculo.getTarifaDiaria();
       return precio;


    }
}
