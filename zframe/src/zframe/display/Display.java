package zframe.display;

import java.awt.Dimension;
import javax.swing.JFrame;
import zframe.Handler;

public class Display {
    
    private Handler handler;
    
    private String title;
    private int width, height;
    private JFrame frame;

    public Display(Handler handler, String title, int width, int height) {
        this.handler = handler;
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }
    
    private void createDisplay() {
        frame = new JFrame(title);
        frame.setSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
