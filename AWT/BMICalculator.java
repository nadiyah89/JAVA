import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculator extends JFrame implements ActionListener {
    JTextField weightField, heightField;
    JButton calculateButton;
    JLabel resultLabel;

    public BMICalculator() {
        // Frame setup
        setTitle("BMI Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Labels and fields
        JLabel weightLabel = new JLabel("Weight (pounds):");
        weightField = new JTextField();

        JLabel heightLabel = new JLabel("Height (inches):");
        heightField = new JTextField();

        calculateButton = new JButton("Calculate BMI");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("BMI Result: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add components
        add(weightLabel);
        add(weightField);
        add(heightLabel);
        add(heightField);
        add(new JLabel("")); // spacer
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());

            if (weight <= 0 || height <= 0) {
                JOptionPane.showMessageDialog(this, "Enter valid positive numbers!");
                return;
            }

            // BMI formula for pounds/inches
            double bmi = (703 * weight) / (height * height);
            bmi = Math.round(bmi * 10.0) / 10.0; // round to 1 decimal

            String category;
            if (bmi < 18.5) category = "Underweight";
            else if (bmi < 25.0) category = "Normal";
            else if (bmi < 30.0) category = "Overweight";
            else category = "Obese";

            resultLabel.setText("BMI: " + bmi + " (" + category + ")");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values!");
        }
    }

    public static void main(String[] args) {
        new BMICalculator();
    }
}
