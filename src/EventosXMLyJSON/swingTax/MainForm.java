package EventosXMLyJSON.swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton calcularButton;
    private JPanel taxPanel;

    public swingTax(){
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(price.getText());
                double t = Double.parseDouble(tax.getText());

                double result = p + (p / 100 * t);
                total.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
}
