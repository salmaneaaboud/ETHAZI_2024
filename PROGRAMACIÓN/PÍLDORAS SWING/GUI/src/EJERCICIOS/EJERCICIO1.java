package EJERCICIOS;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class EJERCICIO1 extends JFrame {
    public EJERCICIO1() {
        super("My Window");

        setPreferredSize(new Dimension(450, 350));
        setLayout(null);

        //AGE

        JLabel l1 = new JLabel("Age: ");
        l1.setBounds(10, 10, 50, 20);
        getContentPane().add(l1);

        ArrayList<Integer> age = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            age.add(i);
        }
        JComboBox ageComboBox = new JComboBox(age.toArray());
        ageComboBox.setBounds(10, 40, 100, 20);
        ageComboBox.setSelectedItem(age.get(0));
        getContentPane().add(ageComboBox);



        JLabel l2 = new JLabel("Name: ");
        l2.setBounds(200, 10, 50, 20);
        getContentPane().add(l2);

        JTextField field = new JTextField(20);
        field.setBounds(200, 40, 100, 20);
        getContentPane().add( field);



        JPanel sexPanel = new JPanel();
        sexPanel.setLayout(null);
        sexPanel.setBounds(10, 70, 150, 150);
        sexPanel.setBorder(new LineBorder(Color.BLUE, 1, true));

        JLabel l3 = new JLabel("Sex: ");
        l3.setBounds(10, 10, 50, 20);
        sexPanel.add(l3);

        JRadioButton hombre = new JRadioButton("Male");
        hombre.setBounds(10, 40, 80, 20);
        sexPanel.add(hombre);

        JRadioButton mujer = new JRadioButton("Female");
        mujer.setBounds(10, 70, 100, 20);
        sexPanel.add(mujer);

        ButtonGroup group = new ButtonGroup();
        group.add(hombre);
        group.add(mujer);

        getContentPane().add(sexPanel);

        JButton save = new JButton("Save");
        save.setBounds(175, 250, 100, 30);
        getContentPane().add(save);

        pack();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new EJERCICIO1();
    }
}
