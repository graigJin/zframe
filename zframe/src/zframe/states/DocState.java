package zframe.states; 

import zframe.Handler; 
import zframe.ui.menuwest.MenuWest;

public class DocState extends State {
    
    private Handler handler;
    private String[] categories;
    private MenuWest menuWest;

    public DocState(Handler handler, String[] categories) {
        super(handler);
        this.handler = handler;
        this.categories = categories;
        initComponents();
    }
    
    private void initComponents() {
        menuWest = new MenuWest(handler, categories);
    }

    public MenuWest getMenuWest() {
        return menuWest;
    }
    
 } 


