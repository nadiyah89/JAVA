import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DiscountCalculator extends JFrame implements ActionListener {
    JTextField priceField, discountField;
    JLabel resultLabel;
    JButton calculateButton;

    public DiscountCalculator() {
        // Frame setup
        setTitle("Discount Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Labels and input fields
        JLabel priceLabel = new JLabel("Original Price:");
        priceField = new JTextField();

        JLabel discountLabel = new JLabel("Discount (%):");
        discountField = new JTextField();

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("Final Price: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Adding components
        add(priceLabel);
        add(priceField);
        add(discountLabel);
        add(discountField);
        add(new JLabel("")); // empty cell for alignment
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double price = Double.parseDouble(priceField.getText());
            double discount = Double.parseDouble(discountField.getText());

            if (price < 0 || discount < 0 || discount > 100) {
                JOptionPane.showMessageDialog(this, "Enter valid values!");
                return;
            }

            double finalPrice = price - (price * discount / 100);
            resultLabel.setText("Final Price: " + String.format("%.2f", finalPrice));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter numbers only!");
        }
    }

    public static void main(String[] args) {
        new DiscountCalculator();
    }
}
