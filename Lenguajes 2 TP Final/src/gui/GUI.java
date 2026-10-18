package gui;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;



public class GUI {
    public GUI()  {
        // Operaciones con el cuadro de la ventana
        JFrame ventana = new JFrame("Pantalla de Inicio de Sesion");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.setLayout(new FlowLayout());
        

        //Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        

        // Etiquetas
        JLabel etiquetaNombre = new JLabel("Ingrese su nombre: ");
        panel.add(etiquetaNombre);

        etiquetaNombre.setLayout(new FlowLayout());
        JLabel etiquetaApellido = new JLabel("Ingrese su apellido: ");
        ventana.add(etiquetaApellido);

        JLabel etiquetaDNI = new JLabel("Ingrese su DNI: ");
        ventana.add(etiquetaDNI);

        JLabel etiquetaDireccion = new JLabel("Ingrese su direccion: ");
        ventana.add(etiquetaDireccion);

        JLabel etiquetaNroTarjetaCredito = new JLabel("Ingrese su numero de tarjeta de credito");
        ventana.add(etiquetaNroTarjetaCredito);
        


        // Campos de texto
        JTextField campoNombre = new JTextField(20);
        ventana.add(campoNombre);
        campoNombre.setLayout(new FlowLayout());

        JTextField campoApellido = new JTextField(20);
        ventana.add(campoApellido);
        campoApellido.setLayout(new FlowLayout());

        // Boton
        JButton boton = new JButton("Apretame!!!");
        panel.setLayout(new FlowLayout());
        ventana.add(boton);
        
        // Final
        ventana.setVisible(true);
    }
}
