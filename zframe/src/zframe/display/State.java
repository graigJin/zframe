package zframe.display; 

import zframe.Handler;
import zframe.ui.menuwest.MenuWest;

public class State { 
    
    private Handler handler;
    private MenuWest menuWest;
    private String[] westCategories;

    public State(Handler handler, String[] westCategories) {
        this.handler = handler;
        this.westCategories = westCategories;
        initComponents();
    }
    
    private void initComponents() {
        if (westCategories != null)
            menuWest = new MenuWest(handler, westCategories);
    }

    public MenuWest getMenuWest() {
        return menuWest;
    }
    
} 


