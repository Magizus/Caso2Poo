
package gui;

import javax.swing.*;


public class MenuSede extends JFrame {

    

    public MenuSede() {
        setTitle("Sede 1");
        setSize(500, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Texto sobre la capacidad total del almacén
        JLabel capacidadLabel = new JLabel("La capacidad total es de: 60 kg");
        capacidadLabel.setBounds(50, 70, 400, 30);
        panel.add(capacidadLabel);

        // Texto sobre el espacio restante en el almacén
        JLabel espacioLabel = new JLabel("La cantidad de espacio que queda en el almacén es de: 4kg");
        espacioLabel.setBounds(50, 110, 400, 30);
        panel.add(espacioLabel);

        JLabel label = new JLabel("La cantidad de materiales recuperados es de:");
        label.setBounds(50, 150, 300, 30);
        panel.add(label);


        // Botón de volver
        JButton volverButton = new JButton("Volver");
        volverButton.setBounds(50, 450, 150, 68);
        panel.add(volverButton);

        // Botón "Comprar" entre "Volver" e "Ingresar"


        add(panel);

       
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuSede::new);
    }
}
