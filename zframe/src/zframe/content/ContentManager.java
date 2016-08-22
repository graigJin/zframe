package zframe.content;

import zframe.Handler;
import zframe.ui.mainmenubar.MainMenuBar;

public class ContentManager {
    
    private Handler handler;
    
    private MainMenuBar mainMenuBar;

    public ContentManager(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        mainMenuBar = new MainMenuBar(handler);
    }

    public MainMenuBar getMainMenuBar() {
        return mainMenuBar;
    }

}
