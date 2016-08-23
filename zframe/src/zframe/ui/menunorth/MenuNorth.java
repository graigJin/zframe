package zframe.ui.menunorth;

import zframe.Handler;

public class MenuNorth {
    
    private Handler handler;
    private MenuNorthView view;
    
    private final String[] northCategories = { "HOME", "TO DO" , "LOG" , "DOC" };

    public MenuNorth(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuNorthView(handler);
        
        for (String s : northCategories) {
            MenuItem m = new MenuItem(handler, s);
            view.getContent().add(m.getView());
        }
    }

    public MenuNorthView getView() {
        return view;
    }

}
