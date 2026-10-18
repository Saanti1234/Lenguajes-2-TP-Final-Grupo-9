package Main;

import Clases_Importantes.Alquiler;
import Clases_Importantes.Cliente;
import Clases_Importantes.Sucursal;
import Clases_Importantes.Vehiculo;
import gui.GUI;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente Cliente_objeto = new Cliente("Ignacio", "Lachs", 45971853, "Larraboure 1171", 0000);
        Vehiculo Vehiculo_objeto = new Vehiculo("Automovil", "Chevrolet", "Celta", 5, 80, 25, 2500);
        Sucursal Sucursal_1 = new Sucursal("Sucursal 1", "Salta", "Salta capital", "Larraboure 1171");
        Sucursal Sucursal_2 = new Sucursal("Sucursal 2", "Salta", "Salta Capital", "Razgriz 2005");
        Alquiler Alquiler_objeto = new Alquiler(7, Cliente_objeto, Vehiculo_objeto, "No", Sucursal_1, Sucursal_2);


        

        
        System.out.println(Cliente.clienteLogin());
        //GUI test = new GUI();
    }
}
