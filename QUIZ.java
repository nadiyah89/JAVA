import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QUIZ extends JFrame implements ActionListener
{
JLabel questionLabel;
JRadioButton option1 , option2, option3, option4;
JButton submitButton;
ButtonGroup group;


public QUIZ()
{

setTitle("SIMPLE QUIZ APPLICATION");
setSize(400,250);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setLayout(new BorderLayout());


questionLabel = new JLabel("Q1: Which language is used for Android development?");
        questionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        questionLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        option1 = new JRadioButton("Python");
        option2 = new JRadioButton("Java");
        option3 = new JRadioButton("C++");
        option4 = new JRadioButton("Ruby");


        group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);
        group.add(option4);

        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);


        add(questionLabel, BorderLayout.NORTH);
        add(optionsPanel, BorderLayout.CENTER);
        add(submitButton, BorderLayout.SOUTH);

         setVisible(true);
    }



 @Override
    public void actionPerformed(ActionEvent e) {
        if (option2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Correct Answer! ✅");
        } else if (option1.isSelected() || option3.isSelected() || option4.isSelected()) {
            JOptionPane.showMessageDialog(this, "Wrong Answer ❌");
        } else {
            JOptionPane.showMessageDialog(this, "Please select an option!");
        }
    }

    public static void main(String[] args) {
        new QUIZ();
    }

}

