import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class CurrencyConverter extends JFrame implements ActionListener {
    JTextField amountField;
    JComboBox<String> fromCurrency, toCurrency;
    JButton convertButton;
    JLabel resultLabel;

    // Exchange rates relative to USD
    HashMap<String, Double> rates = new HashMap<>();

    public CurrencyConverter() {
        // Add some currency rates (example values)
        rates.put("USD", 1.0);       // Base currency
        rates.put("EUR", 0.92);      // 1 USD ≈ 0.92 EUR
        rates.put("INR", 83.0);      // 1 USD ≈ 83 INR
        rates.put("GBP", 0.79);      // 1 USD ≈ 0.79 GBP
        rates.put("JPY", 146.0);     // 1 USD ≈ 146 JPY

        // Frame setup
        setTitle("Currency Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel amountLabel = new JLabel("Enter Amount:");
        amountField = new JTextField();

        JLabel fromLabel = new JLabel("From Currency:");
        fromCurrency = new JComboBox<>(rates.keySet().toArray(new String[0]));

        JLabel toLabel = new JLabel("To Currency:");
        toCurrency = new JComboBox<>(rates.keySet().toArray(new String[0]));

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);

        resultLabel = new JLabel("Converted Amount: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add components
        add(amountLabel);
        add(amountField);
        add(fromLabel);
        add(fromCurrency);
        add(toLabel);
        add(toCurrency);
        add(convertButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double amount = Double.parseDouble(amountField.getText());
            String from = (String) fromCurrency.getSelectedItem();
            String to = (String) toCurrency.getSelectedItem();

            if (amount < 0) {
                JOptionPane.showMessageDialog(this, "Please enter a positive amount!");
                return;
            }

            // Convert via USD as base
            double usdAmount = amount / rates.get(from);
            double converted = usdAmount * rates.get(to);

            resultLabel.setText("Converted: " + String.format("%.2f", converted) + " " + to);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new CurrencyConverter();
    }
}
