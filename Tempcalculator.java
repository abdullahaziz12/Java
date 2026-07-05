import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tempcalculator {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Temperature Calculator");
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Label
        JLabel clabel=new JLabel("Celsius");
        clabel.setBounds(30, 30, 100, 30);
        JLabel flabel=new JLabel("Farenhite");
        flabel.setBounds(30, 80, 100, 30);
        //textfield
        JTextField cfield=new JTextField();
        cfield.setBounds(130, 30, 150, 30);
        JTextField Ffield=new JTextField();
        Ffield.setBounds(130, 80, 150, 30);
        //buttons
        JButton Convertor=new JButton("Conert");
        Convertor.setBounds(30, 140, 100, 30);
        JButton clear=new JButton("Clear");
        clear.setBounds(140, 140, 100, 30);
        //Event Hanlder
        Convertor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    if(!cfield.getText().isEmpty()){
                    double value=Double.parseDouble(cfield.getText());
                    double f = (value * 9 / 5) + 32;
                    Ffield.setText(String.valueOf(f));
                    }
                    else if(!Ffield.getText().isEmpty()){
                        double f = Double.parseDouble(Ffield.getText());
                        double c = (f - 32) * 5 / 9;
                        cfield.setText(String.valueOf(c));
                    }

                }
                 catch (Exception e1) {
                    JOptionPane.showMessageDialog(frame, "Invalid Input");
                }
                
            }
        });
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                cfield.setText("");
                Ffield.setText("");
            }
        });
        frame.add(clabel);
        frame.add(flabel);
        frame.add(cfield);
        frame.add(Ffield);
        frame.add(Convertor);
        frame.add(clear);
        frame.setVisible(true);

    }
}
