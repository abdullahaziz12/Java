
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setTitle("My First gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("Wellcome");
        label.setBounds(20, 20, 100, 30);
        JTextField field=new JTextField();
        field.setBounds(120,20,150,30);
        JTextField result=new JTextField();
        result.setBounds(120,120,200,30);
        JButton btn=new JButton("Click me");
        btn.setBounds(120,70,100,30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name=field.getText();
                result.setText(name);
            }
        });
        frame.add(label);
        frame.add(btn);
        frame.add(field);
        frame.add(btn);
        frame.add(result);
        frame.setVisible(true);
    }
}
