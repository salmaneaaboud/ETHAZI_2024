package JDialog;

import javax.swing.*;

public class InputDialogTest {
    JFrame f;

    InputDialogTest(){
        f=new JFrame();
        String name=JOptionPane.showInputDialog(f,"Enter name");
        System.out.println(name);
    }

    public static void main(String[] args) {
        new InputDialogTest();
    }
}
