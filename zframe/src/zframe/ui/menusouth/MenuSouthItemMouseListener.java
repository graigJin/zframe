package zframe.ui.menusouth;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import zframe.Handler;

public class MenuSouthItemMouseListener implements MouseListener {
    
    private Handler handler;
    private MenuItem item;

    public MenuSouthItemMouseListener(Handler handler, MenuItem item) {
        this.handler = handler;
        this.item = item;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        item.toggleVisibility();
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
        item.getView().setBackground(new Color(204,204,255));
        item.getView().getlName().setFont(item.getView().getlName().getFont().deriveFont(Font.BOLD));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        item.getView().setBackground(new Color(255,255,255));
        item.getView().getlName().setFont(item.getView().getlName().getFont().deriveFont(Font.PLAIN));
    }

}
