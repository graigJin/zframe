package zframe.ui.menuwest;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import zframe.Handler;

public class MenuWestItemMouseListener implements MouseListener {
    
    private Handler handler;
    private MenuItemView itemView;

    public MenuWestItemMouseListener(Handler handler, MenuItemView itemView) {
        this.handler = handler;
        this.itemView = itemView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        handler.addLog("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // IGNORE
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // IGNORE
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        itemView.setBackground(new Color(204,204,255));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        itemView.setBackground(new Color(255,255,255));
    }

}
