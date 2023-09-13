package com.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame {
    //setting font
    private final Font BIGGER_FONT = new Font("monspaced", Font.PLAIN, 20);
    private final JTextField textfield;
    private final CalculatorOp op = new CalculatorOp();
    private boolean number = true;
    private String equalOp = "=";

    public Calculator() {
        textfield = new JTextField("", 12);
        textfield.setHorizontalAlignment(JTextField.RIGHT);
        textfield.setFont(BIGGER_FONT);
        ActionListener numberListener = new NumberListener();
        String buttonOrder = "1234567890 ";
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 4, 4));
        for (int i = 0; i < buttonOrder.length(); i++) {
            String key = buttonOrder.substring(i, i + 1);
            //else {
                JButton button = new JButton(key);
                button.addActionListener(numberListener);
                button.setFont(BIGGER_FONT);
                buttonPanel.add(button);
            //}
        }
        //for arithmetic operations and trigonemetric operations creating panel and layout
        ActionListener operatorListener = new OperatorListener();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 4, 4));
        String[] opOrder = {"+", "-", "*", "/", "=", "C", "sin", "cos", "log"};
        for (int i = 0; i < opOrder.length; i++) {
            JButton button = new JButton(opOrder[i]);
            button.addActionListener(operatorListener);
            button.setFont(BIGGER_FONT);
            panel.add(button);
        }
        //to organise components,to set  various layouts Jpanel is used
        JPanel pan = new JPanel();
        //creating layout on the Panel
        pan.setLayout(new BorderLayout(4, 4));
        //adding components over the Panel
        pan.add(textfield, BorderLayout.NORTH);
        pan.add(buttonPanel, BorderLayout.CENTER);
        pan.add(panel, BorderLayout.EAST);
        this.setContentPane(pan);
        //method makes the size of application
        this.pack();
        this.setTitle("Scientific Calculator");
        this.setResizable(false);
    }

    private void action() {
        number = true;
        textfield.setText("");
        equalOp = "=";
        op.setTotal("");
    }

    class OperatorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String displayText = textfield.getText();
            if (e.getActionCommand().equals("sin")) {
                //using in built math functions provided by the Math class
                textfield.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));

            } else if (e.getActionCommand().equals("cos")) {
                textfield.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));

            } else if (e.getActionCommand().equals("log")) {
                textfield.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));

            } else if (e.getActionCommand().equals("C")) {
                textfield.setText("");
            } else {
                if (number) {
                    //If the input is number then control enters here
                    action();
                    textfield.setText("");

                } else {
                    number = true;
                    if (equalOp.equals("=")) {
                        op.setTotal(displayText);
                    } else if (equalOp.equals("+")) {
                        op.add(displayText);
                    } else if (equalOp.equals("-")) {
                        op.subtract(displayText);
                    } else if (equalOp.equals("*")) {
                        op.multiply(displayText);
                    } else if (equalOp.equals("/")) {
                        op.divide(displayText);
                    }

                    textfield.setText("" + op.getTotalString());
                    equalOp = e.getActionCommand();
                }
            }
        }
    }

    class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String digit = event.getActionCommand();
            if (number) {
                textfield.setText(digit);
                number = false;
            } else {
                textfield.setText(textfield.getText() + digit);
            }
        }
    }

    public class CalculatorOp {
        private int total;

        public CalculatorOp() {
            total = 0;
        }

        public String getTotalString() {
            return "" + total;
        }

        public void setTotal(String n) {
            total = convertToNumber(n);
        }

        public void add(String n) {
            total += convertToNumber(n);
        }

        public void subtract(String n) {
            total -= convertToNumber(n);
        }

        public void multiply(String n) {
            total *= convertToNumber(n);
        }

        public void divide(String n) {
            total /= convertToNumber(n);
        }

        private int convertToNumber(String n) {
            return Integer.parseInt(n);
        }
    }
}

class SwingCalc {
    public static void main(String[] args) {
        JFrame frame = new Calculator();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

