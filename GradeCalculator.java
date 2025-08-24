import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCalculator extends JFrame implements ActionListener {
    JTextField[] marksFields = new JTextField[5];
    JButton calculateButton;
    JLabel resultLabel;

    public GradeCalculator() {
        // Frame setup
        setTitle("Grade Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 2, 10, 10));

        // Input fields for 5 subjects
        for (int i = 0; i < 5; i++) {
            add(new JLabel("Marks for Subject " + (i + 1) + ":"));
            marksFields[i] = new JTextField();
            add(marksFields[i]);
        }

        calculateButton = new JButton("Calculate Grade");
        calculateButton.addActionListener(this);

        resultLabel = new JLabel("Average & Grade: ");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

        // Empty placeholder to align button
        add(new JLabel(""));
        add(calculateButton);
        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double sum = 0;
            for (int i = 0; i < 5; i++) {
                double marks = Double.parseDouble(marksFields[i].getText());

                if (marks < 0 || marks > 100) {
                    JOptionPane.showMessageDialog(this, 
                        "Marks should be between 0 and 100 (Subject " + (i + 1) + ")");
                    return;
                }
                sum += marks;
            }

            double average = sum / 5;
            String grade;

            if (average >= 90) grade = "A";
            else if (average >= 75) grade = "B";
            else if (average >= 60) grade = "C";
            else if (average >= 40) grade = "D";
            else grade = "F";

            resultLabel.setText("Average: " + String.format("%.2f", average) + " | Grade: " + grade);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric marks!");
        }
    }

    public static void main(String[] args) {
        new GradeCalculator();
    }
}
