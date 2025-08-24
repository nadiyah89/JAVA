import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterestCalculator extends JFrame implements ActionListener {
    JTextField principalField, rateField, timeField;
    JButton calculateButton, resetButton;
    JLabel resultLabel;

    public InterestCalculator() {
        // Frame setup
        setTitle("Simple Interest Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels & TextFields
        JLabel principalLabel = new JLabel("Principal Amount:");
        principalField = new JTextField();

        JLabel rateLabel = new JLabel("Rate of Interest (%):");
        rateField = new JTextField();

        JLabel timeLabel = new JLabel("Time (years):");
        timeField = new JTextField();

        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        calculateButton.addActionListener(this);
        resetButton.addActionListener(this);

        resultLabel = new JLabel("Simple Interest: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add components
        add(principalLabel);
        add(principalField);
        add(rateLabel);
        add(rateField);
        add(timeLabel);
        add(timeField);
        add(calculateButton);
        add(resetButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double principal = Double.parseDouble(principalField.getText());
                double rate = Double.parseDouble(rateField.getText());
                double time = Double.parseDouble(timeField.getText());

                if (principal < 0 || rate < 0 || time < 0) {
                    JOptionPane.showMessageDialog(this, "Enter valid positive numbers!");
                    return;
                }

                double si = (principal * rate * time) / 100.0;
                resultLabel.setText("Simple Interest: " + String.format("%.2f", si));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numeric values!");
            }
        } else if (e.getSource() == resetButton) {
            // Clear fields
            principalField.setText("");
            rateField.setText("");
            timeField.setText("");
            resultLabel.setText("Simple Interest: ");
        }
    }

    public static void main(String[] args) {
        new InterestCalculator();
    }
}
