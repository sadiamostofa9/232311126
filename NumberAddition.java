/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberAddition extends JFrame {
    private JTextField num1Field, num2Field, resultField;
    private JButton sumButton;

    public NumberAddition() {
        setTitle("Number Addition");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create UI components
        JLabel num1Label = new JLabel("Num 1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num 2:");
        num2Field = new JTextField(10);
        sumButton = new JButton("Sum");
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false); // Make result field non-editable

        // Layout components using a grid layout
        setLayout(new GridLayout(4, 2));
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(sumButton);
        add(resultLabel);
        add(resultField);

        // Add action listener to the sum button
        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int sum = num1 + num2;
                    resultField.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input");
                }
            }
        });
  
        setVisible(true);
    }

    public static void main(String[] args) {
        new NumberAddition();
    }
}

