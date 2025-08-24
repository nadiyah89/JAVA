import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VolumeCalculator extends JFrame implements ActionListener {
    JTextField lengthField, widthField, heightField;
    JButton calculateButton, resetButton;
    JLabel resultLabel;

    public VolumeCalculator() {
        // Frame setup
        setTitle("Volume Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Labels & TextFields
        JLabel lengthLabel = new JLabel("Enter Length:");
        lengthField = new JTextField();

        JLabel widthLabel = new JLabel("Enter Width:");
        widthField = new JTextField();

        JLabel heightLabel = new JLabel("Enter Height:");
        heightField = new JTextField();

        calculateButton = new JButton("Calculate");
        resetButton = new JButton("Reset");

        calculateButton.addActionListener(this);
        resetButton.addActionListener(this);

        resultLabel = new JLabel("Volume: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Adding components
        add(lengthLabel);
        add(lengthField);
        add(widthLabel);
        add(widthField);
        add(heightLabel);
        add(heightField);
        add(calculateButton);
        add(resetButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                double height = Double.parseDouble(heightField.getText());

                if (length <= 0 || width <= 0 || height <= 0) {
                    JOptionPane.showMessageDialog(this, "Please enter positive values!");
                    return;
                }

                double volume = length * width * height;
                resultLabel.setText("Volume: " + volume);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
            }
        } 
        else if (e.getSource() == resetButton) {
            lengthField.setText("");
            widthField.setText("");
            heightField.setText("");
            resultLabel.setText("Volume: ");
        }
    }

    public static void main(String[] args) {
        new VolumeCalculator();
    }
}
