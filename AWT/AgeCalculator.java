import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.Year;

public class AgeCalculator extends JFrame implements ActionListener {
    JTextField birthYearField;
    JButton calculateButton;
    JLabel resultLabel;

    public AgeCalculator() {
        // Frame setup
        setTitle("Age Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 2, 10, 10));

        // Components
        JLabel birthYearLabel = new JLabel("Enter Birth Year:");
        birthYearField = new JTextField();

        calculateButton = new JButton("Calculate Age");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("Your Age: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add components
        add(birthYearLabel);
        add(birthYearField);
        add(new JLabel("")); // spacer
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int birthYear = Integer.parseInt(birthYearField.getText());
            int currentYear = Year.now().getValue();

            if (birthYear <= 0 || birthYear > currentYear) {
                JOptionPane.showMessageDialog(this, "Please enter a valid birth year!");
                return;
            }

            int age = currentYear - birthYear;

            // Handle unrealistic ages
            if (age > 150) {
                JOptionPane.showMessageDialog(this, "Please enter a realistic birth year!");
                return;
            }

            resultLabel.setText("Your Age: " + age + " years");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new AgeCalculator();
    }
}

