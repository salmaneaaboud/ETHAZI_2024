package JFrame;

import javax.swing.*;
import java.awt.*;

public class InternalFrameCreator extends JFrame {

    public InternalFrameCreator () {
        super("Internal frame creator");
        setSize(450, 400);
        Container content = getContentPane();
        JDesktopPane desktop = new JDesktopPane();
        content.add(desktop, BorderLayout.CENTER);

        for(int i=0; i<5; i++) {
            JInternalFrame frame = new JInternalFrame(("Subwindow " + i), true, true,true, true);
            frame.setLocation(i*50+10, i*50+10);
            frame.setSize(200, 150);
            frame.setBackground(Color.white);
            frame.setVisible(true);
            desktop.add(frame);
            frame.moveToFront();
        }
        setVisible(true);
    }
    public static void main(String[] args){
        InternalFrameCreator frame = new InternalFrameCreator ();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
