package zframe.ui.todolist;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import zframe.Handler;

public class NewTodoMouseListener implements MouseListener {
    
    private Handler handler;
    private TodoListView view;

    public NewTodoMouseListener(Handler handler, TodoListView view) {
        this.handler = handler;
        this.view = view;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        new CreateTodo(handler, "CREATE NEW TO DO", 600, 600, view.getList()).init();
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
        view.getpNewTodo().setBackground(new Color(204,204,255));
        view.getlName().setFont(view.getlName().getFont().deriveFont(Font.BOLD));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        view.getpNewTodo().setBackground(new Color(255,255,255));
        view.getlName().setFont(view.getlName().getFont().deriveFont(Font.PLAIN));
    }

}
