import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame {
    private JCheckBox cBurger;
    private JRadioButton rbNone;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JPanel jpanel;
    public FoodOrderingSystem(){

        JCheckBox[] cbFoods = {cBurger,cFries,cPizza,cTea,cSoftDrinks,cSundae};
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float total = 0;
                for (JCheckBox cb : cbFoods) {
                    if (cb.isSelected()) {
                        if (cb == cPizza) {
                            total += 100;
                        }
                        if (cb == cBurger) {
                            total += 80;
                        }
                        if (cb == cFries) {
                            total += 65;
                        }
                        if (cb == cSoftDrinks) {
                            total += 55;
                        }
                        if (cb == cTea) {
                            total += 50;
                        }
                        if (cb == cSundae) {
                            total += 40;
                        }
                    }

                }
                if (rbNone.isSelected()) {
                    total = total;
                } else if (rb5.isSelected()) {
                    total = total * 0.95f;
                } else if (rb10.isSelected()) {
                    total = total * 0.90f;
                } else {
                    total = total * 0.85f;
                }

                if (total == 0) {
                    JOptionPane.showMessageDialog(null, "You did not buy anything." );
                } else {
                    JOptionPane.showMessageDialog(null, "The total price is Php " + String.format("%.2f", total));
                }
            }
        });
    }
    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.jpanel);
        app.setSize(500,400);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}

