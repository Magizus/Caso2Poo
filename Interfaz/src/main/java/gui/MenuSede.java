
package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MenuSede extends JFrame {

    private JTextField kilosTextField;

    public MenuSede() {
        setTitle("Sede 1");
        setSize(650, 500);
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
        JLabel espacioLabel = new JLabel("La cantidad de espacio que queda en el almacén es de: 4");
        espacioLabel.setBounds(50, 110, 400, 30);
        panel.add(espacioLabel);

        JLabel label = new JLabel("Ingrese la cantidad de kilos de reciclaje:");
        label.setBounds(50, 150, 300, 30);
        panel.add(label);

        kilosTextField = new JTextField();
        kilosTextField.setBounds(325, 150, 200, 30);
        panel.add(kilosTextField);

        // Botón de volver
        JButton volverButton = new JButton("Volver");
        volverButton.setBounds(40, 350, 150, 68);
        panel.add(volverButton);

        // Botón "Comprar" entre "Volver" e "Ingresar"
        JButton comprarButton = new JButton("Comprar");
        comprarButton.setBounds(250, 350, 150, 68);
        panel.add(comprarButton);

        JButton ingresarButton = new JButton("Ingresar");
        ingresarButton.setBounds(460, 350, 150, 68);
        panel.add(ingresarButton);

        add(panel);

        // Manejar el evento del botón "Ingresar"
        ingresarButton.addActionListener((ActionEvent e) -> {
            String input = kilosTextField.getText();
            try {
                double kilos = Double.parseDouble(input);
                // Aquí puedes hacer algo con el valor de "kilos", como mostrarlo en la GUI
                // Por ejemplo, puedes crear un JLabel y establecer su texto con el valor de "kilos".
            } catch (NumberFormatException ex) {
                // Manejo de error si el usuario no ingresa un número válido
                JOptionPane.showMessageDialog(MenuSede.this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Manejar el evento del botón "Volver" (puedes implementar la acción deseada aquí)

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuSede::new);
    }
}
