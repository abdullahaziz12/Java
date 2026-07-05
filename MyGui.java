import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class MyGui {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Wellocme");
        label.setBounds(20,20,100,30);
        JTextField field=new JTextField();
        field.setBounds(120,20,150,30);
        JTextField result=new JTextField();
        result.setBounds(120,120,200,30);
        JButton btn=new JButton("Click me");
        btn.setBounds(120,70,100,30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double celsius = Double.parseDouble(field.getText());
                double fahrenheit = celsius * (9.0/5.0) + 32;
                String results = String.valueOf(fahrenheit);
                result.setText(results+"F");
            }
        });
        frame.add(label);
        frame.add(field);
        frame.add(btn);
        frame.add(result);
        frame.setVisible(true);
    }
}
