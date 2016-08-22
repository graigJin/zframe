package zframe.ui.menuwest;

import zframe.Handler;

public class MenuWest {
    
    private Handler handler;
    
    private MenuWestView view;

    public MenuWest(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuWestView(handler);
        
        for (int i = 0; i < 21; i++) {
            MenuItem m = new MenuItem(handler, "Item " + i);
            view.getContent().add(m.getView());
        }
    }

    public MenuWestView getView() {
        return view;
    }

}
