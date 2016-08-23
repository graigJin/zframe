package zframe.ui.menusouth;

import zframe.Handler;

public class MenuSouth {
    
    private Handler handler;
    private MenuSouthView view;
    private MenuItem leftItem, rightItem;

    public MenuSouth(Handler handler) {
        this.handler = handler;
        initComponents();
    }
    
    private void initComponents() {
        view = new MenuSouthView(handler);
        
        leftItem = new MenuItem(handler, handler.getDisplay().getWrapper().getWest(), "TOGGLE WEST");
        leftItem.getView().addMouseListener(new MenuSouthItemMouseListener(handler, leftItem));
        view.getLeft().add(leftItem.getView());
        
        rightItem = new MenuItem(handler, handler.getDisplay().getWrapper().getEast(), "TOGGLE EAST");
        rightItem.getView().addMouseListener(new MenuSouthItemMouseListener(handler, rightItem));
        view.getRight().add(rightItem.getView());
    }

    public MenuSouthView getView() {
        return view;
    }

}
