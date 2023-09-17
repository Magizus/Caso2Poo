package gui;


import javax.swing.JButton;
import javax.swing.JFrame;


public class Interfaz extends JFrame {

    public void MenuPrincipal() {
        setTitle("Menu inicial");
        setSize(900, 900);//ancho,alto
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
        
            // Crea un nuevo botón con el texto "Sede"
        JButton Sede1 = new JButton("Sede 1");
        JButton Sede2 = new JButton("Sede 2");
        JButton Sede3 = new JButton("Sede 3");

        // Establece la ubicación y el tamaño del botón
        Sede1.setBounds(77, 750, 174, 68); // Cambia estos valores según tus necesidades
        Sede2.setBounds(351, 750, 174, 68);
        Sede3.setBounds(625, 750, 174, 68);
        
        // Agrega el botón a la ventana
        add(Sede1);
        add(Sede2);
        add(Sede3);
 
   
    }

    public static void main(String[] args) {
        Interfaz miVentana = new Interfaz();
        miVentana.MenuPrincipal();
    }
}
