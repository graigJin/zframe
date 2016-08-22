package zframe.display;

import java.awt.Dimension;
import javax.swing.JFrame;
import zframe.Handler;

public class Display {
    
    private Handler handler;
    
    private String title;
    private int width, height;
    private JFrame frame;
    
    private UIwrapper wrapper;
    
    public Display(Handler handler, String title, int width, int height) {
        this.handler = handler;
        this.title = title;
        this.width = width;
        this.height = height;
        initComponents();
    }
    
    public void init() {
        createDisplay();
        populateDisplay();
    }
    
    private void initComponents() {
        frame = new JFrame(title);
        wrapper = new UIwrapper(handler);
    }
    
    private void createDisplay() {
        frame.setSize(new Dimension(width, height));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void populateDisplay() {
        wrapper.getWest().add(handler.getContent().getMenuWest().getView());
        wrapper.getEast().add(handler.getContent().getLogger().getView());
        wrapper.getNorth().add(handler.getContent().getMenuNorth().getView());
        wrapper.getSouth().add(handler.getContent().getMenuSouth().getView());
        
        frame.add(wrapper);
        
        frame.setJMenuBar(handler.getContent().getMainMenuBar());
    }

    public UIwrapper getWrapper() {
        return wrapper;
    }

}
