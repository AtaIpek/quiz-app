import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QuizPage {

    private JFrame frame;
    private JTextField textField;
    private JButton button = new JButton();
    private JButton button2 = new JButton();

    Font myFont = new Font("Default", Font.BOLD, 30);

    public QuizPage() {
        frame = new JFrame("Quiz App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        System.out.println("QuizPage constructor called");

        button.setBounds(50, 100, 300, 50);
        button.setFont(myFont);
        button.setFocusable(false);
        button.setText("Click me!");

        button2.setBounds(100, 200, 300, 50);
        button2.setFont(myFont);
        button2.setFocusable(false);
        button2.setText("Click me!");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) screenSize.getWidth();
        int y = (int) screenSize.getHeight();
        int width = 500;
        int height = 500;

        frame.setBounds(x / 2 - width / 2, y / 2 - height / 2, width, height);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        };

        button.addActionListener(actionListener);
        button2.addActionListener(actionListener);

        frame.add(textField);
        frame.add(button);
        frame.add(button2);
    }

}
