package EJERCICIOS;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class EJERCICIO6 extends JFrame {

    public EJERCICIO6(){
        super("Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,350));
        Container p = this.getContentPane();
        p.setLayout(new GridLayout(2,2));

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        JLabel calcu = new JLabel("CALCULATOR");
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b10 = new JButton("=");
        p1.add(calcu);
        p1.add(b0);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b10);
        getContentPane().add(p1);


        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1));
        p2.add(new JLabel("RESULT: "));
        JTextArea jta = new JTextArea(30,30);
        jta.setOpaque(false);
        jta.setBackground(new Color(0, 0, 0, 0));
        jta.setBorder(new LineBorder(Color.gray,1));
        p2.add(jta);
        getContentPane().add(p2);


        JPanel p3 = new JPanel();
        p3.setLayout(new BorderLayout());
        JPanel symbols = new JPanel();
        JButton suma = new JButton("+");
        suma.setPreferredSize(new Dimension(50,50));
        JButton resta = new JButton("-");
        resta.setPreferredSize(new Dimension(50,50));
        JButton multi = new JButton("*");
        multi.setPreferredSize(new Dimension(50,50));
        JButton dividir = new JButton("/");
        dividir.setPreferredSize(new Dimension(50,50));
        symbols.add(suma);
        symbols.add(resta);
        symbols.add(multi);
        symbols.add(dividir);
        p3.add(symbols,BorderLayout.CENTER);
        getContentPane().add(p3);


        JPanel p4 = new JPanel();
        p4.setBackground(Color.GREEN);
        getContentPane().add(p4);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new EJERCICIO6();
    }
}
