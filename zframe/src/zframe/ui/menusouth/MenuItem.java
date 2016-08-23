package zframe.ui.menusouth;

import java.awt.Component;
import zframe.Handler;

public class MenuItem {
    
    private Handler handler;
    private Component component;
    private MenuItemView view;
    private String name;

    public MenuItem(Handler handler, Component component, String name) {
        this.handler = handler;
        this.component = component;
        this.name = name;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuItemView(handler);
        view.getlName().setText(name);
    }
    
    public void toggleVisibility() {
        if (component.isVisible()) {
            component.setVisible(false);
        } else {
            component.setVisible(true);
        }
    }

    public MenuItemView getView() {
        return view;
    }

}
