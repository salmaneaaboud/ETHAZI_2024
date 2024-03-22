package EJERCICIOS;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class EJERCICIO2 extends JFrame {
    public EJERCICIO2(){
        super("Test Window");
        setPreferredSize(new Dimension(650,300));
        setLayout(null);

        JLabel l1 = new JLabel("Example label");
        l1.setBounds(20,0,100,50);
        getContentPane().add(l1);

        JTextField field = new JTextField(20);
        field.setBounds(20, 60, 100, 20);
        getContentPane().add(field);


        Choice choice = new Choice();
        choice.setBounds(20, 120, 100, 75);
        choice.add("--select--");
        choice.add("Shampoo");
        choice.add("Eggs");
        choice.add("Bottles");
        getContentPane().add(choice);


        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(null);
        colorPanel.setBounds(200, 10, 150, 100);

        JRadioButton r1 = new JRadioButton("Blue");
        r1.setBounds(10, 10, 80, 20);
        colorPanel.add(r1);

        JRadioButton r2 = new JRadioButton("Black");
        r2.setBounds(10, 40, 80, 20);
        colorPanel.add(r2);

        JRadioButton r3 = new JRadioButton("Green");
        r3.setBounds(10, 70, 100, 20);
        colorPanel.add(r3);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        getContentPane().add(colorPanel);


        JPanel contenido = new JPanel();
        contenido.setBounds(350, 10, 250, 250);
        JPanel listOfFiles = new JPanel();
        listOfFiles.setLayout(new BoxLayout(listOfFiles, BoxLayout.Y_AXIS));

        JCheckBox ch1 = new JCheckBox("Apples");
        JCheckBox ch2 = new JCheckBox("Potatoes");
        JCheckBox ch3 = new JCheckBox("Carrots");
        JCheckBox ch4 = new JCheckBox("Oranges");
        listOfFiles.add(ch1);
        listOfFiles.add(ch2);
        listOfFiles.add(ch3);
        listOfFiles.add(ch4);
        listOfFiles.setPreferredSize( new Dimension(400,400));

        JScrollPane jScrollPane = new JScrollPane(listOfFiles);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setPreferredSize(new Dimension (200, 200));
        contenido.add(jScrollPane);
        getContentPane().add(contenido);

        JButton jb = new JButton("CLOSE");
        jb.setBounds(200,150,80,40);
        getContentPane().add(jb);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new EJERCICIO2();
    }
}
