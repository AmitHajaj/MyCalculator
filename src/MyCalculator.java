import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *This a simple calculator program.
 * To this time(20.02.2021) it only has the 4 simple arithmetic operations.
 *
 * Created by Amit Hajaj.
 */
public class MyCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    boolean isDiv = false;

    // GUI components.
    private JPanel MyCalculator;
    private JFormattedTextField formattedTextField1;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton xButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button2;
    private JButton button3;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton cButton;

    /**
     * Action listeners for the GUI components.
     */
    public MyCalculator() {
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "0");
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "1");

            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "2");

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "3");

            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "4");

            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "5");

            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "6");

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "7");

            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "8");

            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + "9");

            }
        });

        // Arithmetic operations

        //Addition
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator("+");

            }
        });

        //Subtraction
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator("-");

            }
        });

        //Division
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator("/");

            }
        });

        //Multiplication
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator("*");

            }
        });

        //Clear field
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText("0");
                total1 = total2 = 0;
            }
        });

        /**
         * The equal button is the main logical function.
         *
         */
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(math_operator)
                {
                    case '+':
                        total2 = total1 + Double.parseDouble(formattedTextField1.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(formattedTextField1.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(formattedTextField1.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(formattedTextField1.getText());
                        break;

                }
                formattedTextField1.setText(""+total2);
                total1 = 0;

            }
        });
        //Decimal point
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                formattedTextField1.setText(formattedTextField1.getText() + ".");
            }
        });
    }
    private void getOperator(String op)
    {
        math_operator = op.charAt(0);
        total1 = total1 + Double.parseDouble(formattedTextField1.getText());
        formattedTextField1.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().MyCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
