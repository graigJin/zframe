package zframe.ui.menunorth;

import zframe.Handler;

public class MenuNorth {
    
    private Handler handler;
    private MenuNorthView view;

    public MenuNorth(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuNorthView(handler);
        
        for (int i = 0; i < 5; i++) {
            MenuItem m = new MenuItem(handler, "Item " + i);
            view.getContent().add(m.getView());
        }
    }

    public MenuNorthView getView() {
        return view;
    }

}
