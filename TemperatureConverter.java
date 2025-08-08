import javax.swing.*;
import java.awt.*;

public class TemperatureConverter extends JFrame {

    public TemperatureConverter() {
        setTitle("Stage 1 - Temperature Converter");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1, 10, 10)); 

        
        JTextField inputField = new JTextField();

        
        JComboBox<String> fromUnit = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"});
        JComboBox<String> toUnit = new JComboBox<>(new String[]{"Celsius", "Fahrenheit", "Kelvin"});

        
        JButton convertButton = new JButton("Convert");
        JLabel resultLabel = new JLabel("Result: ", JLabel.CENTER);

       
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(new JLabel("Enter Temperature:"), BorderLayout.NORTH);
        inputPanel.add(inputField, BorderLayout.CENTER);

        
        JPanel unitPanel = new JPanel(new GridLayout(1, 4));
        unitPanel.add(new JLabel("From:"));
        unitPanel.add(fromUnit);
        unitPanel.add(new JLabel("To:"));
        unitPanel.add(toUnit);

        
        add(inputPanel);
        add(unitPanel);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TemperatureConverter::new);
    }
}
