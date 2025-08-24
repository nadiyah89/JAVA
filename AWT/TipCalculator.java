import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipCalculator extends JFrame implements ActionListener {
    JTextField billField;
    JComboBox<String> tipPercentBox;
    JButton calculateButton;
    JLabel resultLabel;

    public TipCalculator() {
        // Frame setup
        setTitle("Tip Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Components
        JLabel billLabel = new JLabel("Bill Amount:");
        billField = new JTextField();

        JLabel tipLabel = new JLabel("Tip Percentage:");
        String[] tips = {"10%", "15%", "20%", "25%"};
        tipPercentBox = new JComboBox<>(tips);

        calculateButton = new JButton("Calculate Tip");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("Tip Amount: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Add components to frame
        add(billLabel);
        add(billField);
        add(tipLabel);
        add(tipPercentBox);
        add(new JLabel("")); // spacer
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double bill = Double.parseDouble(billField.getText());
            String selectedTip = (String) tipPercentBox.getSelectedItem();
            int percent = Integer.parseInt(selectedTip.replace("%", ""));

            double tipAmount = bill * percent / 100.0;
            resultLabel.setText("Tip Amount: " + String.format("%.2f", tipAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid bill amount!");
        }
    }

    public static void main(String[] args) {
        new TipCalculator();
    }
}
