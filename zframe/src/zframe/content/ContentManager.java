package zframe.content;

import zframe.Handler;
import zframe.ui.logger.Logger;
import zframe.ui.mainmenubar.MainMenuBar;
import zframe.ui.menunorth.MenuNorth;
import zframe.ui.menusouth.MenuSouth;
import zframe.ui.menuwest.MenuWest;

public class ContentManager {
    
    private Handler handler;
    
    private MainMenuBar mainMenuBar;
    private MenuWest menuWest;
    private Logger logger;
    private MenuNorth menuNorth;
    private MenuSouth menuSouth;

    public ContentManager(Handler handler) {
        this.handler = handler;

    }
    
    public void init() {
        logger = new Logger(handler);
        
        mainMenuBar = new MainMenuBar(handler);
        
        menuWest = new MenuWest(handler);
        menuNorth = new MenuNorth(handler);
        menuSouth = new MenuSouth(handler);
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

    public MenuNorth getMenuNorth() {
        return menuNorth;
    }

    public MenuSouth getMenuSouth() {
        return menuSouth;
    }

}
