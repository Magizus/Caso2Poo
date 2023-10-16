package gui;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Interfaz extends JFrame {
    public Interfaz() {
        setTitle("Menu");
        setSize(600, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JButton Sede1 = new JButton("Sede 1");
        JButton Sede2 = new JButton("Sede 2");

        Sede1.setBounds(77, 350, 174, 68);
        Sede2.setBounds(351, 350, 174, 68);

        add(Sede1);
        add(Sede2);

        // Agregar ActionListener al botón "Sede 1"
        Sede1.addActionListener(e -> {
            MenuSede sede1 = new MenuSede();
            sede1.setTitle("Sede 1");
            sede1.setVisible(true);
        });
    }

    public static void main(String[] args) {
        Interfaz miVentana = new Interfaz();
    }
}
