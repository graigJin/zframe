package zframe.ui.menuwest;

import zframe.Handler;

public class MenuItem {
    
    private Handler handler;
    private MenuItemView view;
    private String name;

    public MenuItem(Handler handler, String name) {
        this.handler = handler;
        this.name = name;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuItemView(handler);
        view.addMouseListener(new MenuWestItemMouseListener(handler, view));
        view.getlName().setText(name);
    }

    public MenuItemView getView() {
        return view;
    }

}
