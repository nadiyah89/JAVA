import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UnitConverter extends JFrame implements ActionListener {
    JTextField inputField;
    JComboBox<String> fromUnit, toUnit;
    JButton convertButton;
    JLabel resultLabel;

    // Define some units
    String[] lengthUnits = {"Meters", "Kilometers", "Centimeters"};
    String[] weightUnits = {"Grams", "Kilograms"};

    public UnitConverter() {
        // Frame setup
        setTitle("Unit Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel inputLabel = new JLabel("Enter value:");
        inputField = new JTextField();

        JLabel fromLabel = new JLabel("From:");
        fromUnit = new JComboBox<>(new String[]{"Meters", "Kilometers", "Centimeters", "Grams", "Kilograms"});

        JLabel toLabel = new JLabel("To:");
        toUnit = new JComboBox<>(new String[]{"Meters", "Kilometers", "Centimeters", "Grams", "Kilograms"});

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        resultLabel = new JLabel("Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Adding components
        add(inputLabel);
        add(inputField);
        add(fromLabel);
        add(fromUnit);
        add(toLabel);
        add(toUnit);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double value = Double.parseDouble(inputField.getText());
            String from = (String) fromUnit.getSelectedItem();
            String to = (String) toUnit.getSelectedItem();
            double result = convert(value, from, to);

            resultLabel.setText("Result: " + String.format("%.4f", result) + " " + to);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private double convert(double value, String from, String to) {
        // Length conversions
        if (from.equals("Meters") && to.equals("Kilometers")) return value / 1000;
        if (from.equals("Kilometers") && to.equals("Meters")) return value * 1000;
        if (from.equals("Meters") && to.equals("Centimeters")) return value * 100;
        if (from.equals("Centimeters") && to.equals("Meters")) return value / 100;
        if (from.equals("Kilometers") && to.equals("Centimeters")) return value * 100000;
        if (from.equals("Centimeters") && to.equals("Kilometers")) return value / 100000;

        // Weight conversions
        if (from.equals("Grams") && to.equals("Kilograms")) return value / 1000;
        if (from.equals("Kilograms") && to.equals("Grams")) return value * 1000;

        // Same unit conversion
        if (from.equals(to)) return value;

        // Invalid conversion
        throw new IllegalArgumentException("Invalid conversion: " + from + " to " + to);
    }

    public static void main(String[] args) {
        new UnitConverter();
    }
}

