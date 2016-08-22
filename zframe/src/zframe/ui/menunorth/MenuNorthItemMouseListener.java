package zframe.ui.menunorth;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import zframe.Handler;

public class MenuNorthItemMouseListener implements MouseListener {
    
    private Handler handler;
    private MenuItemView itemView;

    public MenuNorthItemMouseListener(Handler handler, MenuItemView itemView) {
        this.handler = handler;
        this.itemView = itemView;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        handler.addLog(itemView.getlName().getText() + " Click");
        handler.getContent().setState(itemView.getlName().getText());
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
        itemView.getlName().setFont(itemView.getlName().getFont().deriveFont(Font.BOLD));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        itemView.setBackground(new Color(255,255,255));
        itemView.getlName().setFont(itemView.getlName().getFont().deriveFont(Font.PLAIN));
    }

}
