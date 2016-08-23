package zframe.content;

import java.awt.Component;
import zframe.Handler;
import zframe.states.DocState;
import zframe.states.HomeState;
import zframe.states.LogState;
import zframe.states.State;
import zframe.states.TodoState;
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
        
        homeState = new HomeState(handler, homeCategories);
        todoState = new TodoState(handler);
        logState = new LogState(handler, logCategories);
        docState = new DocState(handler, docCategories);
        
        setState("HOME");
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
        
        Component c = currentState.getContentView();
        handler.getDisplay().getWrapper().getCenter().removeAll();
        handler.getDisplay().getWrapper().getCenter().add(c);
        
        handler.getDisplay().getWrapper().updateUI();
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

    public State getTodoState() {
        return todoState;
    }

}
