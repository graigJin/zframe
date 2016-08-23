package zframe.states; 

import javax.swing.JPanel;
import zframe.Handler; 
import zframe.ui.menuwest.MenuWest;

public class HomeState extends State {
    
    private Handler handler;
    private String[] categories;
    private MenuWest menuWest;
    private JPanel panel;

    public HomeState(Handler handler, String[] categories) {
        super(handler);
        this.handler = handler;
        this.categories = categories;
        initComponents();
    }
    
    private void initComponents() {
        menuWest = new MenuWest(handler, categories);
        panel = new JPanel();
    }

    public MenuWest getMenuWest() {
        return menuWest;
    }

    @Override
    public JPanel getContentView() {
        return panel;
    }
    
 } 


