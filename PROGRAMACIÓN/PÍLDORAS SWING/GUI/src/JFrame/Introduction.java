package JFrame;

import javax.swing.*;
import java.awt.*;

public class Introduction {
    public static void main(String[] args) {
        //1. Create the frame
        JFrame frame = new JFrame("FrameDemo");
        //2.Optional: What happens when the frame closes?
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //3. Create components and put them in the frame.
        //...create emptyLabel...
        frame.getContentPane().add(new JLabel("Hello"), BorderLayout.CENTER);
        //4. Set the frame.
        frame.pack();
        //5. Show it.
        frame.setVisible(true);
    }
}