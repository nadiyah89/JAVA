import javax.swing.*;
import java.awt.event.*;

public class SimpleQuiz {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Quiz");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel question = new JLabel("Which language is used for Android?");
        question.setBounds(20, 20, 300, 20);
        frame.add(question);

        // Radio buttons
        JRadioButton r1 = new JRadioButton("Python");
        r1.setBounds(20, 50, 100, 20);
        JRadioButton r2 = new JRadioButton("Java");
        r2.setBounds(20, 70, 100, 20);
        JRadioButton r3 = new JRadioButton("C++");
        r3.setBounds(20, 90, 100, 20);
        JRadioButton r4 = new JRadioButton("Ruby");
        r4.setBounds(20, 110, 100, 20);

        // Group buttons
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2); bg.add(r3); bg.add(r4);

        frame.add(r1); frame.add(r2); frame.add(r3); frame.add(r4);

        // Button
        JButton submit = new JButton("Submit");
        submit.setBounds(20, 140, 100, 25);
        frame.add(submit);

        // Action
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (r2.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Correct Answer!");
                } else if (r1.isSelected() || r3.isSelected() || r4.isSelected()) {
                    JOptionPane.showMessageDialog(frame, "Wrong Answer!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select an option!");
                }
            }
        });

        frame.setVisible(true);
    }
}
