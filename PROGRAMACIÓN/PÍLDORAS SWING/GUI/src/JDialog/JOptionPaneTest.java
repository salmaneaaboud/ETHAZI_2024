package JDialog;

import javax.swing.*;

public class JOptionPaneTest {

    JFrame f;

    public JOptionPaneTest(){
        f=new JFrame();
        JOptionPane.showMessageDialog(null, "Warning","Alert",JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        new JOptionPaneTest();
    }
}
