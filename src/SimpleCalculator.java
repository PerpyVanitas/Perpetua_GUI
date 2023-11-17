import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JTextField lblResult;
    private JButton btnCompute;
    private JPanel jpanel;

    public SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Integer.parseInt(tfNumber1.getText());
                    float num2 = Integer.parseInt(tfNumber2.getText());
                    float result = 0;

                    switch(cbOperations.getSelectedIndex()){
                        case 0: result = num1 + num2;
                                break;
                        case 1: result = num1 - num2;
                                break;
                        case 2: result = num1 / num2;
                                break;
                        case 3: result = num1 * num2;
                                break;
                    }

                    lblResult.setText(String.format("%.2f", result));
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Not a valid input.");
                }
            }
        });

    }
    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.jpanel);
        app.setSize(800,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
