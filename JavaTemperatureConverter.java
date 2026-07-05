import javax.swing.*;
import java.awt.event.*;

public class JavaTemperatureConverter {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        JLabel cLabel = new JLabel("Celsius:");
        cLabel.setBounds(30, 30, 100, 30);

        JLabel fLabel = new JLabel("Fahrenheit:");
        fLabel.setBounds(30, 80, 100, 30);

        // Text Fields
        JTextField cText = new JTextField();
        cText.setBounds(130, 30, 150, 30);

        JTextField fText = new JTextField();
        fText.setBounds(130, 80, 150, 30);

        // Buttons
        JButton convertBtn = new JButton("Convert");
        convertBtn.setBounds(30, 140, 100, 30);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(140, 140, 100, 30);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(250, 140, 100, 30);

        // ================= EVENT HANDLING =================

        // Convert Button
        convertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    // If Celsius field is not empty → convert to Fahrenheit
                    if (!cText.getText().isEmpty()) {

                        double c = Double.parseDouble(cText.getText());
                        double f = (c * 9 / 5) + 32;

                        fText.setText(String.valueOf(f));
                    }

                    // If Fahrenheit field is not empty → convert to Celsius
                    else if (!fText.getText().isEmpty()) {

                        double f = Double.parseDouble(fText.getText());
                        double c = (f - 32) * 5 / 9;

                        cText.setText(String.valueOf(c));
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input");
                }
            }
        });

        // Clear Button
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cText.setText("");
                fText.setText("");
            }
        });

        // Exit Button
        exitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // closes window
            }
        });

        // Add to Frame
        frame.add(cLabel);
        frame.add(fLabel);
        frame.add(cText);
        frame.add(fText);
        frame.add(convertBtn);
        frame.add(clearBtn);
        frame.add(exitBtn);

        frame.setVisible(true);
    }
}