package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class MenuCompra extends JFrame {

    private JComboBox<String> materialComboBox;
    private JTextField cantidadTextField;

    public MenuCompra() { // Cambia VentanaCompra a MenuCompra
        setTitle("Realizar Compra");
        setSize(425, 275);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo la ventana actual
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel cablesLabel = new JLabel("Cantidad de cables: 5 -- 15 C/U");
        cablesLabel.setBounds(20, 20, 300, 20);
        panel.add(cablesLabel);

        JLabel plasticoLabel = new JLabel("Cantidad de Plástico: 10 -- 30 C/U");
        plasticoLabel.setBounds(20, 50, 300, 20);
        panel.add(plasticoLabel);

        JLabel metalLabel = new JLabel("Cantidad de Metal: 3 -- 50 C/U");
        metalLabel.setBounds(20, 80, 300, 20);
        panel.add(metalLabel);

        JLabel materialSeleccionadoLabel = new JLabel("Seleccione el material:");
        materialSeleccionadoLabel.setBounds(20, 120, 150, 20);
        panel.add(materialSeleccionadoLabel);

        materialComboBox = new JComboBox<>();
        materialComboBox.addItem("Cables");
        materialComboBox.addItem("Plástico");
        materialComboBox.addItem("Metal");
        materialComboBox.setBounds(180, 120, 150, 30);
        panel.add(materialComboBox);

        JLabel cantidadLabel = new JLabel("Ingrese la cantidad:");
        cantidadLabel.setBounds(20, 160, 150, 20);
        panel.add(cantidadLabel);

        cantidadTextField = new JTextField();
        cantidadTextField.setBounds(180, 160, 150, 30);
        panel.add(cantidadTextField);

        JButton comprarButton = new JButton("Realizar compra");
        comprarButton.setBounds(50, 200, 150, 30);
        panel.add(comprarButton);

        JButton cancelarButton = new JButton("Cancelar compra");
        cancelarButton.setBounds(220, 200, 150, 30);
        panel.add(cancelarButton);

        add(panel);

        comprarButton.addActionListener((ActionEvent e) -> {
            String material = (String) materialComboBox.getSelectedItem();
            String cantidadText = cantidadTextField.getText();

            // Realizar la lógica de la compra aquí
            // Puedes obtener el material y la cantidad ingresados y calcular el precio total.

            dispose(); // Cierra la ventana actual
        });

        cancelarButton.addActionListener((ActionEvent e) -> {
            dispose(); // Cierra la ventana actual en caso de cancelación
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MenuCompra::new);
    }
}