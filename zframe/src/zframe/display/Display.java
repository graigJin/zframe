package zframe.display;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import zframe.Handler;
import zframe.states.TodoState;

public class Display implements WindowListener {
    
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
        frame.addWindowListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private void populateDisplay() {
        wrapper.getEast().add(handler.getContent().getLogger().getView());
        wrapper.getNorth().add(handler.getContent().getMenuNorth().getView());
        wrapper.getSouth().add(handler.getContent().getMenuSouth().getView());
        wrapper.getWest().add(handler.getContent().getCurrentState().getMenuWest().getView());
        frame.add(wrapper);
        frame.setJMenuBar(handler.getContent().getMainMenuBar());
    }

    public UIwrapper getWrapper() {
        return wrapper;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // IGNORE
    }

    @Override
    public void windowClosing(WindowEvent e) {
        TodoState t = (TodoState) handler.getContent().getTodoState();
        t.getList().getFm().writeMapToFile("data/todo/todomap.tdm", t.getList().getTodoMap());
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // IGNORE
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // IGNORE
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // IGNORE
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // IGNORE
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // IGNORE
    }

}
