import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearChecker extends JFrame {
    private JTextField tfYear;
    private JPanel jpanel;
    private JButton btnCheckYear;

    public LeapYearChecker(){

        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(tfYear.getText());

                    if (num % 4 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else if (num % 4 == 0 && num % 100 == 0 && num % 400 == 0) {
                        JOptionPane.showMessageDialog(null, "Leap year");
                    } else {
                        JOptionPane.showMessageDialog(null, "Not a leap year");
                    }
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Not a valid input.");
                }
            }
        });

    }
    public static void main(String[] args) {
        LeapYearChecker app = new LeapYearChecker();
        app.setContentPane(app.jpanel);
        app.setSize(500,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
