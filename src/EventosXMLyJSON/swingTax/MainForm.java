package EventosXMLyJSON.swingTax;

import javax.swing.*;

public class MainForm {
    private JTextPane pricePane;
    private JTextPane taxPane;
    private JTextPane totalPane;
    private JButton calcularButton;
    private JPanel taxPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new MainForm().taxPane);
        frame.setVisible(true);
    }
}
