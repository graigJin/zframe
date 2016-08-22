package zframe.content;

import zframe.Handler;
import zframe.display.State;
import zframe.ui.logger.Logger;
import zframe.ui.mainmenubar.MainMenuBar;
import zframe.ui.menunorth.MenuNorth;
import zframe.ui.menusouth.MenuSouth;

public class ContentManager {
    
    private Handler handler;
    
    private MainMenuBar mainMenuBar;
    private Logger logger;
    private MenuNorth menuNorth;
    private MenuSouth menuSouth;
    
    private State homeState, todoState, logState, docState, currentState;
    
    private String[] homeCategories = { "HOME" };
    private String[] todoCategories = { "TO DO" };
    private String[] logCategories = { "LOG" };
    private String[] docCategories = { "DOC" };

    public ContentManager(Handler handler) {
        this.handler = handler;
    }
    
    public void init() {
        logger = new Logger(handler);
        mainMenuBar = new MainMenuBar(handler);
        menuNorth = new MenuNorth(handler);
        menuSouth = new MenuSouth(handler);
        
        homeState = new State(handler, homeCategories);
        todoState = new State(handler, todoCategories);
        logState = new State(handler, logCategories);
        docState = new State(handler, docCategories);
        
        currentState = homeState;
    }
    
    public void setState(String newState) {
        switch(newState) {
            case "HOME":
                currentState = homeState;
                break;
            case "TO DO":
                currentState = todoState;
                break;
            case "LOG":
                currentState = logState;
                break;
            case "DOC":
                currentState = docState;
                break;
        }
        handler.getDisplay().getWrapper().getWest().removeAll();
        handler.getDisplay().getWrapper().getWest().add(currentState.getMenuWest().getView());
        handler.getDisplay().getWrapper().getWest().updateUI();
    }

    public MainMenuBar getMainMenuBar() {
        return mainMenuBar;
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

    public State getCurrentState() {
        return currentState;
    }

}
