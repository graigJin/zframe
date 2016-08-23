package zframe.ui.menuwest;

import zframe.Handler;

public class MenuWest {
    
    private Handler handler;
    private MenuWestView view;
    
    private String[] westCategories;

    public MenuWest(Handler handler, String[] westCategories) {
        this.handler = handler;
        this.westCategories = westCategories;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuWestView(handler);
        
        for (String s : westCategories) {
            MenuItem m = new MenuItem(handler, s);
            view.getContent().add(m.getView());
        }
    }

    public MenuWestView getView() {
        return view;
    }

}
