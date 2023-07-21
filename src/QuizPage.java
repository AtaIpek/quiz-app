import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QuizPage {

    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;

    Font myFont = new Font("Default", Font.BOLD, 30);

    public QuizPage(QuizQuestion quizQuestion) {
        frame = new JFrame("Quiz App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        centerFrame(frame);

        textArea = new JTextArea();
        textArea.setBounds(50, 50, 300, 50);
        textArea.setFont(myFont);
        textArea.setEditable(false);
        textArea.setText("Question: " + quizQuestion.getQuestion());

        textField = new JTextField();
        textField.setBounds(50, 100, 300, 50);
        textField.setFont(myFont);

        button = new JButton();
        button.setBounds(50, 150, 300, 50);
        button.setFont(myFont);
        button.setFocusable(false);
        button.setText("Check Answer");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String answer = textField.getText();
                if (quizQuestion.checkAnswer(answer)) {
                    JOptionPane.showMessageDialog(frame, "Correct!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Incorrect!");
                }
            }
        });

        frame.add(textArea);
        frame.add(textField);
        frame.add(button);

        textArea.setVisible(true);
        textField.setVisible(true);
        button.setVisible(true);
    }

    public void show() {
        frame.setVisible(true);
    }

    private void centerFrame(JFrame frame) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width / 2 - frame.getSize().width / 2, dim.height / 2 - frame.getSize().height / 2);
    }

}
