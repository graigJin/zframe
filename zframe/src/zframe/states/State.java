package zframe.states; 

import zframe.Handler;
import zframe.ui.menuwest.MenuWest;

public abstract class State { 
    
    private Handler handler;

    public State(Handler handler) {
        this.handler = handler;
    }
    
    public abstract MenuWest getMenuWest();
    
    public abstract <T> T getContentView();
        
} 


