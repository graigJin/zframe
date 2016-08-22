package zframe.content;

import zframe.Handler;
import zframe.ui.logger.Logger;
import zframe.ui.mainmenubar.MainMenuBar;
import zframe.ui.menuwest.MenuWest;

public class ContentManager {
    
    private Handler handler;
    
    private MainMenuBar mainMenuBar;
    private MenuWest menuWest;
    private Logger logger;

    public ContentManager(Handler handler) {
        this.handler = handler;

    }
    
    public void init() {
        mainMenuBar = new MainMenuBar(handler);
        menuWest = new MenuWest(handler);
        logger = new Logger(handler);
    }

    public MainMenuBar getMainMenuBar() {
        return mainMenuBar;
    }

    public MenuWest getMenuWest() {
        return menuWest;
    }

    public Logger getLogger() {
        return logger;
    }

}
