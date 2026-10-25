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
    boton.addActionListener(e -> {

    	    String nombre = campoNombre.getText().trim();
    	    String apellido = campoApellido.getText().trim();
    	    String dniTexto = campoDNI.getText().trim();
    	    String direccion = campoDireccion.getText().trim();
    	    String tarjeta = campoTarjeta.getText().trim();

    	    // Comprobar que los campos estén completos
    	    if (nombre.isEmpty() || apellido.isEmpty()
    	            || dniTexto.isEmpty()
    	            || direccion.isEmpty() || tarjeta.isEmpty()) {

    	        JOptionPane.showMessageDialog(
    	                ventana,
    	                "Complete todos los campos."
    	        );
    	        return;
    	    }

    	    try {
    	        // Convertir el DNI a entero
    	        int dni = Integer.parseInt(dniTexto);

    	        // Crear el objeto Cliente
    	        Cliente cliente = new Cliente(
    	                nombre,
    	                apellido,
    	                dni,
    	                direccion,
    	                tarjeta
    	        );

    	        // Sucursales de ejemplo: reemplazar por las reales
    	        List<Sucursal> sucursales = Arrays.asList(
    	                new Sucursal(
    	                        "Sucursal Centro",
    	                        "Salta",
    	                        "Salta",
    	                        "Dirección ficticia 1"
    	                ),
    	                new Sucursal(
    	                        "Sucursal Norte",
    	                        "Salta",
    	                        "Salta",
    	                        "Dirección ficticia 2"
    	                )
    	        );

    	        // Abrir la segunda ventana
    	        VentanaAlquiler nuevaVentana =
    	                new VentanaAlquiler(cliente, sucursales);

    	        nuevaVentana.setVisible(true);

    	        // Cerrar la primera ventana
    	        ventana.dispose();

    	    } catch (NumberFormatException ex) {

    	        JOptionPane.showMessageDialog(
    	                ventana,
    	                "El DNI debe contener un número válido."
    	        );
    	    }
    	});
}
